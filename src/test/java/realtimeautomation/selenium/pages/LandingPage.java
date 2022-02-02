package realtimeautomation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import realtimeautomation.selenium.driverfactory.PageObjectBase;

public class LandingPage extends PageObjectBase {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	@FindBy(xpath="//a[@class='unauthenticated-nav-bar__link']")
	WebElement signin;
	
	public LoginPage signIn() {
		
		signin.click();
		
		return new LoginPage(driver);
	}
}
