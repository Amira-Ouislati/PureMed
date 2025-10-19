package PageObjetModele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NvPatient {

	WebDriver driver;

	public NvPatient(WebDriver driver) {
		this.driver = driver;
	}

	By nvPatient = By.xpath("//span[@class='label_add_btn']");
	By prenom = By.cssSelector("#mat-input-2");
	By nom = By.cssSelector("#mat-input-3");
	By birth = By.cssSelector("#mat-input-4");
	By sexe = By.cssSelector("button[class='gender_btn']");
	By confirm = By.cssSelector(".consent_accepted_img_check_box");
	By suivant = By.cssSelector(".next_btn.ng-star-inserted");
	By score = By.cssSelector("#score_entry");
	By next = By.cssSelector(".next_btn");

	By question1_1 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-add-patient[1]/div[1]/div[3]/div[1]/div[1]/app-dn4[1]/app-survey[1]/app-category[1]/div[2]/app-question[1]/app-option[1]/div[1]/div[2]/button[1]");
	By question1_2 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-add-patient[1]/div[1]/div[3]/div[1]/div[1]/app-dn4[1]/app-survey[1]/app-category[1]/div[2]/app-question[1]/app-option[2]/div[1]/div[2]/button[2]");
	By question1_3 = By.xpath("//app-question[3]//button[text()='OUI']");

	By question2_1 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-dn4:nth-child(1) > app-survey:nth-child(2) > app-category:nth-child(1) > div:nth-child(2) > app-question:nth-child(2) > app-option:nth-child(2) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)");
	By question2_2 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-dn4:nth-child(1) > app-survey:nth-child(2) > app-category:nth-child(1) > div:nth-child(2) > app-question:nth-child(2) > app-option:nth-child(3) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)");
	By question2_3 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-dn4:nth-child(1) > app-survey:nth-child(2) > app-category:nth-child(1) > div:nth-child(2) > app-question:nth-child(2) > app-option:nth-child(4) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)");
	By question2_4 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-dn4:nth-child(1) > app-survey:nth-child(2) > app-category:nth-child(1) > div:nth-child(2) > app-question:nth-child(2) > app-option:nth-child(5) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)");

	By dnp1 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-pnp-condition:nth-child(1) > div:nth-child(1) > div:nth-child(2) > app-pnp-item:nth-child(1) > button:nth-child(1)");
	By dnp2 = By.cssSelector(
			"body > app-root:nth-child(1) > app-add-patient:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-pnp-condition:nth-child(1) > div:nth-child(1) > div:nth-child(2) > app-pnp-item:nth-child(2) > button:nth-child(1)n");
	By dnp3 = By.cssSelector("app-pnp-item:nth-child(3) button:nth-child(1)");
	By dnp4 = By.cssSelector("app-pnp-item:nth-child(4) button:nth-child(1)");

	public WebElement getpatient() {
		return driver.findElement(nvPatient);
	}

	public WebElement getPrenom() {
		return driver.findElement(prenom);
	}

	public WebElement getNom() {
		return driver.findElement(nom);
	}

	public WebElement getBirth() {
		return driver.findElement(birth);
	}

	public WebElement getSexe() {
		return driver.findElement(sexe);
	}

	public WebElement getConfirm() {
		return driver.findElement(confirm);
	}

	public WebElement getSuivant() {
		return driver.findElement(suivant);
	}

	public WebElement getScore() {
		return driver.findElement(score);
	}

	public WebElement getNext() {
		return driver.findElement(next);
	}

	public WebElement getQuestion1_1() {
		return driver.findElement(question1_1);
	}

	public WebElement getQuestion1_2() {
		return driver.findElement(question1_2);
	}

	public WebElement getQuestion1_3() {
		return driver.findElement(question1_3);
	}

	public WebElement getQuestion2_1() {
		return driver.findElement(question2_1);
	}

	public WebElement getQuestion2_2() {
		return driver.findElement(question2_2);
	}

	public WebElement getQuestion2_3() {
		return driver.findElement(question2_3);
	}

	public WebElement getQuestion2_4() {
		return driver.findElement(question2_4);
	}

	public WebElement getDNP1() {
		return driver.findElement(dnp1);
	}

	public WebElement getDNP2() {
		return driver.findElement(dnp2);
	}

	public WebElement getDNP3() {
		return driver.findElement(dnp3);
	}

	public WebElement getDNP4() {
		return driver.findElement(dnp4);
	}

}
