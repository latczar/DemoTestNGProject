package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;
import reporting.Extent;

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
	    Extent.getTest().info("Clicked User Page menu button");
	}

	public void clickLogoutButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, logoutButton);
	    CLICK(logoutButton, "Logout button is clicked");
	    Extent.getTest().info("Clicked Logout button");
	}

	public void clickMyOrganizationsButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, myOrganizationsButton);
	    CLICK(myOrganizationsButton, "My organizations menu button is clicked");
	    Extent.getTest().info("Clicked My organizations menu button");
	}

	public void clickUserPreferencesButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, preferencesButton);
	    CLICK(preferencesButton, "Preferences menu button is clicked");
	    Extent.getTest().info("Clicked Preferences menu button");
	}

	public void clickStopImpersonatingButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, stopImpersonatingButton);
	    CLICK(stopImpersonatingButton, "Stop impersonating button is clicked");
	    Extent.getTest().info("Clicked Stop impersonating button");
	}
}