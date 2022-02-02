package realtimeautomation.selenium.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features ={".//Features/LoginSample.feature"},
		glue ={"realtimeautomation.selenium.setpdefination"},
		plugin= {"pretty",
				 "html:test-output"}
		)
public class Runner {

}
