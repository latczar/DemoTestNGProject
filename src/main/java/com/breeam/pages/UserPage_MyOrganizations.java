package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class UserPage_MyOrganizations extends CommonFunctions{
	
	@FindBy(xpath="(//span[contains(text(),'Add an organisation')])[1]")
	static WebElement addAnOrganizationButton;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Search')]")
	static WebElement searchBox;
	
	public UserPage_MyOrganizations() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickUserPageMenuButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, addAnOrganizationButton);
		CLICK(addAnOrganizationButton, "User Page menu button is clicked");
	}

}
