package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Component.GenerateReport;
import base.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import screens_pageobject.Selendroid_DashboardScreen;
import screens_pageobject.Selendroid_RegisterUserScreen;
import screens_pageobject.Selendroid_RegisterUser_confirmationScreen;
import utilities.Common_Utilities;



/* This class we are using for the writing the test script only through method invocations*/
@Listeners(GenerateReport.class)
public class SampleSelendroidTest extends TestBase {
	
	
	
	@BeforeTest
	public void init() throws InterruptedException, IOException{
		
		dashBoard= new Selendroid_DashboardScreen(driver);
		confirmUser= new Selendroid_RegisterUser_confirmationScreen(driver);
		registerUser= new Selendroid_RegisterUserScreen(driver);
				
			
	}
	
	@Test
	public void test001Userregistration() throws InterruptedException, IOException{
		
		List<String[]> allData = Common_Utilities.readAllDataAtOnce();
		
		test = extent.createTest("test001Userregistration");
		//overview.logoExistence.isDisplayed();
		Common_Utilities.log("/-----Log for Testscripts-----/");
		System.out.println("Logo is displayed--Confirmed overview screen is correct");
		//overview.hamburgerMenu_click("test001OverviewScreenUIVerification");
		dashBoard.userButtonclickVerify("test001Userregistration");
		Thread.sleep(4000);
		registerUser.UserregistrationtitleVerify();
		registerUser.usernameTextVerify();
		Thread.sleep(2000);
		registerUser.useertext.sendKeys(allData.get(0)[0]);
		Thread.sleep(2000);
		registerUser.emailtextverify();
		Thread.sleep(3000);
		registerUser.emailText.sendKeys(allData.get(0)[1]);
		registerUser.passwordtextverify();
		Thread.sleep(3000);
		registerUser.passWordT.sendKeys(allData.get(0)[2]);
		registerUser.nametextVerify();
		registerUser.NameT.clear();
		Thread.sleep(3000);
		registerUser.NameT.sendKeys(allData.get(0)[3]);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		registerUser.proglangscrollclick("test001Userregistration");
		Thread.sleep(3000);
		registerUser.popupProgrammingHeaderTextVerify();
		Thread.sleep(2000);
		registerUser.selecttextandClick();
		Thread.sleep(2000);
		registerUser.selectcheckbox();
		registerUser.uRegisterButtonClick("test001Userregistration");
		Thread.sleep(4000);
		confirmUser.confirmUserRegistration("test001Userregistration");
		Thread.sleep(2000);
		
			
	}
	
	@Test
	public void test002ProgressBarHandle() throws Exception{
		
		test = extent.createTest("test002ProgressBar");
		dashBoard.progressBarButtonTextVerify("test002ProgressBar");
		dashBoard.waitingDialogVerify();
		Thread.sleep(5000);
		System.out.println("Welcome again to Dashboard");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(8000);
		driver.navigate().back();
		
		
	}

	@Test
	public void test003PopUpWindowHandle() throws InterruptedException, IOException{
		
		test = extent.createTest("test003PopUpWindow");
		dashBoard.windowpopupbuttonclick("test003PopUpWindow");
		
		// Using alert 
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(722, 1392)).perform();
		Thread.sleep(2000);
		
		//driver.navigate().ba
	}
	
	@Test
	public void test004EndActivity() throws InterruptedException, IOException{
		
		test = extent.createTest("test004EndActivity");
		Thread.sleep(3000);
		dashBoard.endactivityForUser("test004EndActivity");
		
	}	
	
	
	

	

	
	
}
