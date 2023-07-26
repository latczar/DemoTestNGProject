package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class UserPage_CreateOrganizations extends CommonFunctions{
	
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
	
	public UserPage_CreateOrganizations() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Organization Address
	 * Fill up Organization address
	*/
	
	public void clickSelectCountryInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, selectCountryInput);
	    CLICK(selectCountryInput, "Select Country input is clicked");
	}

	public void clickAddressLineOneInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, addressLineOneInput);
	    CLICK(addressLineOneInput, "Address Line 1 input is clicked");
	}

	public void clickAddressLineTwoInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, addressLineTwoInput);
	    CLICK(addressLineTwoInput, "Address Line 2 input is clicked");
	}

	public void clickTownOrCityInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, townOrCityInput);
	    CLICK(townOrCityInput, "Town / City input is clicked");
	}

	public void clickCountryOrRegionInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, countryOrRegionInput);
	    CLICK(countryOrRegionInput, "Country / Region / State input is clicked");
	}

	public void clickPostalCodeInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, postalCodeInput);
	    CLICK(postalCodeInput, "Postal / Zip code input is clicked");
	}

	public void clickLatitudeInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, latitudeInput);
	    CLICK(latitudeInput, "Latitude input is clicked");
	}

	public void clickLongitudeInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, longitudeInput);
	    CLICK(longitudeInput, "Longitude input is clicked");
	}

	/*
	 * Organization Details
	 * Fill up Organization Details
	*/
	
	public void clickOrganizationNameInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, organizationNameInput);
	    CLICK(organizationNameInput, "Organization Name input is clicked");
	}

	public void clickSelectParentInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, selectParentInput);
	    CLICK(selectParentInput, "Select Parent input is clicked");
	}

	public void clickPhoneNumberInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, phoneNumberInput);
	    CLICK(phoneNumberInput, "Phone Number input is clicked");
	}

	public void clickEmailInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, emailInput);
	    CLICK(emailInput, "Email input is clicked");
	}

	public void clickWebsiteInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, websiteInput);
	    CLICK(websiteInput, "Website input is clicked");
	}

	public void clickNotesInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, notesInput);
	    CLICK(notesInput, "Notes input is clicked");
	}

	public void clickSearchNSOsInput() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, searchNSOsInput);
	    CLICK(searchNSOsInput, "Search NSOs input is clicked");
	}

	public void clickTermsAndConditionsCheckbox() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, termsAndConditionsCheckbox);
	    CLICK(termsAndConditionsCheckbox, "Terms and Conditions checkbox is clicked");
	}
	
	public void createOrganizations() throws Exception {
		
	}
	
}