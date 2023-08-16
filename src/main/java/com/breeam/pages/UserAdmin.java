package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;

public class UserAdmin extends CommonFunctions {
	
	@FindBy(xpath="//a[contains(text(),'User admin')]") 
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
	
	@FindBy(xpath="(//section[@data-testid='bre-inputcontainer']//input)[2]")
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
	    Extent.getTest().info("User Admin Menu button is clicked");
	}

	public void clickAssessorButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, assessorButton);
	    CLICK(assessorButton, "Assessor Menu button is clicked");
	    Extent.getTest().info("Assessor Menu button is clicked");
	}

	public void clickLicenceConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, licenceConfigButton);
	    CLICK(licenceConfigButton, "Licence Config Menu button is clicked");
	    Extent.getTest().info("Licence Config Menu button is clicked");
	}

	public void clickOrganizationButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, organisationButton);
	    CLICK(organisationButton, "Organization Menu button is clicked");
	    Extent.getTest().info("Organization Menu button is clicked");
	}

	public void clickRoleConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, roleConfigButton);
	    CLICK(roleConfigButton, "Role Config Menu button is clicked");
	    Extent.getTest().info("Role Config Menu button is clicked");
	}

	public void clickUserOrganizationConfigButton() throws Exception {
	    WAITFORVISIBLEELEMENT(driver, userOrganizationConfigButton);
	    CLICK(userOrganizationConfigButton, "User Organization Config Menu button is clicked");
	    Extent.getTest().info("User Organization Config Menu button is clicked");
	}
	
	public void assertInvitationSentToastMessage() throws Exception {
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Inviation sent successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Inviation sent successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Invitation Sent Successfully toast message displayed");
	}
	
	/*
	 * Method for Adding Users To an Organization
	*/
		
	public void addUserToOrg(String roleInput) throws Exception {
		clickUserAdminButton();
		WAITFORVISIBLEELEMENT(driver, inviteUserButton);
		CLICK(inviteUserButton, "Invite User button is clicked");
		Extent.getTest().info("Invite User button clicked");
		
		WAITFORVISIBLEELEMENT(driver, emailAddressInput);
		CLICK(emailAddressInput, "Email Address Input is clicked");
		Extent.getTest().info("Email Address clicked");
		
		ENTERTEXT(emailAddressInput, "111test111@email.com");
		Extent.getTest().info("Email Address entered");
		ENTERTEXT(selectOrganizationInput, "111test111");
		Extent.getTest().info("Organization entered");
		ROBOTENTER();
		Thread.sleep(3000);
		CLICK(selectRolesInput, "Select Roles Input is clicked");
		ENTERTEXT(selectRolesInput, roleInput);
		Extent.getTest().info("Role selected" + roleInput);
		HOVERANDCLICK(roleInput);
		CLICK(addUserButton, "Add User button is clicked");
		Extent.getTest().info("Add User button clicked, invitation sent");
		assertInvitationSentToastMessage();
	}
}