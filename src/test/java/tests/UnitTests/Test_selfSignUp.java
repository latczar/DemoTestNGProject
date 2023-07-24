package tests.UnitTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.zensar.pages.LoginPage;
import com.zensar.pages.LoginPage_SelfSignUp;
import com.zensar.pages.UserPage;

import base.CommonFunctions;
import base.UserDefinedFunctions;
import reporting.TestListener;
import util.Constant;

public class Test_selfSignUp extends TestListener {
	
	/*
	 * Variables declaration 
	*/
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	LoginPage loginPage;
	LoginPage_SelfSignUp selfSignUp;
	UserPage userPage;
	UserDefinedFunctions baseTest;
	WebDriver driver;
	TestListener testReport;
	
	//Constructor to access TestListener superclass 
	public Test_selfSignUp() throws IOException {
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
		CommonFunctions.CONFIGFILEREADER(CommonFunctions.propertyFilePath); // Read Config File reader
		loginPage = new LoginPage();
		selfSignUp = new LoginPage_SelfSignUp();
		baseTest = new UserDefinedFunctions();
		userPage = new UserPage();
	}
	
	/*
	 * Start Test case execution
	*/

	@Test()
	public void Test_userSelfSignUp() throws Exception {
		selfSignUp.UserSelfSignUp(); // User self sign up
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