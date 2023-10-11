package tests.UnitTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.breeam.pages.Assets;
import com.breeam.pages.Dashboard;
import com.breeam.pages.LoginPage;
import com.breeam.pages.LoginPage_SelfSignUp;
import com.breeam.pages.UserAdmin;
import base.CommonFunctions;
import base.UserDefinedFunctions;
import reporting.TestListener;
import util.Constant;

public class Test_AssessmentAdminLogin extends TestListener {
	
	/*
	 * Variables declaration 
	*/
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	LoginPage loginPage;
	UserAdmin userAdmin;
	Dashboard dashboard;
	UserDefinedFunctions baseTest;
	WebDriver driver;
	TestListener testReport;
	
	//Constructor to access TestListener superclass 
	public Test_AssessmentAdminLogin() throws IOException {
		super();
	}
	
	/*
	 * Set up test environment
	 * Invocation/Initialization of objects for ff classes
	*/

	@BeforeMethod
	public void before() throws IOException, Exception {
		// class = new class();
		CommonFunctions.INVOKECHROMEBROWSER();
		CommonFunctions.CONFIGFILEREADER(CommonFunctions.credsFilePath); // Read Config File reader
		loginPage = new LoginPage();
		dashboard = new Dashboard();
		baseTest = new UserDefinedFunctions();
	}
	
	/*
	 * Start Test case execution
	*/

	@Test()
	public void Test_assessmentContributorLogin() throws Exception {
		loginPage.Login(Constant.assessmentAdministrator, Constant.userPassword); // User sign in as the ff role
		dashboard.testDashboardMenuButtonExistsAfterLogin();
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