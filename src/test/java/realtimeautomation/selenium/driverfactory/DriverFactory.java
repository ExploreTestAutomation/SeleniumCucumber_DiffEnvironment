package realtimeautomation.selenium.driverfactory;

import org.openqa.selenium.chrome.ChromeDriver;

import realtimeautomation.selenium.pages.LandingPage;
import realtimeautomation.selenium.utilities.BaseTest;

public class DriverFactory extends PageObjectBase {

	
	public  DriverFactory () 
	
	{
	super();	
		
	}
	
	public LandingPage openUrl() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
		    driver= new ChromeDriver();
		   // driver.get(AppUrl);
		    driver.get(BaseTest.AppUrl);
		    return new  LandingPage(driver);
		
	}

}
