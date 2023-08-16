package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;

public class Assets_CopyAssets extends CommonFunctions {
	
	Assets assets = new Assets();
	Assets_CreateAssetsPage createAssets = new Assets_CreateAssetsPage();
	WebElement elementToClick;
	
	@FindBy(xpath="//span[contains(text(),'Copy')]")
	WebElement copyAssetButton;
	
	@FindBy(xpath="(//h1)[2]")
	WebElement copyLabel;
	
	public Assets_CopyAssets() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCopyAsset() throws Exception {
	    CLICK(copyAssetButton, "Copy Asset button is clicked");
	    Extent.getTest().info("Copy Asset clicked");
	}
	
	public void assertCopyLabelOnPage() throws Exception {
		WAITFORELEMENTEXISTXPATH("(//h1)[2]");
        // Wait for the toast message element to be visible
        WebElement copyLabelElement = driver.findElement(By.xpath("(//h1)[2]"));
        boolean copyLabelPresent = copyLabelElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(copyLabelPresent);
        Extent.getTest().info("User successfully initiated Copy Asset operation");
	}
		
	//Start test cases copy for Assets
	
	public void copyAsset_Building() throws Exception {
		
	    String country = "United States";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Healthcare";
	    String assetSubType = "Hospital";
	    String assetSubTypeTwo = "Community and mental health hospitals";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Main Office Building";
	    String nameOfCopiedAsset = " - Copied Asset";
	    String description = "Headquarters of the company";
	    String parentAsset = "assetest123";
	    String neighbourAsset = "assetest contributor123";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Pre design";
	    String assetValue = "50000";
	    String grossExternalArea = "1200";
	    String siteArea = "5000";
	    //String assetOwningOrg = "indiaTest";
	    String plotArea = "6000";
	    String netFloorArea = "1100";
	    String assetRecord = "Asset Management Department";
	    
	    //Start Asset Creation
	    createAssets.clickOnCreateAssetsButton();
				
		/*
		 * Start input for Asset address
		*/
	    
	    createAssets.addSelectCountryInput(country);
	    createAssets.addAddressLineOneInput(addressLineOne);
	    createAssets.addAddressLineTwoInput(addressLineTwo);
	    createAssets.addTownOrCityInput(townCity);
	    createAssets.addCountryOrRegionInput(countryOrRegion);
	    createAssets.addPostalCodeInput(postalCode);
	    createAssets.addLatitudeInput(latitude);
	    createAssets.addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    createAssets.clickAndEnterAssetTypeInput(assetType);
	    createAssets.clickAndEnterAssetSubTypeInput(assetSubType);
	    createAssets.clickAndEnterAssetSubTypeTwoInput(assetSubTypeTwo);
	    createAssets.clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information
		*/
	    
	    createAssets.clickAndEnterNameOfAssetInput(nameOfAsset);
	    createAssets.clickAndEnterDescriptionInput(description);
	    createAssets.addParentAssetInput(parentAsset);
	    createAssets.addNeighbourAssetInput(neighbourAsset);
	    createAssets.clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    createAssets.clickYearEstimatedCheckbox();
	    createAssets.clickAndEnterAssetLifecycleInput(assetLifecycle);
	    createAssets.clickAndEnterAssetValueInput(assetValue);
	    createAssets.clickAndEnterGrossExternalAreaInput(grossExternalArea);
	    createAssets.clickAndEnterSiteAreaInput(siteArea);
	    createAssets.clickNoMultipleUnits();
	    //createAssets.clickAndEnterAssetOwningOrgInput(assetOwningOrg);
	    createAssets.clickAndEnterPlotAreaInput(plotArea);
	    createAssets.clickAndEnterNetFloorAreainput(netFloorArea);
	    createAssets.clickAndEnterAssetRecordInput(assetRecord);
	    createAssets.clickSave();
	    
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clickAndEnterNameOfAssetInput(nameOfCopiedAsset);
	    assertCopyLabelOnPage();
	    createAssets.clickSave();
	}
	
	public void copyAsset_Infrastructure() throws Exception {
		
	    String country = "United States";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Water";
	    String assetSubType = "Water distrubution";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Infrastructure";
	    String nameOfCopiedAsset = "Copied Asset - Infrastructure";
	    String description = "Infrastructure of the company";
	    String parentAsset = "test asset";
	    String neighbourAsset = "Water Asset";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "50000";
	    String siteArea = "5000";
	    //String assetOwningOrg = "indiaTest";
	    String plotArea = "6000";
	    String netFloorArea = "1100";
	    String assetRecord = "Asset Management Department";
	    
	    /*
	     * Exclusive variables for Infrastructure
	     *  
	    */
	    
	    String reflectsAsset = "Linear & Non-linear";
	    String lengthOfAsset = "523";
	    String capacity = "3244";

	    //Start Asset Creation
	    createAssets.clickOnCreateAssetsButton();
		createAssets.selectCreateAssetType("Infrastructure");
				
		/*
		 * Start input for Asset address
		*/
	
		createAssets.addSelectCountryInput(country);
		createAssets.addAddressLineOneInput(addressLineOne);
		createAssets.addAddressLineTwoInput(addressLineTwo);
		createAssets.addTownOrCityInput(townCity);
		createAssets.addCountryOrRegionInput(countryOrRegion);
		createAssets.addPostalCodeInput(postalCode);
		createAssets.addLatitudeInput(latitude);
		createAssets.addLongitudeInput(longitude);	
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
		createAssets.clickAndEnterAssetTypeInput(assetType);
		createAssets.clickAndEnterAssetSubTypeInput(assetSubType);
		createAssets.clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		*/
	    
		createAssets.clickAndEnterNameOfAssetInput(nameOfAsset);
		createAssets.clickAndEnterDescriptionInput(description);
		createAssets.addParentAssetInput(parentAsset);
		createAssets.addNeighbourAssetInput(neighbourAsset);
		createAssets.clickAndEnterYearOfConstructionInput(yearOfConstruction);
		createAssets.clickYearEstimatedCheckbox();
		createAssets.clickAndEnterAssetLifecycleInput(assetLifecycle);
		createAssets.clickAndEnterAssetValueInput(assetValue);
		createAssets.clickAndEnterSiteAreaInput(siteArea);
		createAssets.clickAndEnterReflectAssets(reflectsAsset);
		createAssets.clickAndEnterLengthOfAsset(lengthOfAsset);
		createAssets.clickAndEnterCapacityInput(capacity);
		createAssets.clickNoMultipleUnits();
		//createAssets.clickAndEnterAssetOwningOrgInput(assetOwningOrg);
		createAssets.clickAndEnterPlotAreaInput(plotArea);
		createAssets.clickAndEnterNetFloorAreainput(netFloorArea);
		createAssets.clickAndEnterAssetRecordInput(assetRecord);
		createAssets.clickSave();
		
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clickAndEnterNameOfAssetInput(nameOfCopiedAsset);
	    assertCopyLabelOnPage();
	    createAssets.clickSave();
	}
	
	public void copyAsset_Community() throws Exception {
		
	    String country = "United States";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Community";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Community";
	    String nameOfCopiedAsset = "Copied Asset - Community";
	    String description = "Community of the company";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "51233";
	    String siteArea = "623";
	    //String assetOwningOrg = "indiaTest";
	    String plotArea = "945";
	    String netFloorArea = "5576";
	    String assetRecord = "Asset Management Department";
	    
	    /*
	     * Exclusive variables for Community
	     *  
	    */
	    
	    String sizeOfDevelopment = "1234";
	    String noOfDomesticBuildings = "523";
	    String noOfNonDomesticBuildings = "3244";
	    String totalDevelopmentCost = "3244";

	    //Start Asset Creation
	    createAssets.clickOnCreateAssetsButton();
		createAssets.selectCreateAssetType("Community");
						
		/*
		 * Start input for Asset address
		*/
	
		createAssets.addSelectCountryInput(country);
		createAssets.addAddressLineOneInput(addressLineOne);
		createAssets.addAddressLineTwoInput(addressLineTwo);
		createAssets.addTownOrCityInput(townCity);
		createAssets.addCountryOrRegionInput(countryOrRegion);
		createAssets.addPostalCodeInput(postalCode);
		createAssets.addLatitudeInput(latitude);
		createAssets.addLongitudeInput(longitude);	
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
		createAssets.clickAndEnterAssetTypeInput(assetType);
		createAssets.clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		 * 
		*/
	    
		createAssets.clickAndEnterNameOfAssetInput(nameOfAsset);
		createAssets.clickAndEnterDescriptionInput(description);
		createAssets.clickAndEnterYearOfConstructionInput(yearOfConstruction);
		createAssets.clickYearEstimatedCheckbox();
		createAssets.clickAndEnterAssetLifecycleInput(assetLifecycle);
		createAssets.clickAndEnterAssetValueInput(assetValue);
		createAssets.clickAndEnterSiteAreaInput(siteArea);
		createAssets.clickAndEnterSizeOfDevelopment(sizeOfDevelopment);
		createAssets.clickAndEnterNumOfDomesticBuildings(noOfDomesticBuildings);
		createAssets.clickAndEnterNumOfNonDomesticBuildings(noOfNonDomesticBuildings);
		createAssets.clickAndEnterTotalDevelopmentCost(totalDevelopmentCost);
		createAssets.clickNoMultipleUnits();
		//createAssets.clickAndEnterAssetOwningOrgInput(assetOwningOrg);
		createAssets.clickAndEnterPlotAreaInput(plotArea);
		createAssets.clickAndEnterNetFloorAreainput(netFloorArea);
		createAssets.clickAndEnterAssetRecordInput(assetRecord);
		createAssets.clickSave();
		
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clickAndEnterNameOfAssetInput(nameOfCopiedAsset);
	    assertCopyLabelOnPage();
	    createAssets.clickSave();
	}
}