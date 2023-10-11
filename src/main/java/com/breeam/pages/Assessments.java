package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;

public class Assessments extends CommonFunctions {
	
	Assets assets = new Assets();
	WebElement elementToClick;
	
	/*
	 * Assessments page web elements
	*/
	
	@FindBy(xpath="//a[normalize-space()='Assessments']")
	static WebElement assessmentsPageButton;
	
	@FindBy(xpath="(//input[@placeholder='Search'])[1]")
	WebElement searchAssessmentsInput;
	
	@FindBy(xpath="//tbody//tr//td[1]/a")
	WebElement assessmentOne;
	
	@FindBy(xpath="//label[normalize-space()='Assessment detail - Overview']")
	WebElement assessmentDetailOverview;
	
	/*
	 * Assessments Details page web elements
	*/
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement assessmentEditButton;
		
	/*
	 * Assessments - Initial Details page web elements
	*/
	
	@FindBy(xpath="(//h3[normalize-space()='Initial details'])[1]")
	WebElement initialDetailsCollapse;
	
	@FindBy(xpath="(//span[normalize-space()='Initial details'])[1]")
	WebElement initialDetailsPage;
	
	@FindBy(xpath="(//h2[contains(text(),'Initial details')])[2]")
	WebElement headerInitialDetails;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement assessmentSaveButton;
	
	@FindBy(xpath="(//input[@placeholder='Please select'])[1]")
	WebElement technicalManualIssueNumber;
	
	@FindBy(xpath="(//input[@placeholder='Please select'])[2]")
	WebElement projectScopeDropdown;
	
	@FindBy(xpath="(//input[@placeholder='Please select'])[3]")
	WebElement buildingType;
	
	@FindBy(xpath="(//input[@placeholder='Please select'])[17]")
	WebElement healthcareBuildingInpatientAreas;

	@FindBy(xpath="(//input[@placeholder='Please select'])[18]")
	WebElement prisonBuildingAccessibility;

	@FindBy(xpath="(//span[normalize-space()='Assessment stage']//following::input)[1]")
	WebElement assessmentStage;

	@FindBy(xpath="(//span[contains(text(),'Building floor area (GIA)')]//following::input)[1]")
	WebElement buildingFloorAreaGIA;

	@FindBy(xpath="(//span[contains(text(),'Building floor area (NIFA)')]//following::input)[1]")
	WebElement buildingFloorAreaNIFA;

	@FindBy(xpath="(//span[contains(text(),'Is the building designed to be untreated?')]//following::section)[1]")
	WebElement buildingDesignUntreated;

	@FindBy(xpath="(//span[contains(text(),'Building services - heating system type')]//following::section)[1]")
	WebElement heatingSystemType;

	@FindBy(xpath="(//span[contains(text(),'Building services - cooling system type')]//following::section)[1]")
	WebElement coolingSystemType;

	@FindBy(xpath="(//span[contains(text(),'Does the building have external areas within the boundary of the assessed development?')]//following::input)[1]")
	WebElement buildingExternalAreas;

	@FindBy(xpath="(//span[contains(text(),'Are commercial or industrial-sized refrigeration and storage systems specified?')]//following::input)[1]")
	WebElement refrigerationSystemsSpecified;

	@FindBy(xpath="(//span[contains(text(),'Are building user lifts present?')]//following::section)[1]")
	WebElement buildingUserLifts;

	@FindBy(xpath="(//span[contains(text(),'Are building user escalators or moving walks present?')]//following::section)[1]")
	WebElement buildingUserEscalators;

	@FindBy(xpath="(//span[contains(text(),'Are there any water demands present other than those assessed in Wat 01?')]//following::section)[1]")
	WebElement waterDemandsPresent;

	@FindBy(xpath="(//span[contains(text(),'Are there statutory requirements, or other issues outside of the control of the project, that impact the ability to provide outdoor space')]//following::section)[1]")
	WebElement statutoryRequirementsImpact;

	@FindBy(xpath="(//span[contains(text(),'Are there any systems specified that contribute to the unregulated energy load?')]//following::section)[1]")
	WebElement unregulatedEnergyLoad;

	@FindBy(xpath="(//span[contains(text(),'Are the Post-occupancy evaluation credits targeted in Ene 01 issue?')]//following::section)[1]")
	WebElement postOccupancyEvaluationCredits;

	//Laboratories section
	
	@FindBy(xpath="(//span[contains(text(),'Are laboratories present?')]//following::section)[1]")
	WebElement laboratoriesPresent;
	
	@FindBy(xpath="(//span[contains(text(),'What % of total building area do laboratories represent?')]//following::section)[1]")
	WebElement totalAreaOfLabs;
	
	@FindBy(xpath="(//span[contains(text(),'Are there fume cupboard(s) and/or other containment devices present?')]//following::section)[1]")
	WebElement containmentDevices;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement assessmentSecondSaveButton;
	
	@FindBy(xpath="//h4[normalize-space()='Validation statement']")
	WebElement validationStatementLabel;
	
	@FindBy(xpath="//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
	WebElement validationStatementTextbox;
	
	/*
	 * Assessments - Register and Submit Assessment page web elements
	*/
	
	@FindBy(xpath="(//a[@title='Register assessment'])[1]")
	WebElement registerAssessmentMenuButton;
	
	@FindBy(xpath="//label[normalize-space()='Register assessment']")
	WebElement registerAssessmentLabel;
	
	//BREEAM Registration section
	
	@FindBy(xpath="(//input[@placeholder='Please select'])[1]")
	WebElement assessmentStageRegistration;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement numberOfDwellings;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	WebElement netFloorArea;
	
	@FindBy(xpath="(//textarea[@placeholder='Register Comment'])[1]")
	WebElement registerComment;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement registerSaveButton;
	
	@FindBy(xpath="(//input[@placeholder='Select Company name'])[1]")
	WebElement companyNameRegistration;
	
	@FindBy(xpath="(//span[normalize-space()='Invoice'])[1]")
	WebElement invoicePayment;
	
	@FindBy(xpath="(//span[normalize-space()='Credit Card'])[1]")
	WebElement creditCardPayment;
	
	@FindBy(xpath="(//input[@placeholder='Enter purchase order number'])[1]")
	WebElement purchaseOrderNumber;
	
	@FindBy(xpath="(//span[contains(text(),'Register assessment')])[2]")
	WebElement registerAssessmentButton;
	
	@FindBy(xpath="(//label[normalize-space()='Submit assessment for assessor verification'])[1]")
	WebElement submitAssessmentLabel;
	
	@FindBy(xpath="//input[@placeholder='Submit assessment for assessor verification Comments']")
	WebElement commentsSubmitAssessment;
	
	@FindBy(xpath="(//span[contains(text(),'Submit assessment')])[2]")
	WebElement submitAssessmentButton;
	
	@FindBy(xpath="//label[normalize-space()='Fast track']")
	WebElement fastTrackLabel;
	
	@FindBy(xpath="//span[normalize-space()='No']")
	WebElement noFastTrack;
		
	@FindBy(xpath="//span[normalize-space()='Yes-Fast track']")
	WebElement yesFastTrack;
	
	@FindBy(xpath="//span[normalize-space()='Yes-Fast track 24']")
	WebElement yes24FastTrack;
	
	public Assessments() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssessmentsPage() throws Exception {
		WAITFORVISIBLEELEMENT(driver, assessmentsPageButton);
		CLICK(assessmentsPageButton, "Clicked on Assessments page");
	    Extent.getTest().info("Assessments page clicked");	    
	}
	
	public void enterAssessmentName(String assessmentName) throws Exception {
		WAITFORELEMENTEXISTXPATH("//tbody//tr//td[1]/a");
	    ENTERTEXT(searchAssessmentsInput, assessmentName);
	    ROBOTENTER();
	    Extent.getTest().info("Assessment name: " + assessmentName);
	    WAITFORELEMENTEXISTXPATH("//span[contains(text(), '" + assessmentName + "')]");
	    CLICK(assessmentOne, "Clicked on the first assessment from the table");
	    Extent.getTest().info("Clicked on the first assessment from the table");
	}
	
	public void assertExemplaryCreditsAwarded() throws Exception {
		
		// Get the initial value
		WebElement element = driver.findElement(By.xpath("//h6[normalize-space()='Exemplary credits']//preceding-sibling::p"));
		String initialValue = element.getText();
	    Extent.getTest().info("Extracted text value of the respective issue's Exemplary Credits ");

		// Convert the initial value to an integer
		int initialIntValue = Integer.parseInt(initialValue.split("/")[0]);

		// Assert that the value is greater than 1
		Assert.assertTrue(initialIntValue > 1, "Value is not greater than 1.");
		Extent.getTest().info("Done Assertion of the exemplary credits awarded");
		captureScreenshot(driver, "Exemplary Credits awarded " + GETCURRENTDATE("yyyyMMddHHmmss"));
	}
	
	public void assertValidationStatementDisabled(String assessmentName) throws Exception {
		
		/*
		 * Pre-requisite - No Named Assessor for Assessment (Sample assessment - 119, Asset Assessments)
		 */
		
		clickAssessmentsPage();
		enterAssessmentName(assessmentName);
		CLICK(initialDetailsCollapse, "Collapse initial details section");
	    Extent.getTest().info("Collapse initial details section");
	    CLICK(initialDetailsPage, "Clicked on the Initial Details page");
	    Extent.getTest().info("Clicked on the Initial Details page");
	    WAITFORELEMENTEXISTXPATH("(//h2[contains(text(),'Initial details')])[2]");
	    SCROLLINTOVIEW("//h4[normalize-space()='Validation statement']");
	    Extent.getTest().info("Scrolling into the Validation Statement section");
		
		// Find the element by its XPath
		WebElement saveValidationButton = driver.findElement(By.xpath("(//span[normalize-space()='Save statement'])[1]"));
	    Extent.getTest().info("Locating Save validation button");

		// Assert that the element is disabled
		Assert.assertTrue(saveValidationButton.isEnabled(), "Element is not disabled.");
	    Extent.getTest().info("Assertion Done");
		captureScreenshot(driver, "Validation Statement is Disabled - No Named Assessor yet " + GETCURRENTDATE("yyyyMMddHHmmss"));
	}
	
	public void assertValidationStatementEnabled(String assessmentName) throws Exception {
			
			/*
			 * Pre-requisite - No Named Assessor for Assessment (Sample assessment - 167, autest123)
			 */
			
			clickAssessmentsPage();
			enterAssessmentName(assessmentName);
			CLICK(initialDetailsCollapse, "Collapse initial details section");
		    Extent.getTest().info("Collapse initial details section");
		    CLICK(initialDetailsPage, "Clicked on the Initial Details page");
		    Extent.getTest().info("Clicked on the Initial Details page");
		    WAITFORELEMENTEXISTXPATH("(//h2[contains(text(),'Initial details')])[2]");
			SCROLLINTOVIEW("//h4[normalize-space()='Validation statement']");
		    Extent.getTest().info("Scrolling into the Validation Statement section");
			
			// Find the element by its XPath
			WebElement saveValidationButton = driver.findElement(By.xpath("(//span[normalize-space()='Save statement'])[1]"));
		    Extent.getTest().info("Locating Save validation button");
		    
			// Assert that the element is enabled
			Assert.assertTrue(saveValidationButton.isEnabled(), "Element is not enabled.");
		    Extent.getTest().info("Assertion Done");
			captureScreenshot(driver, "Validation Statement is Enabled - Named Assessor added " + GETCURRENTDATE("yyyyMMddHHmmss"));
	}
		
	/*
	 * Start viewing Assessment details
	*/
	
	public void viewAssessmentDetails(String assessmentName) throws Exception {
		clickAssessmentsPage();
		enterAssessmentName(assessmentName);
		assertLabelOrElementDisplayed("//label[normalize-space()='Assessment detail - Overview']",
				"//label[normalize-space()='Assessment detail - Overview']");
		captureScreenshot(driver, "View Assessment detail page of" + assessmentName + GETCURRENTDATE("yyyyMMddHHmmss"));
	}
	
	/*
	 * Start saving issue questions for Initial Details
	*/
		
	public void savingIssueQuestionsInput(String assessmentName) throws Exception {
		
		clickAssessmentsPage();
		enterAssessmentName(assessmentName);
		assertLabelOrElementDisplayed("//label[normalize-space()='Assessment detail - Overview']",
				"//label[normalize-space()='Assessment detail - Overview']");
	    CLICK(initialDetailsCollapse, "Collapse initial details section");
	    Extent.getTest().info("Collapse initial details section");
	    CLICK(initialDetailsPage, "Clicked on the Initial Details page");
	    Extent.getTest().info("Clicked on the Initial Details page");
	    WAITFORELEMENTEXISTXPATH("(//h2[contains(text(),'Initial details')])[2]");
		
		//Scenario - populate six fields to grant credits and show the assessment can be scored
	    CLEARTEXTBOX(technicalManualIssueNumber);
		assessmentSelectDropdownInput("Issue 0.0", technicalManualIssueNumber, technicalManualIssueNumber);
		//assessmentSelectDropdownInput("Fully fitted - simple building", projectScopeDropdown, projectScopeDropdown);
		//assessmentSelectDropdownInput("Education", buildingType, buildingType);
		assessmentSelectDropdownInput("Design (interim)", assessmentStage, assessmentStage);
		SCROLLINTOVIEW("(//span[normalize-space()='Does this healthcare building have inpatient areas?']//following::input)[1]");
		ENTERTEXT(buildingFloorAreaGIA, "100");
		ENTERTEXT(buildingFloorAreaNIFA, "150");
		HANDLESCROLLUP();
		Extent.getTest().info("Show granted credits are saved");
		captureScreenshot(driver, "Show granted credits" + GETCURRENTDATE("yyyyMMddHHmmss"));
		Extent.getTest().info("Screenshot captured to show granted credits are saved");
	}
	
	public void submitAssessmentFastTrack(String assessmentName) throws Exception {
		
		clickAssessmentsPage();
		enterAssessmentName(assessmentName);
		assertLabelOrElementDisplayed("//label[normalize-space()='Assessment detail - Overview']",
				"//label[normalize-space()='Assessment detail - Overview']");
		
		//Scenario - Fast track submitted asssessments
		CLICK(registerAssessmentMenuButton, "Clicked on the Register Assessment menu button");
		Extent.getTest().info("Navigate to Register Assessment page");
		assessmentSelectDropdownInput("Post Construction Assessment", assessmentStageRegistration, assessmentStageRegistration);
		ENTERTEXT(numberOfDwellings, "50");
		ENTERTEXT(netFloorArea, "150");
		HANDLESCROLLDOWN();
		ENTERTEXT(registerComment, "automated test");
		assessmentSelectDropdownInput("111test111", companyNameRegistration, companyNameRegistration);
		CLICK(invoicePayment, "Selected invoice as payment method");
		WAITFORVISIBLEELEMENT(driver, purchaseOrderNumber);
		ENTERTEXT(purchaseOrderNumber, "auto123test");
		CLICK(registerAssessmentButton, "Clicked on register assessment");
		Extent.getTest().info("Assessment is now registered");
		WAITFORELEMENTEXISTXPATH("(//label[normalize-space()='Submit assessment for assessor verification'])[1]");
		Extent.getTest().info("In the Submit assessment page");
		HANDLESCROLLDOWN();
		CLICK(submitAssessmentButton, "Clicked on submit assessment button");
		Extent.getTest().info("Submitted the assessment for assessor verification");
		WAITFORELEMENTEXISTXPATH("//label[normalize-space()='Fast track']");
		CLICK(yesFastTrack, "Clicked on the yes fast track option");
		Extent.getTest().info("Submitted the assessment for assessor verification");
		captureScreenshot(driver, "Show selected option on fast track assessment page" + GETCURRENTDATE("yyyyMMddHHmmss"));
	}
	
	public void verifyValidationStatementInputSaved() throws Exception {
		ENTERTEXT(validationStatementTextbox, "Auto test - validation statement input");
	}
}