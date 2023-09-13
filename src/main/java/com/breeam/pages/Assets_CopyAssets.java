package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

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
		WAITFORELEMENTINVISIBILITYXPATH("//label[contains(text(), 'Asset created successfully')]");
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
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Healthcare";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Main Office Building" + generateRandomInt();
	    String nameOfCopiedAsset = " - Copied Asset";
	    String description = "Headquarters of the company";
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
	    createAssets.clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information
		*/
	    
	    createAssets.clickAndEnterNameOfAssetInput(nameOfAsset);
	    createAssets.clickAndEnterDescriptionInput(description);
	    createAssets.clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    createAssets.clickAndEnterAssetLifecycleInput(assetLifecycle);
	    createAssets.clickAndEnterAssetValueInput(assetValue);
	    createAssets.clickAndEnterGrossExternalAreaInput(grossExternalArea);
	    createAssets.clickAndEnterSiteAreaInput(siteArea);
	    createAssets.clickAndEnterAssetOwningOrganization();
	    createAssets.clickSave();
	    
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clickAndEnterNameOfAssetInput(nameOfCopiedAsset);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    assertAssetCopiedToastMessage();
	}
	
	public void assertAssetCopiedToastMessage() throws Exception {
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Asset copied successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Asset copied successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Asset copied successfully toast message displayed");
	}

	
	public void copyAsset_Infrastructure() throws Exception {
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clearAndenterNameOfCopiedAssetInput(Constant.nameOfCopiedAssetV2);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    assertAssetCopiedToastMessage();
	}
	
	public void copyAsset_Community() throws Exception {
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Community";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Community" + generateRandomInt();
	    String nameOfCopiedAsset = "Copied Asset - Community" + generateRandomInt();
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
		createAssets.clickAndEnterAssetLifecycleInput(assetLifecycle);
		createAssets.clickAndEnterAssetValueInput(assetValue);
		createAssets.clickAndEnterSiteAreaInput(siteArea);
		createAssets.clickAndEnterSizeOfDevelopment(sizeOfDevelopment);
		createAssets.clickAndEnterNumOfDomesticBuildings(noOfDomesticBuildings);
		createAssets.clickAndEnterNumOfNonDomesticBuildings(noOfNonDomesticBuildings);
		createAssets.clickAndEnterTotalDevelopmentCost(totalDevelopmentCost);
		createAssets.clickSave();
		
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clearAndenterNameOfCopiedAssetInput(nameOfCopiedAsset);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    createAssets.assertAssetCreationToastMessage();
	}
}