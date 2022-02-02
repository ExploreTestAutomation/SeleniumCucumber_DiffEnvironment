package realtimeautomation.selenium.setpdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import realtimeautomation.selenium.driverfactory.DriverFactory;
import realtimeautomation.selenium.pages.LandingPage;
import realtimeautomation.selenium.pages.LoginPage;
import realtimeautomation.selenium.utilities.BaseTest;

public class StepDefination extends BaseTest {
	DriverFactory driverfactory;
	LandingPage landingpage;
	LoginPage loginpage;
	WebDriver driver;
	
	public StepDefination() {
		
		driverfactory = PageFactory.initElements(driver, DriverFactory.class);
		
	}
	@Before
	public void LoadTestData () throws Exception {
		
		BaseTest load = new BaseTest();
		load.setupSuite();
	}   
	
	@Given("^Navigate to utest url$")
	public void navigate_to_utest_url() throws InterruptedException  {
	landingpage =	driverfactory.openUrl();
	  /*  System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.utest.com/");
	    */
	}

	@When("^Click on sign in link$")
	public void click_on_sign_in_link()  {
	  // driver.findElement(By.xpath("//a[@class='unauthenticated-nav-bar__link']")).click();;
		loginpage = landingpage.signIn();
		
	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() {
	//   driver.findElement(By.xpath("//button[@id='kc-login']")).click();
	   loginpage.loginbtn();
	}

	@Then("^validate the error message \"([^\"]*)\"$")
	public void validate_the_error_message(String testcase)  {
		
		String expected =TestDataProperties.getProperty("Utest."+testcase+"."+  profile);
         Assert.assertEquals(expected, loginpage.validateErrorMessage());

		/*
		 * WebElement ele= driver.findElement(By.
		 * xpath("//*[contains(text(),'Invalid username or password.')]")); String
		 * actual = ele.getText(); Assert.assertEquals(expected, actual);
		 */
		loginpage.quit();

	}
	
	@Given("^Enter email \"([^\"]*)\"$")
	public void enter_email(String testcase) throws InterruptedException  {
	// driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		
		String enterEmailabc =TestDataProperties.getProperty("Utest."+testcase+"."+  profile);
		
		//loginpage.enteremail(email); /............picking from step defination
		
		loginpage.enteremail(enterEmailabc);

	 Thread.sleep(5000);
	}
	
	
}
