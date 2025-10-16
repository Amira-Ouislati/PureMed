package CreationNvPatient;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import PageObjetModele.Authentification;
import PageObjetModele.NvPatient;

public class NewPatient extends Base {
	

	    @Test
	    public void testCreatePatient() throws InterruptedException { 

	    	NvPatient pt = new NvPatient(driver);

	        Authentification hp = new Authentification(driver);

			WebElement getinputemail = hp.getEmail();
			getinputemail.sendKeys("amira.ouislati@gmail.com");

			WebElement getinputpass = hp.getMotDePasse();
			getinputpass.sendKeys("neAmira13611146@");

			WebElement Button = hp.getLoginButton();
			Button.click();

	        WebElement getnvpatient = pt.getpatient();
	        getnvpatient.click();

	        WebElement getprenom = pt.getPrenom();
	        getprenom.sendKeys("foulen");

	        WebElement getnom = pt.getNom();
	        getnom.sendKeys("ben foulen");
	        
	        WebElement getbirth = pt.getBirth();
	        getbirth.click();
	        
	        
	        WebElement monthDropdown = driver.findElement(By.xpath("//select[@title='Select month']"));
	        monthDropdown.click();
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value='1';", monthDropdown);
	      

	        WebElement yearDropdown = driver.findElement(By.xpath("//select[@title='Select year']"));
	        yearDropdown.click();
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value='2004';", yearDropdown);

	       
	        WebElement day = driver.findElement(By.xpath("//div[@class='btn-light ng-star-inserted'][normalize-space()='2']")); 
	        day.click();
	        
	        WebElement getsexe = pt.getSexe();
	        getsexe.click();
	        
	        /*WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement getconfirm = wait
	        	    .until(ExpectedConditions.elementToBeClickable(pt.getConfirm()));
	        	getconfirm.click();*/
	        
	        WebElement getconfirm = pt.getConfirm();
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getconfirm);
	        
	        WebElement getsuivant = pt.getSuivant();
	        getsuivant.click();
	        
	        WebElement getscore = pt.getScore();
	        getscore.sendKeys("7");
	        
	        
	        WebElement question1_1 = pt.getQuestion1_1();
	        question1_1.click();
	        
	        WebElement question1_2 = pt.getQuestion1_2();
	        question1_2.click();
	        
	        
	        WebElement question1_3 = pt.getQuestion1_3();
	        question1_3.click();
	        
	        
	        WebElement question2_1 = pt.getQuestion2_1();
	        question2_1.click();
	        
	        WebElement question2_2 = pt.getQuestion2_2();
	        question2_2.click();
	        
	        
	        WebElement question2_3 = pt.getQuestion2_3();
	        question2_3.click();
	        
	        WebElement question2_4 = pt.getQuestion2_4();
	        question2_4.click();
	        
	        WebElement getnext = pt.getNext();
	        getnext.click();
	        
	        
	        WebElement getdnp1 = pt.getDNP1();
	        getdnp1.click();
	        
	        WebElement getdnp2 = pt.getDNP2();
	        getdnp2.click();
	        
	        WebElement getdnp3 = pt.getDNP3();
	        getdnp3.click();
	        
	        WebElement getdnp4 = pt.getDNP4();
	        getdnp4.click();
}
}