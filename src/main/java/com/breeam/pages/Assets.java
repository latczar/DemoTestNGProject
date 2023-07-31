package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class Assets extends CommonFunctions {
	
	//@FindBy(xpath="(//div[@class='headerMenu_bre-headermenu-list-link-overlay__U8ngJ'])[2]")
	@FindBy(xpath="//a[contains(text(),'Assets')]")
	static WebElement assetsButton;
	
	@FindBy(xpath="//a[contains(text(),'Asset collections')]")
	static WebElement assetCollectionsButton;
	
	@FindBy(xpath="//a[contains(text(),'Asset config')]")
	static WebElement assetConfigButton;
	
	public Assets() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssetsButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, assetsButton);
		CLICK(assetsButton, "User Page menu button is clicked");
	}
}