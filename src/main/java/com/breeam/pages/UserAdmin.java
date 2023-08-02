package com.breeam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CommonFunctions;

public class UserAdmin extends CommonFunctions {
	
	@FindBy(xpath="(//a[contains(text(),'User admin')]") 
	WebElement userAdminButton;
	
	@FindBy(xpath="//a[contains(text(),'Assessor')]")
	static WebElement assessorButton;
	
	@FindBy(xpath="//a[contains(text(),'Licence config')]")
	static WebElement licenceConfigButton;
	
	@FindBy(xpath="//a[contains(text(),'Organisation')]") 
	WebElement organisationButton;
	
	@FindBy(xpath="//a[contains(text(),'Role config')]")
	static WebElement roleConfigButton;
	
	@FindBy(xpath="//a[contains(text(),'User organization config')]")
	static WebElement userOrganizationConfigButton;
		
	/*
	 * User admin - Users page web elements
	*/
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	static WebElement searchInput;
	
	@FindBy(xpath="//button[@class='button_bre-button__Lrs2h primary button_medium__WpxwY']")
	static WebElement inviteUserButton;
	
	/*
	 * User admin - Add user to organization modal web elements
	*/
		
	@FindBy(xpath="//input[contains(@placeholder,'Select organisation')]")
	static WebElement selectOrganizationInput;
	
	@FindBy(xpath="//input[contains(@placeholder,'Select roles')]")
	static WebElement selectRolesInput;
	
	@FindBy(xpath="(//section[@data-testid='bre-inputcontainer'])[2]")
	static WebElement emailAddressInput;
	
	@FindBy(xpath="//span[contains(text(), 'Add user')]")
	static WebElement addUserButton;
	
	@FindBy(xpath="//span[contains(text(), 'Cancel')]")
	static WebElement cancelButton;
	
	/*
	 * User Admin - Organisations web elements
	 */
	
	@FindBy(xpath="(//span[contains(text(), 'Add an organisation')])[1]") 
	WebElement userAdminAddOrganisationButton;
	
	/*
	 * Constructor of UserAdmin page
	 * Initialize elements of the page class
	 * Methods and test classes of the page class
	*/
	
	public UserAdmin() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickUserAdminButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, userAdminButton);
	    CLICK(userAdminButton, "User Admin Menu button is clicked");
	}

	public void clickAssessorButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, assessorButton);
	    CLICK(assessorButton, "Assessor Menu button is clicked");
	}

	public void clickLicenceConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, licenceConfigButton);
	    CLICK(licenceConfigButton, "Licence Config Menu button is clicked");
	}

	public void clickOrganizationButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, organisationButton);
	    CLICK(organisationButton, "Organization Menu button is clicked");
	}

	public void clickRoleConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, roleConfigButton);
	    CLICK(roleConfigButton, "Role Config Menu button is clicked");
	}

	public void clickUserOrganizationConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, userOrganizationConfigButton);
	    CLICK(userOrganizationConfigButton, "User Organization Config Menu button is clicked");
	}
	
	/*
	 * Method for Adding Users To an Organization
	*/
		
	public void addUserToOrg(String orgInput) throws Exception {
		clickUserAdminButton();
		WAITFORVISIBLEELEMENT(driver, inviteUserButton);
		CLICK(inviteUserButton, "Invite User button is clicked");
		WAITFORVISIBLEELEMENT(driver, emailAddressInput);
		CLICK(emailAddressInput, "Email Address Input is clicked");
		ENTERTEXT(selectOrganizationInput, "111test111");
		SELECTDROPDOWNVALUE("//section[@id='bre-select-null-0']", "111test111");
		CLICK(selectRolesInput, "Select Roles Input is clicked");
		SELECTVALUEDROPDOWN("//section[@class='select_bre-select__menu__kZzhM scrollbar']//label[contains(text(), '"+ orgInput +"')]')]", "");
		CLICK(addUserButton, "Add User button is clicked");
	}
}