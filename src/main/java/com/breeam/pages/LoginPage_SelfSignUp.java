package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class LoginPage_SelfSignUp extends CommonFunctions{
	
	//Find elements using FindBy
	
	@FindBy(xpath="(//a[normalize-space()='Sign up now'])[1]")
	static WebElement signUpNowButton;
	
	@FindBy(xpath="//input[@id='email']")
	static WebElement selfSignUpEmailAddressInput;
	
	@FindBy(xpath="//button[@class='sendButton']")
	static WebElement selfSignUpSendVerificationCode;
	
	@FindBy(xpath="//input[@class='verifyInput']")
	static WebElement selfSignUpVerificationCodeInput;
	
	@FindBy(xpath="//button[@aria-label='Verify Code']")
	static WebElement selfSignUpVerifyButton;
	
	@FindBy(xpath="//button[@aria-label='Send verification code']")
	static WebElement selfSignUpSendNewCodeButton;
	
	@FindBy(xpath="//label[@id='newPassword_label']")
	static WebElement selfSignUpNewPassword;
	
	@FindBy(xpath="//label[@id='reenterPassword_label']")
	static WebElement selfSignUpConfirmPassword;
	
	@FindBy(xpath="//label[@id='givenName_label']")
	static WebElement selfSignUpFirstNameInput;
	
	@FindBy(xpath="//input[@id='surname']")
	static WebElement selfSignUpSurnameInput;
	
	@FindBy(xpath="//input[@name='TnCs']")
	static WebElement selfSignUpTerms;
	
	@FindBy(xpath="//button[@aria-label='Create']")
	static WebElement selfSignUpCreateButton;
	
	/*
	 * Self Sign Up methods
	*/
	
	
	public LoginPage_SelfSignUp() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void UserSelfSignUp() throws Exception {
		
	//Start user self sign up in BREEAM Platform
	CLICK(LoginPage.loginButton, "Log in button clicked");
	WAITFORVISIBLEELEMENT(driver, LoginPage.enterEmail);
	
	CLICK(signUpNowButton, "Sign up button is clicked");
	WAITFORVISIBLEELEMENT(driver, selfSignUpEmailAddressInput);
	
	CLICK(selfSignUpEmailAddressInput, "Self Sign Up Email Address Input is clicked");
	Extent.getTest().info("Self Sign Up Email Address Input clicked");
	
	ENTERTEXT(selfSignUpEmailAddressInput, Constant.selfSignUpUsername);
	Extent.getTest().info("Entered email address" + Constant.selfSignUpUsername);
	
	CLICK(selfSignUpSendVerificationCode, "Self Sign Up Send Verification Code is clicked");
	Extent.getTest().info("Self Sign Up Send Verification Code field clicked");
	
	WAITFORVISIBLEELEMENT(driver, selfSignUpVerificationCodeInput);
	CLICK(selfSignUpVerificationCodeInput, "Self Sign Up Verification Code Input is clicked");
	Extent.getTest().info("Self Sign Up Verification Code Input field clicked");
	
	ENTERTEXT(selfSignUpSendVerificationCode, Constant.selfSignUpVerificationCode);
	Extent.getTest().info("Verification Code is " + Constant.selfSignUpVerificationCode);
	
	CLICK(selfSignUpVerifyButton, "Self Sign Up Verify Button is clicked");
	Extent.getTest().info("Self Sign Up Verify Button field clicked");
	
	WAITFORVISIBLEELEMENT(driver, selfSignUpNewPassword);
	CLICK(selfSignUpNewPassword, "Self Sign Up New Password is clicked");
	Extent.getTest().info("Self Sign Up New Password clicked");
	
	CLICK(selfSignUpConfirmPassword, "Self Sign Up Confirm Password is clicked");
	Extent.getTest().info("Self Sign Up Confirm Password clicked");
	
	CLICK(selfSignUpFirstNameInput, "Self Sign Up First Name Input is clicked");
	Extent.getTest().info("Self Sign Up First Name Input clicked");
	
	CLICK(selfSignUpSurnameInput, "Self Sign Up Surname Input is clicked");
	Extent.getTest().info("Self Sign Up Surname Input clicked");
	
	CLICK(selfSignUpTerms, "Self Sign Up Terms is clicked");
	Extent.getTest().info("Self Sign Up Terms field clicked");
	
	CLICK(selfSignUpCreateButton, "Self Sign Up Create Button is clicked");
	Extent.getTest().info("Self Sign Up Create Button field clicked");
	}
}