package com.zensar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;
import util.Constant;

public class LoginPage_SelfSignUp extends CommonFunctions{
	
	//Find elements using FindBy
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
	static WebElement SelfSignUpNewPassword;
	
	@FindBy(xpath="//label[@id='reenterPassword_label']")
	static WebElement SelfSignUpConfirmPassword;
	
	@FindBy(xpath="//label[@id='givenName_label']")
	static WebElement SelfSignUpFirstNameInput;
	
	@FindBy(xpath="//input[@id='surname']")
	static WebElement SelfSignUpSurnameInput;
	
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
	WAITFORVISIBLEELEMENT(driver, selfSignUpEmailAddressInput);
	CLICK(selfSignUpEmailAddressInput, "Self Sign Up Email Address Input is clicked");
	ENTERTEXT(selfSignUpEmailAddressInput, Constant.selfSignUpUsername);
	CLICK(selfSignUpSendVerificationCode, "Self Sign Up Send Verification Code is clicked");
	WAITFORVISIBLEELEMENT(driver, selfSignUpVerificationCodeInput);
	CLICK(selfSignUpVerificationCodeInput, "Self Sign Up Verification Code Input is clicked");
	ENTERTEXT(selfSignUpSendVerificationCode, Constant.selfSignUpVerificationCode);
	CLICK(selfSignUpVerifyButton, "Self Sign Up Verify Button is clicked");
	WAITFORVISIBLEELEMENT(driver, SelfSignUpNewPassword);
	CLICK(SelfSignUpNewPassword, "Self Sign Up New Password is clicked");
	CLICK(SelfSignUpConfirmPassword, "Self Sign Up Confirm Password is clicked");
	CLICK(SelfSignUpFirstNameInput, "Self Sign Up First Name Input is clicked");
	CLICK(SelfSignUpSurnameInput, "Self Sign Up Surname Input is clicked");
	CLICK(selfSignUpTerms, "Self Sign Up Terms is clicked");
	CLICK(selfSignUpCreateButton, "Self Sign Up Create Button is clicked");
	}
}