package com.breeam.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import base.CommonFunctions;
import reporting.Extent;
import reporting.TestListener;
import util.Constant;
import util.Credentials;
import util.CredsConfigFile;

public class LoginPage extends CommonFunctions{
		
	//Find elements using @FindBy
	@FindBy(xpath="(//button[@class='button_bre-button__Lrs2h heroCard_bre-herocard-btn__AXShp primary button_large__MPEr5'])[1]")
	static WebElement loginButton;
		
	@FindBy(xpath="//input[contains(@placeholder,'Email Address')]")
	static WebElement enterEmail;
	
	@FindBy(xpath="//input[contains(@placeholder,'Password')]")
	static WebElement enterPassword;
	
	@FindBy(xpath="(//button[contains(text(),'Sign in')])[1]")
	static WebElement breSignInButton;
	
	@FindBy(xpath="(//button[contains(text(),'Sign in')])[2]")
	static WebElement signInButton;
	
	@FindBy(xpath="(//a[contains(text(), 'Sign up now')]")
	static WebElement signUpNow;
	
	@FindBy(xpath="(//input[@type='email']")
	static WebElement breEmailButton;
	
	@FindBy(xpath="(//input[@type='passwd']")
	static WebElement brePasswordButton;
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void BRELogin() throws Exception {	
		CLICK(loginButton, "Log in button clicked");
		WAITFORVISIBLEELEMENT(driver, enterEmail);
		CLICK(breSignInButton,"Sign in button clicked");
		WAITFORVISIBLEELEMENT(driver, breEmailButton);
		ENTERTEXT(breEmailButton, Constant.username);
		WAITFORVISIBLEELEMENT(driver, brePasswordButton);
		ENTERTEXT(brePasswordButton, Constant.password);
		Extent.getTest().info("Successfully logged in as " + Constant.username);
	}
		
	public void Login(String username, String password) throws Exception {		
		CLICK(loginButton, "Log in button clicked");
		WAITFORVISIBLEELEMENT(driver, enterEmail);
		ENTERTEXT(enterEmail, username);
		ENTERTEXT(enterPassword, password);
		CLICK(signInButton,"Sign in button clicked");
		Extent.getTest().info("Successfully logged in as " + username);
	}
	
	public void Login() throws Exception {
		CredsConfigFile.loadCreds();
		CLICK(loginButton, "Log in button clicked");
		WAITFORVISIBLEELEMENT(driver, enterEmail);
		ENTERTEXT(enterEmail, Constant.username);
		ENTERTEXT(enterPassword, Constant.password);
		CLICK(signInButton,"Sign in button clicked");
		Extent.getTest().info("Successfully logged in as " + Constant.username);
	}
	
	public void LoginApp() throws Exception {
		CLICK(loginButton, "Log in button clicked");
		WAITFORVISIBLEELEMENT(driver,enterEmail);		
		ENTERTEXT(enterEmail, Credentials.username);
		ENTERTEXT(enterPassword, Credentials.password);
		CLICK(signInButton,"Sign in button clicked");
		Extent.getTest().info("Successfully logged in as " + Credentials.username);
	}
}