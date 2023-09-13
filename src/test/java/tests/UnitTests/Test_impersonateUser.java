package tests.UnitTests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.breeam.pages.LoginPage;
import com.breeam.pages.UserAdmin;
import base.CommonFunctions;
import base.UserDefinedFunctions;
import reporting.TestListener;
import util.Constant;

public class Test_impersonateUser extends TestListener {
	
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
	public Test_impersonateUser() throws IOException {
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
	public void Test_impersonateAsUser() throws Exception {
		loginPage.Login();
		userAdmin.impersonateUserButtonShouldNotExist("user adminL"); // Enter username of any user you want to impersonate e.g. Lattrell Caesar
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