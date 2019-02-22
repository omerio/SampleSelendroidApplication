package screens_pageobject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Component.Component_Textverification;
import Component.Component_button;
import Component.Component_textVerifyWithoutLinkClick;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.Common_Utilities;

public class Selendroid_RegisterUserScreen extends ScreenBase{
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/title']")
	//@iosFindBy(xpath="//android.widget.TextView[@resource-id='android:id/title']")
	private MobileElement title;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Username']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='Username']")
	private MobileElement useerN;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputUsername']")
	//@iosFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputUsername']")
	public MobileElement useertext;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='E-Mail']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='E-Mail']")
	private MobileElement email;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputEmail']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='Username']")
	public MobileElement emailText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Password']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='Password']")
	private MobileElement passW;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputPassword']")
	//@iosFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputEmail']")
	public MobileElement passWordT;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Name']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='Name']")
	private MobileElement name;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputName']")
	//@iosFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputName']")
	public MobileElement NameT;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Programming Languge']")
	//@iosFindBy(xpath="//android.widget.TextView[@text='Programming Languge']")
	private MobileElement programmingL;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/text1']")
	//@iosFindBy(xpath="//android.widget.EditText[@resource-id='android:id/text1']")
	public MobileElement LanguageS;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='I accept adds']")
	//@iosFindBy(xpath="//android.widget.CheckBox[@text='I accept adds']")
	public MobileElement AcceptCheck;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Register User (verify)']")
	//@iosFindBy(xpath="//android.widget.Button[@text='Register User (verify)]")
	private MobileElement RegisterButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/alertTitle']")
	//@iosFindBy(xpath="//android.widget.EditText[@resource-id='android:id/alertTitle']")
	private MobileElement popupProgrammingHeader;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Java']")
	//@iosFindBy(xpath="//android.widget.CheckedTextView[@text='Java']")
	public MobileElement java;
	
	private Component_textVerifyWithoutLinkClick userScrnTitle;
	private Component_textVerifyWithoutLinkClick usernameText;
	private Component_textVerifyWithoutLinkClick emailtextverify;
	private Component_textVerifyWithoutLinkClick passwordTextVerify;
	private Component_textVerifyWithoutLinkClick nameTextVerify;
	private Component_textVerifyWithoutLinkClick progLangTextVerify;
	private Component_button progLangBtnclick;
	private Component_textVerifyWithoutLinkClick popupProgrammingHeaderText;
	private Component_Textverification selecttext;
	private Component_Textverification selectAcceptance;
	private Component_button UregisterButton;

	
	

	public Selendroid_RegisterUserScreen(AppiumDriver driver) throws IOException {
		super(driver);

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
		
		userScrnTitle= new Component_textVerifyWithoutLinkClick(title, this.getClass().getSimpleName());
		usernameText = new Component_textVerifyWithoutLinkClick(useerN, this.getClass().getSimpleName());
		emailtextverify= new Component_textVerifyWithoutLinkClick(email, this.getClass().getSimpleName());
		passwordTextVerify= new Component_textVerifyWithoutLinkClick(passW, this.getClass().getSimpleName());
		nameTextVerify= new Component_textVerifyWithoutLinkClick(name, this.getClass().getSimpleName());
		progLangTextVerify= new Component_textVerifyWithoutLinkClick(programmingL, this.getClass().getSimpleName());
		progLangBtnclick=new Component_button(LanguageS);
		popupProgrammingHeaderText= new Component_textVerifyWithoutLinkClick(popupProgrammingHeader, this.getClass().getSimpleName());
		selecttext=new Component_Textverification(java);
		selectAcceptance= new Component_Textverification(AcceptCheck);
		UregisterButton = new Component_button(RegisterButton);
		
	}
	
	public void UserregistrationtitleVerify() throws IOException{
		
		userScrnTitle.verifyTextWithoutLinkClick("selendroid-test-app");
	}
	
	public void usernameTextVerify() throws IOException{
		
		usernameText.verifyTextWithoutLinkClick("Username");
	}
	
public void emailtextverify() throws IOException{
		
	emailtextverify.verifyTextWithoutLinkClick("E-Mail");
	}

public void passwordtextverify() throws IOException{
	
	passwordTextVerify.verifyTextWithoutLinkClick("Password");
}

public void nametextVerify() throws IOException{
	
	nameTextVerify.verifyTextWithoutLinkClick("Name");
}

public void progLangTextVerify() throws IOException{
	
	progLangTextVerify.verifyTextWithoutLinkClick("Programming Languge");
}

public void proglangscrollclick(String testCaseName) throws IOException{
	
	progLangBtnclick.verify_button_click(testCaseName, this.getClass().getSimpleName());
	
}

public void popupProgrammingHeaderTextVerify() throws IOException{
	
	//MobileBy popupheader =(MobileBy) driver.findElement(By.xpath("//android.widget.TextView[@text='Programming Languge']"));
	
	popupProgrammingHeaderText.verifyTextWithoutLinkClick("Programming Languge");
}

public void selecttextandClick() throws IOException{
	
	selecttext.verifyText("Java");
}

public void selectcheckbox() throws IOException{
	
	selectAcceptance.verifyText("I accept adds");
}
public void uRegisterButtonClick(String testCaseName) throws IOException{

	UregisterButton.verify_button_click(testCaseName, this.getClass().getSimpleName());
	
}

}
