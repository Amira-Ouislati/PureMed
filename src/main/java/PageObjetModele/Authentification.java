package PageObjetModele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authentification {

	WebDriver driver;

	public Authentification(WebDriver driver) {

		this.driver = driver;

	}

	By Email = By.xpath("//input[@id='mat-input-0']");
	By MotDePasse = By.xpath("//input[@id='mat-input-1']");
	By LoginButton = By.xpath("//button[@type='submit']");

	public WebElement getEmail() {
		return driver.findElement(Email);
	}

	public WebElement getMotDePasse() {
		return driver.findElement(MotDePasse);
	}

	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
	}

}
