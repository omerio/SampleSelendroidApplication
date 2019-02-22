package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import io.appium.java_client.AppiumDriver;



/*  This class we are using to define the Android capabilities to invoke Android emulator, also we are Initiating the Appium driver to invoke the driver*/
public class Common_Utilities {
	
	public static Properties prop=new Properties();
	public static Properties testData=new Properties();
	public static Properties testDatapageobj=new Properties();
	public static DesiredCapabilities cap = new DesiredCapabilities();
	public static AppiumDriver driver;

	
	public static void loadconfigproperties(String propertyfilename) throws IOException{
		
		/*-------Loading the properties file--------*/
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/properties/"+propertyfilename);
		prop.load(fis);
		
String platform_name = prop.getProperty("platform.name");
		
		if(platform_name.equals("android")){
			
			Androidcapabilities();
			
		}
		else{
			IOScapabilities();
		}

	}

	public static List<String[]> readAllDataAtOnce() 
	{ 
		
		// reading data from CSV file by using OPENCSV
		List<String[]> allData =null;
	    try { 
	        
	    	File f= new File(System.getProperty("user.dir")+"/src/test/java/userregistrationdata.csv");
	        FileReader filereader = new FileReader(f); 
	  
	        // create csvReader object and skip first Line 
	        CSVReader csvReader = new CSVReaderBuilder(filereader) 
	                                  .withSkipLines(1) 
	                                  .build(); 
	         allData = csvReader.readAll(); 
	  
	        // print Data 
	        for (String[] row : allData) { 
	            for (String cell : row) { 
	                System.out.print(cell + "\t"); 
	            } 
	            System.out.println(); 
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return  allData;
	} 
		
	

	
public static void IOScapabilities(){
	
	cap.setCapability("automationName", prop.getProperty("automation.name"));
	cap.setCapability("UDID", prop.getProperty("udid"));
	//cap.setCapability("browserName", prop.getProperty("browser.name"));
	cap.setCapability("deviceName", prop.getProperty("device.name"));
	cap.setCapability("platformName", prop.getProperty("platform.name"));
	cap.setCapability("deviceOrientation", prop.getProperty("device.orientation"));
	//cap.setCapability(MobileCapabilityType.APP, Common_Utilities.application_app);
	cap.setCapability("bundleId","com.intuit.quickencompanion.ios");
    //cap.setCapability("app", "Users/kdas/Documents/workspace/Sample_Selendroid_Application_Automation2/src/test/java/selendroid-test-app-0.17.0.apk");
    //Here we have to provide IOS app path
	cap.setCapability("appPackage","com.quicken.qm2014");
	cap.setCapability("appActivity","com.quicken.qm2014.MainActivity");
	
	
		
	}

public static void Androidcapabilities(){
	
	cap.setCapability("deviceName", prop.getProperty("device.name"));
	cap.setCapability("platformName", prop.getProperty("platform.name"));
	Common_Utilities.log("/-----Log for Android Capabilities-----/");
	System.out.println("*******************");
	System.out.println(prop.getProperty("platform.name"));
	Common_Utilities.log("/-----Log for Android Capabilities-----/");
	System.out.println("*******************");
	/*----Screen rotation handled---*/
	cap.setCapability("deviceOrientation", prop.getProperty("device.orientation"));
	cap.setCapability("platormVersion", prop.getProperty("platform.version"));
	cap.setCapability("noReset", true);
	cap.setCapability("fullreset", false);
	cap.setCapability("NewCommandTimeOut", 60);
	cap.setCapability("app", "Users/kdas/Documents/workspace/Sample_Selendroid_Application_Automation2/src/test/java/selendroid-test-app-0.17.0.apk");
	//cap.setCapability("app", "Users/kdas/Documents/workspace/Ebay_Android_Application_Automation/src/test/java/Flipkart.apk");
		
}

public static void log(String message){
	Logger log = Logger.getLogger(Common_Utilities.class);
	log.debug(message);
}

public static AppiumDriver getDriver() throws MalformedURLException{
	
	//driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	
}

}
