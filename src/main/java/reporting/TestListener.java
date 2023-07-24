package reporting;

import base.CommonFunctions;
import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import java.text.SimpleDateFormat;

public class TestListener extends ExtentManager implements ITestListener {
	
	public static WebDriver driver;
	public static TakesScreenshot ts;
	public static File f;
	public static String ssPath;
	public static String imageName;
	public static ExtentTest testReport;
	
	@BeforeMethod
	public void setUpLogger(ITestResult result) {
		testReport = ExtentManager.initializeReport().createTest(result.getMethod().getMethodName());
		Extent.setTest(testReport);
	}
		
	@AfterMethod
	public static void sparkTestResult(ITestResult result) throws Exception {
			
		if(result.getStatus() == ITestResult.FAILURE) {
			testReport.log(Status.FAIL, "Test FAILED - " +  result.getName());
			testReport.log(Status.FAIL, "Test FAILED - " +  result.getMethod());
			testReport.log(Status.FAIL, "Test FAILED - " + result.getThrowable());
			
	    	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        TakesScreenshot ts = (TakesScreenshot) CommonFunctions.driver;
	        File f = ts.getScreenshotAs(OutputType.FILE);
	        String filePath = "./test-output/FailedTestsScreenshots/"+ result.getName() + " - " + dateName + ".jpg";
	        FileUtils.copyFile(f, new File(filePath));
	        
	        Extent.getTest()
	        .fail(MediaEntityBuilder
            .createScreenCaptureFromBase64String(CommonFunctions.CONVERTIMG_BASE64(filePath)).build());
		}
		else if (result.getStatus() == ITestResult.SKIP) {
			testReport.log(Status.SKIP, "Test SKIPPED - " +  result.getName());
		}
		else if (result.getStatus() == ITestResult.SUCCESS) {
			testReport.log(Status.PASS, "Test PASSED - " +  result.getName());
		}
	}
		
	@AfterSuite
	public void saveData() {
		ExtentManager.initializeReport().flush();
	}
}