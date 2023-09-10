package tests.UnitTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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

public class Test_createAssessment extends TestListener {
	
	/*
	 * Variables declaration 
	*/
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	LoginPage loginPage;
	Assets_CreateAssetsPage createAsset;
	Assets_AssessmentsPage assessments;
	UserDefinedFunctions baseTest;
	WebDriver driver;
	TestListener testReport;
	
	//Constructor to access TestListener superclass 
	public Test_createAssessment() throws IOException {
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
		createAsset = new Assets_CreateAssetsPage();
		assessments = new Assets_AssessmentsPage();
	}
	
	/*
	 * Start Test case execution
	*/

	@Test()
	public void Test_createAnAssessment() throws Exception {
		loginPage.Login();
		createAsset.createAsset_Building(); // Start Asset creation - Building
		assessments.createAssessmentsFromAssetDetailPage(); // Start Assessment Creation
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