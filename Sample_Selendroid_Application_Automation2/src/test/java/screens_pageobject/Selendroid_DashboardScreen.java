package screens_pageobject;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Component.Component_button;
import Component.Component_textVerifyWithoutLinkClick;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Selendroid_DashboardScreen extends ScreenBase {
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='EN Button']")
	//iosFindBy(Xpath="//android.widget.Button[@text='EN Button']")
	private MobileElement EnButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id='io.selendroid.testapp:id/startUserRegistration']")
	//@iosFIndBy(xpath="//android.widget.ImageButton[@resource-id='io.selendroid.testapp:id/startUserRegistration']")
	private MobileElement userB;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Show Progress Bar for a while']")
	//@iosFindBy(xpath="//android.widget.Button[@text='Show Progress Bar for a while']")
	private MobileElement progressBarButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Display Popup Window']")
	//@iosFindBy(xpath="//android.widget.Button[@text='Display Popup Window']"
	private MobileElement popup;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Waiting Dialog']")
	//@iosfindBy(xpath="//android.widget.Button[@text='Displays a Toast']")
	private MobileElement dialog;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='This will end the activity']")
	//@iosfindBy(xpath="//android.widget.TextView[@text='This will end the activity']")
	private MobileElement logoutpopT;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='I agree']")
	//@iosfindBy(xpath="//android.widget.Button[@text='I agree']")
	private MobileElement iAgreeB;
	
	private Component_button userButton;
	private Component_button endActivity;
	private Component_button progressbarVerify;
	private Component_textVerifyWithoutLinkClick dialogVerify;
	private Component_button popupWindow;
	

	public Selendroid_DashboardScreen(AppiumDriver driver) throws IOException {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		userButton = new Component_button(userB);
		endActivity= new Component_button(EnButton);
		progressbarVerify= new Component_button(progressBarButton);
		dialogVerify= new Component_textVerifyWithoutLinkClick(dialog, this.getClass().getSimpleName());
		popupWindow= new Component_button(popup);
	
	}
	
	public void userButtonclickVerify(String testCaseName ) throws IOException{
		
		userButton.verify_button_click(testCaseName, this.getClass().getSimpleName());
	}
	
	public void endactivityForUser(String testCaseName) throws IOException{
		
		endActivity.verify_button_click(testCaseName, this.getClass().getSimpleName());
		
	}
	
	public void progressBarButtonTextVerify(String testCaseName) throws IOException{
		
		progressbarVerify.verify_button_text("Show Progress Bar for a while");
		progressbarVerify.verify_button_click(testCaseName, this.getClass().getSimpleName());
		
	}
	
	public void waitingDialogVerify() throws IOException{
		
		dialogVerify.verifyTextWithoutLinkClick("Waiting Dialog");
		
	}
	
	public void windowpopupbuttonclick(String testCaseName) throws IOException{
		
		popupWindow.verify_button_click(testCaseName, this.getClass().getSimpleName());
	}
	
	
	

}
