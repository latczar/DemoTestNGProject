package tests.UnitTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.zensar.pages.LoginPage;
import com.zensar.pages.UserAdmin;
import com.zensar.pages.UserPage;
import com.zensar.pages.UserPage_CreateOrganizations;

import base.CommonFunctions;
import base.UserDefinedFunctions;
import reporting.TestListener;
import util.Constant;

public class Test_addUserToOrganization extends TestListener {
	
	/*
	 * Variables declaration 
	*/
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	LoginPage loginPage;
	UserAdmin userAdmin;
	UserDefinedFunctions baseTest;
	WebDriver driver;
	TestListener testReport;
	
	//Constructor to access TestListener superclass 
	public Test_addUserToOrganization() throws IOException {
		super();
	}
	
	/*
	 * Set up test environment
	 * Invocation/Initialization of objects for ff classes
	*/

	@BeforeMethod
	public void before() throws IOException, Exception {
		CommonFunctions.INVOKECHROMEBROWSER();
		CommonFunctions.CONFIGFILEREADER(CommonFunctions.propertyFilePath); // Read Config File reader
		loginPage = new LoginPage();
		baseTest = new UserDefinedFunctions();
		userAdmin = new UserAdmin();
	}
	
	/*
	 * Start Test case execution
	*/

	@Test()
	public void Test_addUserToOrg() throws Exception {
		loginPage.Login();
		userAdmin.addUserToOrg("Assessment Manager"); // Add user to organization
	}
	
	/*
	 * Stop execution for test case 
	 * Browser teardown
	 * Quit driver instance 
	*/

	@AfterTest
	public void closeBrowser() {
		CommonFunctions.driver.quit();
	}
}