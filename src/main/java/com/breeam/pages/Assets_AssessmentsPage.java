package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;

public class Assets_AssessmentsPage extends CommonFunctions {
	
	Assets assets = new Assets();
	WebElement elementToClick;
	
	/*
	 * Create Assessments page web elements
	*/
	
	@FindBy(xpath="(.//*[text()[contains(.,'Scheme version')]]//following::*[@type='button'])[1]")
	static WebElement createAssessmentButton;
	
	@FindBy(xpath="//label[contains(text(), 'Scheme version')]//following::input")
	static WebElement schemeVersionSelectionButton;
	
	@FindBy(xpath="(.//*[text()[contains(.,'Scheme version')]]//following::*[@type='button'])[2]")
	static WebElement cancelButton;
	
	@FindBy(xpath="(.//*[text()[contains(.,'Headquarters of the company')]]//following::*[@type='button'])[2]")
	static WebElement createAnAssessmentButton;
	
	public Assets_AssessmentsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAnAssessmentButton() throws Exception {
		//SCROLLINTOELEMENT(createAssessmentButton);
		WAITTOBECLICKEDBYWEBELEMENT(createAnAssessmentButton);
		//ACTIONELEMENT(createAssessmentButton);
		CLICK(createAnAssessmentButton,"Initiated assessment creation");
	    Extent.getTest().info("Initiated assessment creation");	    
	}
	
	public void selectSchemeVersionInput(String schemeVersion) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, schemeVersionSelectionButton);
	    CLICK(schemeVersionSelectionButton, "Clicked on the scheme version dropdown - " + schemeVersion);
	    Extent.getTest().info("Clicked on the scheme version dropdown - " + schemeVersion);
	    ROBOTENTER();
	    Extent.getTest().info("Selected scheme version - " + schemeVersion);
	}
	
	public void clickCreateAssessmentButton() throws Exception {
		WAITTOBECLICKEDBYWEBELEMENT(createAssessmentButton);
		CLICK(createAssessmentButton, "Clicked on Create assessment button");
	    Extent.getTest().info("Successfully created an assessment");	    
	}
	
	
	/*
	 * Start Assessment creation after Asset creation
	*/
	
	public void createAssessmentsFromAssetDetailPage() throws Exception {
		String schemeVersion = "BREEAM New Construction International V6"; //for Building main asset type
		
		clickCreateAnAssessmentButton();
		selectSchemeVersionInput(schemeVersion);
		clickCreateAssessmentButton();
		captureScreenshot(driver, "Assessment Creation" + GETCURRENTDATE("yyyyMMddHHmmss"));
		assertLabelOrElementDisplayed("//label[contains(text(), 'Assessment created successfully')]",
				"//label[contains(text(), 'Assessment created successfully')]");
	}
}