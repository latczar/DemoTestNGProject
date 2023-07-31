package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class UserPage extends CommonFunctions {
	
	@FindBy(xpath="(//a[@class='headerMenu_bre-headermenu-list-link__YVmQy'])[6]")
	static WebElement userPageMenuButton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	static WebElement logoutButton;

	@FindBy(xpath="//a[contains(text(),'My organizations')]")
	static WebElement myOrganizationsButton;

	@FindBy(xpath="//a[contains(text(),'Preferences')]")
	static WebElement preferencesButton;

	@FindBy(xpath="//a[contains(text(),'Stop impersonating')]")
	static WebElement stopImpersonatingButton;
	
	public UserPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickUserPageMenuButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, userPageMenuButton);
		CLICK(userPageMenuButton, "User Page menu button is clicked");
	}
	
	public void clickLogoutButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, userPageMenuButton);
		CLICK(logoutButton, "Logout button is clicked");
	} 
	
	public void clickMyOrganizationsButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, userPageMenuButton);
		CLICK(myOrganizationsButton,"My organizations menu button is clicked");
	} 
	
	public void clickUserPreferencesButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, userPageMenuButton);
		CLICK(preferencesButton,"Preferences menu button is clicked");
	} 
	
	public void clickStopImpersonatingButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, userPageMenuButton);
		CLICK(stopImpersonatingButton,"Stop impersonating button is clicked");
	} 
}
