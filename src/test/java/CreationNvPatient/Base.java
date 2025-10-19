package CreationNvPatient;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;

	@BeforeMethod
	public void setup1() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amira\\Desktop\\Testing\\Formation Professionnel Manuel + Auto\\Auto\\Pratique\\Formation AUTO Selenium - DATA\\2025\\Pilote\\chrome-win64\\chrome-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Enable implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Properties prop = new Properties();
		FileInputStream FIchier = new FileInputStream("C:\\Users\\Amira\\eclipse-workspace\\PureMed\\url.properties");

		prop.load(FIchier);
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void setup2() {
		driver.quit();
	}

	public void Imprime_Ecran() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		long a = System.currentTimeMillis();
		File destFile = new File("C:\\Users\\Amira\\Desktop\\Formation\\PureMed\\Imprime\\screen" + a + "shot.png");

		FileUtils.copyFile(srcFile, destFile);
	}

}
