package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.CommonFunctions;

public class Assets extends CommonFunctions {
	
	@FindBy(xpath="(//div[@class='headerMenu_bre-headermenu-list-link-overlay__U8ngJ'])[2]")
	static WebElement assetsButton;
	
	@FindBy(xpath="//a[contains(text(),'Asset collections')]")
	static WebElement assetCollectionsButton;
	
	@FindBy(xpath="//a[contains(text(),'Asset config')]")
	static WebElement assetConfigButton;

}
