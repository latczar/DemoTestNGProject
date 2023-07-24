package reporting;

import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports report;
	
	@BeforeTest
	public static ExtentReports initializeReport() {
		if(report == null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/SparkReport/SparkAutoTest.html");
			report = new ExtentReports();
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			spark.config().setDocumentTitle("ProForms Report");
			
			report.attachReporter(spark);
		}
		return report;
	}	
/*
            // attach the desired information on the report
            extent.setSystemInfo("Host Name", "Machine name here");
            extent.setSystemInfo("Environment", "Environment name here");
            extent.setSystemInfo("User Name", "Automation User");
            htmlReporter.config().setDocumentTitle("Document title here");
            htmlReporter.config().setReportName("Report name here");
            htmlReporter.config().setChartVisibilityOnOpen(true);
            htmlReporter.config().setTheme(Theme.DARK);
            htmlReporter.loadXMLConfig("html-config.xml"); 
*/
}