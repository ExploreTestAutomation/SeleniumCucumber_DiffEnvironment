package realtimeautomation.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;

public  class BaseTest {
	
	protected static String profile;
	public static Properties TestDataProperties;
	public static String AppUrl;
	public static String enterEmailabc;
	
    public  void setupSuite() throws Exception {
    	
    	profile = System.getenv("ENVIRONMENT");
    	
    	if (profile == null) {
    		Assert.fail("environment varibale not set");
    		
    		
    	}
    	
    	String path = ".//TestData/";
    	
    	
    	TestDataProperties = new Properties();
    	 File testdatafile= new File (path+"TestData.properties" );
    	 FileInputStream fileInput = new FileInputStream(testdatafile);
    	 TestDataProperties.load(fileInput);
    	 fileInput.close();
    
    	 AppUrl = TestDataProperties.getProperty("Utest.url."+profile);
    	 
    	 
    }

}
