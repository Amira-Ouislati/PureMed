package CreationNvPatient;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjetModele.Authentification;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Login {

	public class TestLogin extends Base {

		DataFormatter formatter = new DataFormatter();

		@DataProvider(name = "driveTestKO")
		public Object[][] getDataKO() throws IOException {
			return getSheetData("C:\\Users\\Amira\\Desktop\\Formation\\PureMed\\Exelsheet.xlsx", 0);
		}

		@DataProvider(name = "driveTestOK")
		public Object[][] getDataOK() throws IOException {
			return getSheetData("C:\\Users\\Amira\\Desktop\\Formation\\PureMed\\Exelsheet.xlsx", 1);
		}

		@DataProvider(name = "driveTest")

		private Object[][] getSheetData(String filePath, int sheetIndex) throws IOException

		{

			FileInputStream fis = new FileInputStream(filePath);

			try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {

				XSSFSheet sheet = wb.getSheetAt(sheetIndex);

				int rowCount = sheet.getPhysicalNumberOfRows();

				XSSFRow row = sheet.getRow(0);

				int colCount = row.getLastCellNum();

				Object data[][] = new Object[rowCount - 1][colCount];

				for (int i = 0; i < rowCount - 1; i++)

				{

					row = sheet.getRow(i + 1);

					for (int j = 0; j < colCount; j++)

					{

						XSSFCell cell = row.getCell(j);

						data[i][j] = formatter.formatCellValue(cell);

					}

				}

				return data;

			}
		}

		@Test(dataProvider = "driveTestKO")
		public void Testloginko(String Email, String Password) throws InterruptedException {
			Authentification hp = new Authentification(driver);

			WebElement getinputemail = hp.getEmail();
			getinputemail.sendKeys(Email);

			WebElement getinputpass = hp.getMotDePasse();
			getinputpass.sendKeys(Password);

			WebElement Button = hp.getLoginButton();
			Button.click();
			Thread.sleep(3000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement redNotification = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//li[1]//notifier-notification[1]//p[1]")));

			// Vérifier la couleur de la notification rouge
			String backgroundColor = redNotification.getCssValue("background-color");
			String expectedColor = "#d9534f";
			Assert.assertEquals(backgroundColor, expectedColor,
					"La couleur de la notification rouge n'est pas correcte.");

		}

		@Test(dataProvider = "driveTestOK")
		public void Testloginok(String Email, String Password) throws InterruptedException {
			Authentification hp = new Authentification(driver);

			WebElement getinputemail = hp.getEmail();
			getinputemail.sendKeys(Email);

			WebElement getinputpass = hp.getMotDePasse();
			getinputpass.sendKeys(Password);

			WebElement Button = hp.getLoginButton();
			Button.click();
			Thread.sleep(3000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement greennotification = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//p[@class='notifier__notification-message']")));
			Assert.assertTrue(greennotification.isDisplayed(), "Notification element not visible");

			String backgroundColor = greennotification.getCssValue("background-color");
			String expectedColor = "#5cb85c"; // Green color
			Assert.assertEquals(backgroundColor, expectedColor, "Notification color for successful login is incorrect");
		}

	}
}
