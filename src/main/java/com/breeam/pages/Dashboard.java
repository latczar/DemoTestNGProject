package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class Dashboard extends CommonFunctions {
	
	String pageName = this.getClass().getSimpleName();
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement dashboardButton;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement ancelButton;

	public Dashboard() {
		super();
		PageFactory.initElements(driver, this);
	}
	
    public void testDashboardMenuButtonExistsAfterLogin() {
        // Check if the Dashboard menu button exists after login
    	WAITFORVISIBLEELEMENT(driver, dashboardButton);
        boolean isMenuButtonExists = Dashboard.dashboardMenuButtonExists();

        // Assert that the menu button exists
        Assert.assertTrue(isMenuButtonExists);
        Extent.getTest().info("Dashboard button is visible after User Login");
    }
    
    public static boolean dashboardMenuButtonExists() {
    	try {
    		
    	WebElement dashboardMenuButton = driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
    	return dashboardMenuButton.isDisplayed();
    	} catch (org.openqa.selenium.NoSuchElementException e) {
    		return false;
    	}
    }
	
	public void clickDashboardButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, dashboardButton);
		CLICK(dashboardButton, "Dashboard menu button is clicked");
		Extent.getTest().info("Dashboard button is clicked");
	}
}