package com.zensar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class Dashboard extends CommonFunctions {
	
	String pageName = this.getClass().getSimpleName();
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement CancelButton;

	
	public Dashboard() {
		super();
		PageFactory.initElements(driver, this);
	}
}