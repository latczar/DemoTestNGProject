package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class UserPage_CreateOrganizations extends CommonFunctions {
	
	UserAdmin userAdmin = new UserAdmin();
	
	@FindBy(xpath="(//span[contains(text(),'Cancel')])[1]")
	static WebElement cancelButton;
	
	@FindBy(xpath="(//span[contains(text(),'Save')])[1]")
	static WebElement saveButton;

	@FindBy(xpath="(//span[contains(text(),'Upload Logo')])")
	static WebElement uploadLogoButton;
	
	/*
	 * Organization Address web elements
	*/
	
	@FindBy(xpath="//input[contains(@placeholder,'Select country')]")
	static WebElement selectCountryInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Address line 1')]//following::input)[1]")
	static WebElement addressLineOneInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Address line 2')]//following::input)[1]")
	static WebElement addressLineTwoInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Town / City')]//following::input)[1]")
	static WebElement townOrCityInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Country / Region / State')]//following::input)[1]")
	static WebElement countryOrRegionInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Postal / Zip code')]//following::input)[1]")
	static WebElement postalCodeInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Latitude')]//following::input)[1]")
	static WebElement latitudeInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Longitude')]//following::input)[1]")
	static WebElement longitudeInput;
	
	/*
	 * Organization Details web elements
	*/
	
	@FindBy(xpath="(//label[contains(text(), 'Organisation name')]//following::input)[1]")
	static WebElement organizationNameInput;
	
	@FindBy(xpath="//input[contains(@placeholder,'Select parent')]")
	static WebElement selectParentInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Phone number')]//following::input)[1]")
	static WebElement phoneNumberInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Email')]//following::input)[1]")
	static WebElement emailInput;
	
	@FindBy(xpath="//input[contains(@placeholder,'mysite.com')]")
	static WebElement websiteInput;
	
	@FindBy(xpath="(//label[contains(text(), 'Notes')]//following::input)[1]")
	static WebElement notesInput;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search NSOs')]")
	static WebElement searchNSOsInput;
	
	@FindBy(xpath="//label[@for = 'termsConditions']")
	static WebElement termsAndConditionsCheckbox;
	
	@FindBy(xpath="(//span[contains(text(), 'Add child organisation')])[1]") 
	WebElement userAdminAddChildOrganisationButton;
	
	public UserPage_CreateOrganizations() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Organization Address
	 * Fill up Organization address
	*/
	
	public void addSelectCountryInput(String country) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, selectCountryInput);
	    CLICK(selectCountryInput, "Select Country input is clicked");
	    ENTERTEXT(selectCountryInput, country);
	    MOUSEHOVER("//label[contains(text(), '" + country + "')]");
	    ROBOTENTER();
	}

	public void addAddressLineOneInput(String addressLineOne) throws Exception {
	    CLICK(addressLineOneInput, "Address Line 1 input is clicked");
	    ENTERTEXT(addressLineOneInput, addressLineOne);
	}

	public void addAddressLineTwoInput(String addressLineTwo) throws Exception {
	    CLICK(addressLineTwoInput, "Address Line 2 input is clicked");
	    ENTERTEXT(addressLineTwoInput, addressLineTwo);
	}

	public void addTownOrCityInput(String townCity) throws Exception {
	    CLICK(townOrCityInput, "Town / City input is clicked");
	    ENTERTEXT(townOrCityInput, townCity);
	}

	public void addCountryOrRegionInput(String countryOrRegion) throws Exception {
	    CLICK(countryOrRegionInput, "Country / Region / State input is clicked");
	    ENTERTEXT(countryOrRegionInput, countryOrRegion);
	}

	public void addPostalCodeInput(String countryOrRegion) throws Exception {
	    CLICK(postalCodeInput, "Postal / Zip code input is clicked");
	    ENTERTEXT(postalCodeInput, countryOrRegion);
	}

	public void addLatitudeInput(String latitude) throws Exception {
	    CLICK(latitudeInput, "Latitude input is clicked");
	    ENTERTEXT(latitudeInput, latitude);
	}

	public void addLongitudeInput(String longitude) throws Exception {
	    CLICK(longitudeInput, "Longitude input is clicked");
	    ENTERTEXT(longitudeInput, longitude);
	}

	/*
	 * Organization Details
	 * Fill up Organization Details
	*/
	
	public void addOrganizationNameInput(String orgNameInput) throws Exception {

	    CLICK(organizationNameInput, "Organization Name input is clicked");
	    ENTERTEXT(organizationNameInput, orgNameInput);
	}

	public void addSelectParentInput(String parentOrgInput) throws Exception {
	    CLICK(selectParentInput, "Select Parent input is clicked");
	    ENTERTEXT(selectParentInput, parentOrgInput);
	}

	public void addPhoneNumberInput(String phoneNumber) throws Exception {
	    CLICK(phoneNumberInput, "Phone Number input is clicked");
	    ENTERTEXT(phoneNumberInput, phoneNumber);
	}

	public void addEmailInput(String email) throws Exception {
	    CLICK(emailInput, "Email input is clicked");
	    ENTERTEXT(emailInput, email);
	}

	public void addWebsiteInput(String websiteName) throws Exception {
	    CLICK(websiteInput, "Website input is clicked");
	    ENTERTEXT(websiteInput, websiteName);
	}

	public void addNotesInput(String notes) throws Exception {
	    CLICK(notesInput, "Notes input is clicked");
	    ENTERTEXT(notesInput, notes);
	}

	public void addSearchNSOsInput(String nso) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, searchNSOsInput);
	    CLICK(searchNSOsInput, "Search NSOs input is clicked");
	    ENTERTEXT(searchNSOsInput, nso);
	    HOVERANDCLICK(nso);
	}

	public void clickTermsAndConditionsCheckbox() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, termsAndConditionsCheckbox);
	    CLICK(termsAndConditionsCheckbox, "Terms and Conditions checkbox is clicked");
	}
	
	public void clickSave() throws Exception {
		CLICK(saveButton, "Save button is clicked");
	}
	
	public void createOrganizations() throws Exception {
		
	    String country = "United States";
	    String addressLineOne = "123 Main Street";
	    String addressLineTwo = "Apt 45";
	    String townCity = "New York";
	    String countryOrRegion = "New York";
	    String postalCode = "12345";
	    String latitude = "40.7128";
	    String longitude = "-74.0060";
	    String orgNameInput = "Your Organization";
	    String parentOrgInput = "Parent Organization";
	    String phoneNumber = "123-456-7890";
	    String email = "info@example.com";
	    String websiteName = "https://www.example.com";
	    String notes = "This is a test organization.";
	    String nso = "ITG";
	    
		WAITFORVISIBLEELEMENT(driver, userAdmin.userAdminButton);
		MOUSEHOVER("//a[contains(text(),'User admin')]");
		CLICK(userAdmin.organisationButton, "Organisation button is clicked");
		WAITFORVISIBLEELEMENT(driver, userAdmin.userAdminAddOrganisationButton);
		CLICK(userAdmin.userAdminAddOrganisationButton, "Add an Organisation button is clicked");
		
	    // Add your string values for each argument here:
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    addLatitudeInput(latitude);
	    addLongitudeInput(longitude);
	    addOrganizationNameInput(orgNameInput);
	    addSelectParentInput(parentOrgInput);
	    addPhoneNumberInput(phoneNumber);
	    addEmailInput(email);
	    addWebsiteInput(websiteName);
	    addNotesInput(notes);
	    addSearchNSOsInput(nso);
		clickTermsAndConditionsCheckbox();
		clickSave();
	}
	
	public void addChildOrganisation() throws Exception {
		
	    String country = "Albania";
	    String addressLineOne = "123 Main Test123";
	    String addressLineTwo = "Apt test123";
	    String townCity = "Albania test";
	    String countryOrRegion = "AlbaniaTest";
	    String postalCode = "123456344";
	    String latitude = "40.124428";
	    String longitude = "-23.32422";
	    String orgNameInput = "Child Organization";
	    String parentOrgInput = "Parent Organization";
	    String phoneNumber = "123-456-7890";
	    String email = "info@example.com";
	    String websiteName = "https://www.example.com";
	    String notes = "This is a child test organization.";
	    String nso = "DGBC";
	    
		createOrganizations();
		CLICK(userAdminAddChildOrganisationButton, "Add Child Organisation button is clicked");
		
	    // Add your string values for each argument here:
	    addSelectCountryInput(country);
	    addAddressLineOneInput(addressLineOne);
	    addAddressLineTwoInput(addressLineTwo);
	    addTownOrCityInput(townCity);
	    addCountryOrRegionInput(countryOrRegion);
	    addPostalCodeInput(postalCode);
	    addLatitudeInput(latitude);
	    addLongitudeInput(longitude);
	    addOrganizationNameInput(orgNameInput);
	    addSelectParentInput(parentOrgInput);
	    addPhoneNumberInput(phoneNumber);
	    addEmailInput(email);
	    addWebsiteInput(websiteName);
	    addNotesInput(notes);
	    addSearchNSOsInput(nso);
		clickTermsAndConditionsCheckbox();
		clickSave();
	}
}