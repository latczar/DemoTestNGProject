package com.breeam.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class Assets_CreateAssetsPage extends CommonFunctions {
	
	Assets assets = new Assets();
	WebElement elementToClick;
	
	/*
	 * Create Assets page web elements
	 * Asset Address
	*/
	
	@FindBy(xpath="//h1[contains(text(),'Create asset')]//following-sibling::section")
	static WebElement assetTypeDropdown;
	
	@FindBy(xpath="(//span[contains(text(),'Cancel')])[1]")
	static WebElement cancelButton;
	
	@FindBy(xpath="(//span[contains(text(),'Save')])[2]")
	static WebElement saveButton;
	
	@FindBy(xpath="//span[contains(text(),'Upload image')]")
	static WebElement uploadImageButton;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[2]")
	static WebElement selectCountryDropdown;
	
	@FindBy (xpath="//section[normalize-space()='India']")
	static WebElement countryIndia;
	
	@FindBy(xpath="(//label[contains(text(), 'Address line 1')]//following::input)[1]")
	static WebElement addressLineOneInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Address line 2')]//following::input)[1]")
	static WebElement addressLineTwoInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Town / City')]//following::input)[1]")
	static WebElement townOrCityInput;
	
	@FindBy(xpath="(//label[contains(text(), 'County / Region / State')]//following::input)[1]")
	static WebElement countryOrRegionInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Postal / Zip code')]//following::input)[1]")
	static WebElement postalCodeInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Latitude')]//following::input)[1]")
	static WebElement latitudeInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Longitude')]//following::input)[1]")
	static WebElement longitudeInput;
	
	/*
	 * Create Assets page web elements
	 * Asset Types
	*/
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[3]")
	static WebElement assetTypeInput;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[4]")
	static WebElement assetSubTypeInput;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[5]")
	static WebElement assetSubTypeTwoInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Gross internal area')]//following::input)[1]")
	static WebElement grossInternalAreaInput;
	
	/*
	 * Create Assets page web elements
	 * Asset Information
	*/
	
	@FindBy(xpath="(//label[contains(text(), 'Name of asset')]//following::input)[1]")
	static WebElement nameOfAssetInput;
	
	@FindBy(xpath="//section[@data-testid='bre-select-selectcontainer']//section[2]")
	static WebElement randomParentAsset;
	
	@FindBy(xpath="(//label[contains(text(), 'Description')]//following::input)[1]")
	static WebElement descriptionInput;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[6]")
	static WebElement parentAssetInput;
	
	@FindBy(xpath="(//input[@placeholder='Select asset owning organization'])[1]")
	static WebElement AssetOwningOrganization;
	
	@FindBy(xpath="//label[normalize-space()='111test111']")
	static WebElement organizationOwner;
	
	@FindBy(xpath="//input[@placeholder='Select neighbouring asset']")
	
	static WebElement neighbourAssetInput;
	
	@FindBy(xpath="(//label)[17]")
	
	static WebElement randomNeighbourAsset;
	
	@FindBy(xpath="(//label[contains(text(), 'Year of construction')]//following::input)[1]")
	static WebElement yearOfConstructionInput;
	
	@FindBy(xpath="//label[contains(text(),'Year estimated')]")
	static WebElement yearEstimatedCheckbox;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[8]")
	static WebElement assetLifecycleInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Asset value')]//following::input)[1]")
	static WebElement assetValueInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Gross external area')]//following::input)[1]")
	static WebElement grossExternalAreaInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Site area')]//following::input)[1]")
	static WebElement siteAreaInput;
	
	//Are there multiple units within the building question*
	@FindBy(xpath="(//label[contains(text(), 'Are there multiple units within this building?')]//following::label)[1]")
	static WebElement noMultipleUnits;
	
	@FindBy(xpath="(//label[contains(text(), 'Are there multiple units within this building?')]//following::label)[2]")
	static WebElement yesMultipleUnits;
	
	@FindBy(xpath="(//label[contains(text(), 'Are there multiple units within this building?')]//following::label)[3]")
	static WebElement unknownUnits;
	
	@FindBy(xpath="(//input[@data-testid='bre-select-input'])[9]")
	static WebElement assetOwningOrgInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Gross Plot Area')]//following::input)[1]")
	static WebElement plotAreaInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Net Floor Area')]//following::input)[1]")
	static WebElement netFloorAreainput;
	
	@FindBy(xpath="(//label[contains(text(), 'Asset Record Holder')]//following::input)[1]")
	static WebElement assetRecordInput;
	
	
	/*
	 * Infrastructure Create Assets page web elements
	 * Asset Information - Infrastructure
	*/
	
	@FindBy(xpath="(//label[contains(text(), 'Which of the following best reflects your Asset?')]//following::input)[1]")
	static WebElement reflectsAssetInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Length (if linear asset)')]//following::input)[1]")
	static WebElement lengthOfAssetInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Capacity')]//following::input)[1]")
	static WebElement capacityInput;
	
	/*
	 * Community Create Assets page web elements
	 * Asset Information - Community
	*/
	
	@FindBy(xpath="(//label[contains(text(), 'Size of development')]//following::input)[1]")
	static WebElement sizeOfDevelopmentInput;
	
	@FindBy(xpath="(//label[contains(text(), 'No of domestic buildings')]//following::input)[1]")
	static WebElement numOfDomesticBuildingsInput;
	
	@FindBy(xpath="(//label[contains(text(), 'No of non-domestic buildings')]//following::input)[1]")
	static WebElement numOfNonDomesticBuildingsInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Total development cost')]//following::input)[1]")
	static WebElement totalDevelopmentCostInput;
	
	
	public Assets_CreateAssetsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Create Assets
	 * Fill up Asset Address
	*/
	
	public void assertAssetCreationToastMessage() throws Exception {
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Asset created successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Asset created successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Asset created successfully toast message displayed");
	}
		
	public void selectCreateAssetType(String assetType) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, selectCountryDropdown);
	    CLICKONELEMENTJS("(//h1[contains(text(),'Create asset')]//following-sibling::section//section)[1]");
	    Extent.getTest().info("Clicked on Main Asset Type");
	    WebElement createAssetType = driver.findElement(By.xpath("//following-sibling::section//label[contains(text(),'" + assetType +"')]"));
	    CLICK(createAssetType, assetType + " - Asset type is selected");
	    Extent.getTest().info("Asset Type is " + assetType);
	}
	
	public void addSelectCountryInput(String country) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, selectCountryDropdown);
	    Thread.sleep(2000);
	    CLICK(selectCountryDropdown, "Select Country input is clicked");
	    ENTERTEXT(selectCountryDropdown, country);
	    Extent.getTest().info("Entered text: " + country);
	    MOUSEHOVER("//label[contains(text(), '" + country + "')]");
	    Extent.getTest().info("Hovered over: " + country);
	    CLICK(countryIndia, "Country India clicked");
	    
	    // ROBOTDOWN(); // To select India from the list
	   // ROBOTENTER();
	    Extent.getTest().info("Selected country " + country);
	}

	public void addAddressLineOneInput(String addressLineOne) throws Exception {
	    ENTERTEXT(addressLineOneInput, addressLineOne);
	    Extent.getTest().info("Address line one is " + addressLineOne);
	}

	public void addAddressLineTwoInput(String addressLineTwo) throws Exception {
	    ENTERTEXT(addressLineTwoInput, addressLineTwo);
	    Extent.getTest().info("Address line two is " + addressLineTwo);
	}

	public void addTownOrCityInput(String townCity) throws Exception {
	    CLICK(townOrCityInput, "Town / City input is clicked");
	    ENTERTEXT(townOrCityInput, townCity);
	    Extent.getTest().info("Town/City is " + townCity);
	}

	public void addCountryOrRegionInput(String countryOrRegion) throws Exception {
	    CLICK(countryOrRegionInput, "Country / Region / State input is clicked");
	    ENTERTEXT(countryOrRegionInput, countryOrRegion);
	    Extent.getTest().info("Country/Region is " + countryOrRegion);
	}

	public void addPostalCodeInput(String postalZipCode) throws Exception {
	    CLICK(postalCodeInput, "Postal / Zip code input is clicked");
	    ENTERTEXT(postalCodeInput, postalZipCode);
	    Extent.getTest().info("Postal/Zip code is " + postalZipCode);
	}

	public void addLatitudeInput(String latitude) throws Exception {
	    CLICK(latitudeInput, "Latitude input is clicked");
	    ENTERTEXT(latitudeInput, latitude);
	    Extent.getTest().info("Latitude input is " + latitude);
	}

	public void addLongitudeInput(String longitude) throws Exception {
	    CLICK(longitudeInput, "Longitude input is clicked");
	    ENTERTEXT(longitudeInput, longitude);
	    Extent.getTest().info("Longitude input is " + longitude);
	}
	
	/*
	 * Create Assets
	 * Input Asset types and subtypes
	*/
	
	public void clickAndEnterAssetTypeInput(String assetType) throws Exception {
	
		SCROLLINTOVIEW("//span[contains(text(),'Upload image')]");
	    ENTERTEXT(assetTypeInput, assetType);
	    Extent.getTest().info("Entered Asset Type: " + assetType);
	    MOUSEHOVER("//label[contains(text(), '" + assetType + "')]");
	    Extent.getTest().info("Hovered over: " + assetType);
	    ROBOTENTER();
	    Extent.getTest().info("Selected Asset Type " + assetType);
	}

	public void clickAndEnterAssetSubTypeInput(String assetSubType) throws Exception {
		Thread.sleep(2000);
	    ENTERTEXT(assetSubTypeInput, assetSubType);
	    Extent.getTest().info("Asset Subtype: " + assetSubType);
	    MOUSEHOVER("//label[contains(text(), '" + assetSubType + "')]");
	    Extent.getTest().info("Hovered over: " + assetSubType);
	    ROBOTENTER();
	    Extent.getTest().info("Selected SubAsset Type " + assetSubType);
	}

	public void clickAndEnterAssetSubTypeTwoInput(String assetSubTypeTwo) throws Exception {
	    ENTERTEXT(assetSubTypeTwoInput, assetSubTypeTwo);
	    Extent.getTest().info("Asset Subtype 2: " + assetSubTypeTwo);
	    MOUSEHOVER("//label[contains(text(), '" + assetSubTypeTwo + "')]");
	    Extent.getTest().info("Hovered over: " + assetSubTypeTwo);
	    ROBOTENTER();
	    Extent.getTest().info("Selected SubAsset Type Two " + assetSubTypeTwo);
	}

	public void clickAndEnterGrossInternalAreaInput(String grossInternalArea) throws Exception {
	    Thread.sleep(1000);
	    ENTERTEXT(grossInternalAreaInput, grossInternalArea);
	    Extent.getTest().info("Gross Internal Area: " + grossInternalArea);
	}

	/*
	 * Create Assets
	 * Input Asset Information
	*/
	
	public void clickAndEnterNameOfAssetInput(String assetName) throws Exception {
		Thread.sleep(1000);
	    ENTERTEXT(nameOfAssetInput, assetName);
	    Extent.getTest().info("Name of Asset: " + assetName);
	}
	
	public void clearAndenterNameOfCopiedAssetInput(String assetName) throws Exception {
		CLEARTEXTBOX(nameOfAssetInput);
	    ENTERTEXT(nameOfAssetInput, assetName);
	    Extent.getTest().info("Name of Asset: " + assetName);
	}

	public void clickAndEnterDescriptionInput(String assetDescription) throws Exception {
		Thread.sleep(1000);
	    ENTERTEXT(descriptionInput, assetDescription);
	    Extent.getTest().info("Asset Description: " + assetDescription);
	}

	public void addParentAssetInput(String parentAssetName) throws Exception {
	    ENTERTEXT(parentAssetInput, parentAssetName);
	    Extent.getTest().info("Entered Parent Asset: " + parentAssetName);
	    HOVERANDCLICK(parentAssetName);
	    Extent.getTest().info("Hovered over and clicked Parent Asset: " + parentAssetName);
	}

	public void addRandomParentInput() throws Exception {
		CLICK(parentAssetInput, "Parent asset dropdown");
		CLICK(randomParentAsset, "Random parent asset");
		Extent.getTest().info("Randon parent asset is selected");
	}
	public void addNeighbourAssetInput(String neighbourAssetName) throws Exception {
	    ENTERTEXT(neighbourAssetInput, neighbourAssetName);
	    Extent.getTest().info("Entered Neighbour Asset: " + neighbourAssetName);
	    HOVERANDCLICK(neighbourAssetName);
	    Extent.getTest().info("Neighbour Asset: " + neighbourAssetName);
	}
	
	public void addRandomNeighbourAssetInput() throws Exception {
	    CLICK(neighbourAssetInput, "Click neighbor asset dropdown");
	    CLICK(randomNeighbourAsset, "Selected random neighbor asset");
	    Extent.getTest().info("Neighbour Asset " + randomNeighbourAsset.getText() + " selected");
	    
	}

	public void clickAndEnterYearOfConstructionInput(String constructionYear) throws Exception {
		Thread.sleep(1000);
	    ENTERTEXT(yearOfConstructionInput, constructionYear);
	    Extent.getTest().info("Year of Construction: " + constructionYear);
	}

	public void clickYearEstimatedCheckbox() throws Exception {
	    CLICK(yearEstimatedCheckbox, "Year Estimated checkbox is clicked");
	}

	public void clickAndEnterAssetLifecycleInput(String assetLifecycle) throws Exception {
	    ENTERTEXT(assetLifecycleInput, assetLifecycle);
	    Extent.getTest().info("Entered text for Asset Lifecycle: " + assetLifecycle);
	    HOVERANDCLICK(assetLifecycle);
	    Extent.getTest().info("Asset Lifecycle: " + assetLifecycle);
	}

	public void clickAndEnterAssetValueInput(String assetValue) throws Exception {
	    CLICK(assetValueInput, "Asset Value input is clicked");
	    ENTERTEXT(assetValueInput, assetValue);
	    Extent.getTest().info("Asset Value: " + assetValue);
	}

	public void clickAndEnterGrossExternalAreaInput(String grossArea) throws Exception {
	    CLICK(grossExternalAreaInput, "Gross External Area input is clicked");
	    ENTERTEXT(grossExternalAreaInput, grossArea);
	    Extent.getTest().info("Gross External Area: " + grossArea);
	}

	public void clickAndEnterSiteAreaInput(String siteArea) throws Exception {
	    CLICK(siteAreaInput, "Site Area input is clicked");
	    ENTERTEXT(siteAreaInput, siteArea);
	    Extent.getTest().info("Site Area: " + siteArea);
	}

	public void clickNoMultipleUnits() throws Exception {
	    CLICK(noMultipleUnits, "No Multiple Units option is clicked");
	    Extent.getTest().info("No Multiple units selected");
	}

	public void clickYesMultipleUnits() throws Exception {
	    CLICK(yesMultipleUnits, "Yes Multiple Units option is clicked");
	    Extent.getTest().info("Multiple units selected");
	}

	public void clickUnknownUnits() throws Exception {
	    CLICK(unknownUnits, "Unknown Units option is clicked");
	    Extent.getTest().info("Unknown units selected");
	}

	public void clickAndEnterAssetOwningOrgInput(String owningOrg) throws Exception {
	    //ENTERTEXT(assetOwningOrgInput, owningOrg);
	    //Extent.getTest().info("Entering Text for Asset Owning Organization");
	    HOVERANDCLICK(owningOrg);
	    Extent.getTest().info("Asset Owning Organization: " + owningOrg);
	}

	public void clickAndEnterPlotAreaInput(String plotArea) throws Exception {
	    CLICK(plotAreaInput, "Plot Area input is clicked");
	    ENTERTEXT(plotAreaInput, plotArea);
	    Extent.getTest().info("Plot Area: " + plotArea);
	}

	public void clickSave() throws Exception {
		Thread.sleep(1000);
		CLICK(saveButton, "Save button is clicked");
		Extent.getTest().info("Clicked on the Save button");
	}

	public void clickAndEnterNetFloorAreainput(String netFloorArea) throws Exception {
	    CLICK(netFloorAreainput, "Net Floor Area input is clicked");
	    ENTERTEXT(netFloorAreainput, netFloorArea);
	    Extent.getTest().info("Net Floor Area: " + netFloorArea);
	}

	public void clickAndEnterAssetRecordInput(String assetRecord) throws Exception {
	    CLICK(assetRecordInput, "Asset Record Holder input is clicked");
	    ENTERTEXT(assetRecordInput, assetRecord);
	    Extent.getTest().info("Asset Record Holder: " + assetRecord);
	}

	
	/*
	 * Click methods for exclusive Infrastructure elements 
	*/
	
	public void clickAndEnterReflectAssets(String reflectsAsset) throws Exception {
	    CLICK(reflectsAssetInput, "Reflect assets input is clicked");
	    ENTERTEXT(reflectsAssetInput, reflectsAsset);
	    HOVERANDCLICK(reflectsAsset);
	    Extent.getTest().info("Reflect Assets: " + reflectsAsset);
	}

	public void clickAndEnterLengthOfAsset(String lengthOfAsset) throws Exception {
	    CLICK(lengthOfAssetInput, "Length of asset input is clicked");
	    ENTERTEXT(lengthOfAssetInput, lengthOfAsset);
	    Extent.getTest().info("Length of Asset: " + lengthOfAsset);
	}

	public void clickAndEnterCapacityInput(String capacity) throws Exception {
	    CLICK(capacityInput, "Capacity of asset is clicked");
	    ENTERTEXT(capacityInput, capacity);
	    Extent.getTest().info("Capacity: " + capacity);
	}

	
	/*
	 * Click methods for exclusive Community elements 
	*/
	
	public void clickAndEnterSizeOfDevelopment(String size) throws Exception { 
	    CLICK(sizeOfDevelopmentInput, "Size of development input is clicked");
	    ENTERTEXT(sizeOfDevelopmentInput, size);
	    Extent.getTest().info("Size of Development: " + size);
	}

	public void clickAndEnterNumOfDomesticBuildings(String numOfDomesticBuildings) throws Exception {
	    ENTERTEXT(numOfDomesticBuildingsInput, numOfDomesticBuildings);
	    Extent.getTest().info("Number of Domestic Buildings: " + numOfDomesticBuildings);
	}

	public void clickAndEnterNumOfNonDomesticBuildings(String numOfNonDomesticBuildings) throws Exception {
	    ENTERTEXT(numOfNonDomesticBuildingsInput, numOfNonDomesticBuildings);
	    Extent.getTest().info("Number of Non-Domestic Buildings: " + numOfNonDomesticBuildings);
	}

	public void clickAndEnterTotalDevelopmentCost(String totalCost) throws Exception {
	    ENTERTEXT(totalDevelopmentCostInput, totalCost);
	    Extent.getTest().info("Total Development Cost: " + totalCost);
	}
	
	public void clickOnCreateAssetsButton() throws Exception {
		WAITFORVISIBLEELEMENT(driver, assets.assetsButton);
		MOUSEHOVER("//a[contains(text(),'Assets')]");
		CLICK(assets.assetsButton, "Assets button is clicked");
		WAITFORVISIBLEELEMENT(driver, assets.createAssetButton);
		CLICK(assets.createAssetButton, "Create Assets button is clicked");
	}
	
	//Start test cases creation for Assets
	
	public void createAsset_Building() throws Exception {
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Healthcare";
	    String assetSubType = "Hospital";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Main Office Building" + generateRandomInt();
	    Constant.nameOfCopiedAssetV2 = "Copied Asset - "+nameOfAsset;
	    String description = "Headquarters of the company";
	    String neighbourAsset = "Main Office Building18912";
	    		//"Neighbour - Building";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Pre design";
	    String assetValue = "50000";
	    String grossExternalArea = "1200";
	    String siteArea = "5000";
	    String nameOfAssetOwningOrg ="111test111";
	    //Start Asset Creation
	    clickOnCreateAssetsButton();
				
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    addLatitudeInput(latitude);
	    addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterAssetSubTypeInput(assetSubType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    addRandomNeighbourAssetInput();
	    //addNeighbourAssetInput(neighbourAsset);
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterGrossExternalAreaInput(grossExternalArea);
	    clickAndEnterSiteAreaInput(siteArea);
	    clickAndEnterAssetOwningOrganization();
		clickSave();
		assertAssetCreationToastMessage();
	}
	
	void clickAndEnterAssetOwningOrganization() throws Exception {
		CLICK(AssetOwningOrganization, "Asset Owning Organization dropdown clicked");
		CLICK(organizationOwner, "Asset Owning Organization clicked");
	    Extent.getTest().info("Asset Owning Organization: ");
		
	}

	public void createAsset_Infrastructure() throws Exception {
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Water";
	    String assetSubType = "Water distribution";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Infrastructure" + generateRandomInt();
	    Constant.nameOfCopiedAssetV2 = "Copied Asset - "+nameOfAsset;
	    String description = "Infrastructure of the company";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "50000";
	    String siteArea = "5000";
	    
	    /*
	     * Exclusive variables for Infrastructure
	     *  
	    */
	    
	    String reflectsAsset = "Linear & Non-linear";
	    String lengthOfAsset = "523";
	    String capacity = "3244";
	    String parentAsset ="";
	   

	    //Start Asset Creation
	    clickOnCreateAssetsButton();
		selectCreateAssetType("Infrastructure");
				
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    addLatitudeInput(latitude);
	    addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterAssetSubTypeInput(assetSubType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    addRandomParentInput();
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterSiteAreaInput(siteArea);
	    clickAndEnterReflectAssets(reflectsAsset);
	    clickAndEnterLengthOfAsset(lengthOfAsset);
	    clickAndEnterCapacityInput(capacity);
	    clickAndEnterAssetOwningOrganization();
		clickSave();
		assertAssetCreationToastMessage();
	}
	
	public void createAsset_Community() throws Exception {
		
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
	    Constant.nameOfCopiedAssetV2 = "Copied Asset - "+nameOfAsset;
	    String description = "Community of the company";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "51233";
	    
	    /*
	     * Exclusive variables for Community
	     *  
	    */
	    
	    String sizeOfDevelopment = "1234";
	    String noOfDomesticBuildings = "523";
	    String noOfNonDomesticBuildings = "3244";
	    String totalDevelopmentCost = "4212";

	    //Start Asset Creation
	    clickOnCreateAssetsButton();
		selectCreateAssetType("Community");
						
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    addLatitudeInput(latitude);
	    addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		 * 
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterSizeOfDevelopment(sizeOfDevelopment);
	    clickAndEnterNumOfDomesticBuildings(noOfDomesticBuildings);
	    clickAndEnterNumOfNonDomesticBuildings(noOfNonDomesticBuildings);
	    clickAndEnterTotalDevelopmentCost(totalDevelopmentCost);
	    clickAndEnterAssetOwningOrganization();
		clickSave();
		assertAssetCreationToastMessage();
	}
	
	/*
	 * Test data for Parent and Neighbouring Assets
	 * 
	 * Building
	 * Parent - Building
	 * Neighbour - Building
	 * 
	 * Infrastructure
	 * Parent - Infrastructure
	 * Neighbour - Infrastructure
	 * 
	 * Parent - Community
	 * Neighbour - Community
	 * 
	 */
	
	public void setParentNeighbourAsset_Building() throws Exception {
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "Mumbai";
	    String countryOrRegion = "Mumbai";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Education";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Building" + generateRandomInt();
	    Constant.nameOfCopiedAssetV2 = "Copied Asset - "+nameOfAsset;
	    String description = "Building of the company";
	    String yearOfConstruction = "2010";
	    String assetLifecycle = "Pre design";
	    String assetValue = "51233";
	    String grossExternalArea = "1200";
	    String siteArea = "5000";
	    
	    /*
	     * Variables for Parent and Neighbour Asset
	     *  
	    */
	    
	    String parentAsset = "Parent - Building";
	    String neighbourAsset = "Neighbour - Building";
	    
	    //Start Asset Creation
	    clickOnCreateAssetsButton();
		selectCreateAssetType("Building");
						
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    //addLatitudeInput(latitude);
	    //addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		 * 
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    addParentAssetInput(parentAsset);
	    addNeighbourAssetInput(neighbourAsset);
	    captureScreenshot(driver, "ParentAndNeighbourAsset" + generateRandomInt());
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterGrossExternalAreaInput(grossExternalArea);
	    clickAndEnterSiteAreaInput(siteArea);
		clickSave();
		assertAssetCreationToastMessage();
	}
	
	public void setParentNeighbourAsset_Infrastructure() throws Exception {
		
	    String country = "India";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String assetType = "Water";
	    String assetSubType = "Water distribution";
	    String grossInternalArea = "1000";
	    String nameOfAsset = "Infrastructure" + generateRandomInt();
	    String description = "Infrastructure of the company";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "50000";
	    String siteArea = "5000";
	    
	    /*
	     * Variables for Parent and Neighbour Asset
	     *  
	    */
	    
	    String parentAsset = "Parent - Infrastructure";
	    String neighbourAsset = "Neighbour - Infrastructure";
	    
	    /*
	     * Exclusive variables for Infrastructure
	     *  
	    */
	    
	    String reflectsAsset = "Linear & Non-linear";
	    String lengthOfAsset = "523";
	    String capacity = "3244";

	    //Start Asset Creation
	    clickOnCreateAssetsButton();
		selectCreateAssetType("Infrastructure");
				
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    //addLatitudeInput(latitude);
	    //addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterAssetSubTypeInput(assetSubType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    addParentAssetInput(parentAsset);
	    addNeighbourAssetInput(neighbourAsset);
	    captureScreenshot(driver, "ParentAndNeighbourAsset" + generateRandomInt());
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterSiteAreaInput(siteArea);
	    clickAndEnterReflectAssets(reflectsAsset);
	    clickAndEnterLengthOfAsset(lengthOfAsset);
	    clickAndEnterCapacityInput(capacity);
		clickSave();
		assertAssetCreationToastMessage();
	}
	
	public void setParentNeighbourAsset_Community() throws Exception {
		
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
	    String description = "Community of the company";
	    String yearOfConstruction = "2005";
	    String assetLifecycle = "Design";
	    String assetValue = "51233";
	    
	    /*
	     * Variables for Parent and Neighbour Asset
	     *  
	    */
	    
	    String parentAsset = "Parent - Community";
	    String neighbourAsset = "Neighbour - Community";
	    
	    /*
	     * Exclusive variables for Community
	     *  
	    */
	    
	    String sizeOfDevelopment = "1234";
	    String noOfDomesticBuildings = "523";
	    String noOfNonDomesticBuildings = "3244";
	    String totalDevelopmentCost = "4212";

	    //Start Asset Creation
	    clickOnCreateAssetsButton();
		selectCreateAssetType("Community");
						
		/*
		 * Start input for Asset address
		*/
	
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    //addLatitudeInput(latitude);
	    //addLongitudeInput(longitude);
	    
		/*
		 * Start input for Asset type and subtypes
		*/
	    
	    clickAndEnterAssetTypeInput(assetType);
	    clickAndEnterGrossInternalAreaInput(grossInternalArea);
	    
		/*
		 * Start input for Asset information - Infrastructure
		 * 
		*/
	    
	    clickAndEnterNameOfAssetInput(nameOfAsset);
	    clickAndEnterDescriptionInput(description);
	    addParentAssetInput(parentAsset);
	    addNeighbourAssetInput(neighbourAsset);
	    captureScreenshot(driver, "ParentAndNeighbourAsset" + generateRandomInt());
	    clickAndEnterYearOfConstructionInput(yearOfConstruction);
	    clickAndEnterAssetLifecycleInput(assetLifecycle);
	    clickAndEnterAssetValueInput(assetValue);
	    clickAndEnterSizeOfDevelopment(sizeOfDevelopment);
	    clickAndEnterNumOfDomesticBuildings(noOfDomesticBuildings);
	    clickAndEnterNumOfNonDomesticBuildings(noOfNonDomesticBuildings);
	    clickAndEnterTotalDevelopmentCost(totalDevelopmentCost);
		clickSave();
		assertAssetCreationToastMessage();
	}
}