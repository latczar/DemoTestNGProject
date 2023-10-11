package tests.UnitTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.breeam.pages.Assessments;
import com.breeam.pages.Assets_AssessmentsPage;
import com.breeam.pages.Assets_CreateAssetsPage;
import com.breeam.pages.LoginPage;
import com.breeam.pages.UserAdmin;
import com.breeam.pages.UserPage;
import com.breeam.pages.UserPage_CreateOrganizations;

import base.CommonFunctions;
import base.UserDefinedFunctions;
import reporting.TestListener;
import util.Constant;

public class Test_Assessment_assertValidationStatementDisabled extends TestListener {
	
	/*
	 * Variables declaration 
	*/
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	LoginPage loginPage;
	Assessments assessments;
	UserDefinedFunctions baseTest;
	WebDriver driver;
	TestListener testReport;
	
	//Constructor to access TestListener superclass 
	public Test_Assessment_assertValidationStatementDisabled() throws IOException {
		super();
	}
	
	/*
	 * Set up test environment
	 * Invocation/Initialization of objects for ff classes
	*/

	@BeforeMethod
	public void before() throws IOException, Exception {
		CommonFunctions.INVOKECHROMEBROWSER();
		CommonFunctions.CONFIGFILEREADER(CommonFunctions.credsFilePath); // Read Config File reader
		loginPage = new LoginPage();
		baseTest = new UserDefinedFunctions();
		assessments = new Assessments();
	}
	
	/*
	 * Start Test case execution
	*/

	@Test()
	public void Test_validationStatementIsDisabled() throws Exception {
		loginPage.Login();
		//input Assessment Name
		assessments.assertValidationStatementDisabled("RegressionAssetTest");
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