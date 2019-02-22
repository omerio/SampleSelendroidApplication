package screens_pageobject;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Component.Component_button;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Selendroid_RegisterUser_confirmationScreen extends ScreenBase{
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Register User']")
	//@iosFindBy(xpath="//android.widget.Button[@text='Register User']")
	private MobileElement regButton;
	
	private Component_button confirmUserReg;

	public Selendroid_RegisterUser_confirmationScreen(AppiumDriver driver) {
		super(driver);
		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		confirmUserReg=new Component_button(regButton);
		
	}
	
	public void confirmUserRegistration(String testCaseName ) throws IOException{
		
		confirmUserReg.verify_button_click(testCaseName, this.getClass().getSimpleName());
	}

}
