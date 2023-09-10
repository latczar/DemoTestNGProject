package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;

public class Assets_AssessmentsPage extends CommonFunctions {
	
	Assets assets = new Assets();
	WebElement elementToClick;
	
	/*
	 * Create Assessments page web elements
	*/
	
	@FindBy(xpath="//button[@data-testid='bre-createassesstment-creastassessment']")
	static WebElement createAssessmentButton;
	
	@FindBy(xpath="//label[contains(text(), 'Scheme version')]//following::input")
	static WebElement schemeVersionSelectionButton;
	
	@FindBy(xpath="//button[@data-testid='bre-createassesstment-cancel']")
	static WebElement cancelButton;
	
	@FindBy(xpath="(//span[@data-testid='bre-button-txt'])[6]")
	static WebElement createAnAssessmentButton;
	
	public Assets_AssessmentsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAssessmentButton() throws Exception {
		Thread.sleep(5000);
		HANDLESCROLLDOWN();
		CLICK(createAssessmentButton,"Initiated assessment creation");
	    Extent.getTest().info("Initiated assessment creation");	    
	}
	
	public void selectSchemeVersionInput(String schemeVersion) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, schemeVersionSelectionButton);
	    CLICK(schemeVersionSelectionButton, "Clicked on the scheme version dropdown - " + schemeVersion);
	    Extent.getTest().info("Clicked on the scheme version dropdown - " + schemeVersion);
	    ROBOTENTER();
	    Extent.getTest().info("Selected scheme version - " + schemeVersion);
	}
	
	public void clickCreateAnAssessmentButton() throws Exception {
		CLICK(createAnAssessmentButton, "Clicked on Create assessment button");
	    Extent.getTest().info("Successfully created an assessment");	    
	}
	
	public void assertAssetCreationToastMessage() throws Exception {
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Assessment created successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Assessment created successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Assessment created successfully toast message displayed");
	}
	
	/*
	 * Start Assessment creation after Asset creation
	*/
	
	public void createAssessmentsFromAssetDetailPage() throws Exception {
		String schemeVersion = "BREEAM New Construction International V6"; //for Building main asset type
		
		clickCreateAssessmentButton();
		selectSchemeVersionInput(schemeVersion);
		clickCreateAnAssessmentButton();
		captureScreenshot(driver, "Assessment Creation" + GETCURRENTDATE("yyyyMMddHHmmss"));
		assertAssetCreationToastMessage();
	}
}