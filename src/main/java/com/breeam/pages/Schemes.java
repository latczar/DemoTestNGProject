package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.CommonFunctions;

public class Schemes extends CommonFunctions {
	
	@FindBy(xpath="(//div[@class='headerMenu_bre-headermenu-list-link-overlay__U8ngJ'])[4]")
	static WebElement schemesMenuButton;
	
	@FindBy(xpath="//a[contains(text(),'Schemes config')]")
	static WebElement schemesConfigButton;
	
	@FindBy(xpath="//a[contains(text(),'Schemes library')]")
	static WebElement schemesLibraryButton;
	
	@FindBy(xpath="//a[contains(text(),'Schemes revision')]")
	static WebElement schemesRevisionButton;

}