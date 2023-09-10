package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class Notifications extends CommonFunctions {
	
	@FindBy(xpath="(//div[@class='headerMenu_bre-headermenu-list-link-overlay__U8ngJ'])[5]")
	static WebElement userPageMenuButton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	static WebElement logoutButton;
	
	public Notifications() {
		super();
		PageFactory.initElements(driver, this);
	}
}