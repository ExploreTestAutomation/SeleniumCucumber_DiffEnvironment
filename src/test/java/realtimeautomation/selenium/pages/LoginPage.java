package realtimeautomation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import realtimeautomation.selenium.driverfactory.PageObjectBase;

public class LoginPage extends PageObjectBase{
	
	WebDriver driver ;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//button[@id='kc-login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement emailfield;
	
	@FindBy (xpath="//*[contains(text(),'Invalid username or password.')]")
	WebElement errormessage;
	
	public void enteremail(String email) {
		emailfield.sendKeys(email);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}
	
	
	public String validateErrorMessage() {
		
		
		return errormessage.getText();
	}
	
	public void quit() {
		
		driver.quit();
	}
	}
	
	

