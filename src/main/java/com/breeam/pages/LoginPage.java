package com.breeam.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@FindBy(xpath="//input[@id='i0116']")
	static WebElement MSemailInput;
	
	@FindBy(xpath="//input[@id='i0118']")
	static WebElement MSpasswordInput;
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void BRELogin() throws Exception {	
		CLICK(loginButton, "Log in button clicked");
		WAITFORVISIBLEELEMENT(driver, enterEmail);
		CLICK(breSignInButton,"Sign in button clicked");
		WAITFORVISIBLEELEMENT(driver, MSemailInput);
		ENTERTEXT(breEmailButton, Constant.username);
		WAITFORVISIBLEELEMENT(driver, MSpasswordInput);
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
		    try {
		        // Check if loginButton is visible and clickable
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf(loginButton));
		        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

		        CLICK(loginButton, "Log in button clicked");
		        WAITFORVISIBLEELEMENT(driver, enterEmail);
		        ENTERTEXT(enterEmail, Constant.username);
		        ENTERTEXT(enterPassword, Constant.password);
		        CLICK(signInButton, "Sign in button clicked");
		        Extent.getTest().info("Successfully logged in as " + Constant.username);
		    } catch (Exception e) {
		        Extent.getTest().info("Login process failed: " + e.getMessage());
		        // Optionally rethrow the exception or handle it as per your test requirements
		    	}
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