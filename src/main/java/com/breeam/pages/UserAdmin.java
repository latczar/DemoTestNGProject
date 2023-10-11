package com.breeam.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	 * User Admin - inside User details page
	 */
	
	@FindBy(xpath="//span[contains(text(), 'Impersonate user')]")
	WebElement impersonateUserButton;
	
	@FindBy(xpath="//span[contains(text(),'Add to organisation')]")
	WebElement addToOrganisationButton;
	
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
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Invitation sent successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Invitation sent successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Invitation Sent Successfully toast message displayed");
	}
	
//	public void assertImpersonateUserButton() throws Exception {
//	    // Wait for the toast message element to be present in the DOM
//		WebElement impUserButton = driver.findElement(By.xpath("//span[contains(text(), 'Impersonate user')]"));
//
//	    // Assertion to check if the button is not displayed
//	    boolean impUserNotPresent = !impUserButton.isDisplayed();
//	    Assert.assertTrue(impUserNotPresent);
//	    Extent.getTest().info("Impersonate User button is not displayed in the UI");
//	}
	
	public void assertImpersonateUserButtonNotVisible() throws Exception {
		 // Find all elements that match the XPath expression
	    List<WebElement> impUserButtons = driver.findElements(By.xpath("//span[contains(text(), 'Impersonate user')]"));

	    // Check if the list is empty, indicating that the button is not found or not visible
	    boolean impUserNotPresent = impUserButtons.isEmpty();
	    
	    Assert.assertTrue(impUserNotPresent);
	    Extent.getTest().info("Passed - Impersonate User button is not displayed in the UI");
	}

	
	/*
	 * Method for Adding Users To an Organization
	*/
		
	public void addUserToOrg(String roleInput, String organizationInput) throws Exception {
		clickUserAdminButton();
		WAITFORVISIBLEELEMENT(driver, inviteUserButton);
		CLICK(inviteUserButton, "Invite User button is clicked");
		Extent.getTest().info("Invite User button clicked");
		
		WAITFORVISIBLEELEMENT(driver, emailAddressInput);
		CLICK(emailAddressInput, "Email Address Input is clicked");
		Extent.getTest().info("Email Address clicked");
		
		ENTERTEXT(emailAddressInput, "111test111@email.com");
		Extent.getTest().info("Email Address entered");
		ENTERTEXT(selectOrganizationInput, organizationInput);
		Extent.getTest().info("Organization entered");
		ROBOTENTER();
		Thread.sleep(3000);
		CLICK(selectRolesInput, "Select Roles Input is clicked");
		ENTERTEXT(selectRolesInput, roleInput);
		Extent.getTest().info("Role selected " + roleInput);
		HOVERANDCLICK(roleInput);
		CLICK(addUserButton, "Add User button is clicked");
		Extent.getTest().info("Add User button clicked, invitation sent");
		assertInvitationSentToastMessage();
	}
	
	/*
	 * Method for Impersonating Users 
	*/
		
	public void impersonateUserButtonShouldNotExist(String userToImpersonate) throws Exception {
		clickUserAdminButton();
		WAITFORVISIBLEELEMENT(driver, searchInput);
		CLICK(searchInput, "Search input is clicked");
		Extent.getTest().info("Search input is clicked");
		WAITFORELEMENTEXISTXPATH("//table[@data-testid='bre-table']");
		ENTERTEXT(searchInput, userToImpersonate);
		Extent.getTest().info("Entered user: " + userToImpersonate);
		ROBOTENTER();
		Thread.sleep(3000);
		CLICKONELEMENTJS("//a[contains(text(),'" + userToImpersonate + "')]");
		Extent.getTest().info("Opened user details page of " + userToImpersonate);
		WAITFORVISIBLEELEMENT(driver, addToOrganisationButton);
		captureScreenshot(driver, "Try to impersonate as " + userToImpersonate + " " + GETCURRENTDATE("yyyyMMddHHmmss"));
		Extent.getTest().info("Screenshot captured");
		assertImpersonateUserButtonNotVisible();
	}
}