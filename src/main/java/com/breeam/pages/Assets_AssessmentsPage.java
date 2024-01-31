package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class Assets_AssessmentsPage extends CommonFunctions {
	
	Assets assets = new Assets();
	WebElement elementToClick;
	
	/*
	 * Create Assessments page web elements
	*/
	
	@FindBy(xpath="(.//*[text()[contains(.,'Scheme version')]]//following::*[@type='button'])[1]")
	static WebElement createAssessmentButton;
	
	@FindBy(xpath="(//input[@placeholder='Select scheme version'])[1]")
	static WebElement schemeVersionSelectionButton;
	
	@FindBy(xpath="(.//*[text()[contains(.,'Scheme version')]]//following::*[@type='button'])[2]")
	static WebElement cancelButton;
	
	@FindBy(xpath="//span[normalize-space()='Create an assessment']")
	static WebElement createAnAssessmentButton;
	
	public Assets_AssessmentsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAnAssessmentButton() throws Exception {
		WAITFORELEMENTINVISIBILITYXPATH("//label[contains(text(), 'Asset created successfully')]");
		WAITTOBECLICKEDBYWEBELEMENT(createAnAssessmentButton);
		CLICK(createAnAssessmentButton,"Initiated assessment creation");
	    Extent.getTest().info("Initiated assessment creation");	    
	}
	
	public void selectSchemeVersionInput(String schemeVersion) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, schemeVersionSelectionButton);
	    CLICK(schemeVersionSelectionButton,"clicked on the Select Scheme version button");
	    HOVERANDCLICK("span", schemeVersion);
	    Extent.getTest().info("Clicked from the scheme version dropdown - " + schemeVersion);
	    Extent.getTest().info("Selected scheme version - " + schemeVersion);
	}
	
	public void clickCreateAssessmentButton() throws Exception {
		WAITTOBECLICKEDBYWEBELEMENT(createAssessmentButton);
		CLICK(createAssessmentButton, "Clicked on Create assessment button");
	    Extent.getTest().info("Successfully created an assessment");
	    WAITFORELEMENTINVISIBILITYXPATH("(//span[@data-testid='bre-spinner'])[1]");
	}
	
	public void assertAssessmentNameDisplayed(WebDriver driver, String assessmentName) {
	    String xpath = String.format("(//p[contains(text(), '%s')])[1]", assessmentName);
	    WebElement assessmentElement = driver.findElement(By.xpath(xpath));
	    
	    if (assessmentElement.isDisplayed()) {
	        System.out.println("The assessment name '" + assessmentName + "' is displayed.");
	        Extent.getTest().info("The assessment name '" + assessmentName + "' is displayed.");
	    } else {
	    	Extent.getTest().info("The assessment name '" + assessmentName + "' is not displayed.");
	        throw new AssertionError("The assessment name '" + assessmentName + "' is not displayed.");
	    }
	}

	
	/*
	 * Start Assessment creation after Asset creation
	*/
	
	public void createAssessmentsFromAssetDetailPage(String schemeVersion) throws Exception {
		
		clickCreateAnAssessmentButton();
		selectSchemeVersionInput(schemeVersion);
		clickCreateAssessmentButton();
		captureScreenshot(driver, "Assessment Creation - " + GETCURRENTDATE("yyyyMMddHHmmss"));
		WAITFORELEMENTINVISIBILITYXPATH("(//span[@data-testid='bre-spinner'])[1]");
		assertAssessmentNameDisplayed(driver, Constant.nameOfAsset);

	}
}