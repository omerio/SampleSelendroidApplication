package base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Component.TestReports;
import io.appium.java_client.AppiumDriver;
import screens_pageobject.Selendroid_DashboardScreen;
import screens_pageobject.Selendroid_RegisterUserScreen;
import screens_pageobject.Selendroid_RegisterUser_confirmationScreen;
import utilities.Common_Utilities;

/* In this class we are setting up the driver , passing the propertiesFile, before test suit execution started
 * Also after the test suit execution we are closing the driver*/
public class TestBase extends TestReports{
	
	public  AppiumDriver driver;
	public static Selendroid_DashboardScreen dashBoard;
	public static Selendroid_RegisterUser_confirmationScreen confirmUser;
	public static Selendroid_RegisterUserScreen registerUser;
	
	
	public static String loadPropertyFile= "Test.properties";
    //public static Logger log= Logger.getLogger("devpinoyLogger");
	
	
	
	@BeforeSuite
	public void setup() throws IOException{
		//properties, desired capabilities
		
		if(driver==null){	
				Common_Utilities.loadconfigproperties(loadPropertyFile);
				Common_Utilities.log("/-----Log for driver-----/");
				driver=Common_Utilities.getDriver();	
		}
			}
	
	
	@AfterSuite
	public void teardown(){
		
		driver.quit();
	//log.debug("quiting the server");
		
	}
}
