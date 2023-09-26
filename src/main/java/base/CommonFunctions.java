package base;

import reporting.Extent;
import util.Constant;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.codec.binary.Base64;

public class CommonFunctions {

	static BufferedReader reader;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties obj;
	public static String xpathKey;
	public static String addValue;
	public static int caption;

	// static String defaultDirectory = System.getProperty("user.dir") +
	// "\\src\\test\\resources\\ActualReportFiles";
	public static String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ObjectRepository\\projectConfig.properties";
	public static String credsFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ObjectRepository\\creds.properties";
	public static String testEnvURL = " https://wa-breeam-platform-test-uk-south-001.azurewebsites.net/";
	
	public static void INVOKECHROMEBROWSER() throws IOException, InterruptedException {
		//WebDriverManager.chromedriver().create();
		ChromeOptions opt = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		opt.addArguments("--no-sandbox");
		opt.addArguments("enable-automation");
		opt.addArguments("--disable-infobars");
		opt.addArguments("--disable-features=VizDisplayCompositor");
		opt.addArguments("--disable-dev-shm-usage");
		opt.addArguments("--disable-browser-side-navigation");
		opt.addArguments("--disable-gpu");
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-web-security");
		opt.addArguments("--no-proxy-server");
		opt.addArguments("enable-cookies");
		opt.setExperimentalOption("prefs", prefs);
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		opt.setExperimentalOption("useAutomationExtension", false);
		
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("download.prompt_for_download", false);
		prefs.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
		prefs.put("plugins.always_open_pdf_externally", true);
		
		driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		
		// Define Test Environment - SIT or SAT
		driver.get(CommonFunctions.testEnvURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void CONFIGFILEREADER(String propFile) {
		try {
			reader = new BufferedReader(new FileReader(propFile));
			obj = new Properties();

			try {
				obj.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void CREDFILEREADER(String propFile) {
		try {
			reader = new BufferedReader(new FileReader(propFile));
			obj = new Properties();

			try {
				obj.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void ENTERTEXT(WebElement element, String value) throws Exception {
		WAITFORVISIBLEELEMENT(driver, element);
		element.click();
		WAITFORVISIBLEELEMENT(driver, element);
		// element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(value);

	}

	public static void SENDKEYSTAB(WebElement element) throws Exception {
		element.sendKeys(Keys.TAB);
	}
	
	public static void SENDKEYSTABANDCLICK(WebElement element) throws Exception {
		element.sendKeys(Keys.TAB);
		element.click();
	}

	public static void SENDKEYSENTER(WebElement element) throws Exception {
		element.sendKeys(Keys.ENTER);
	}

	public void CLICK(WebElement element, String locator) throws Exception {
		// ***** Test Step - description *****
		String tcStepDesc = "Click on '" + locator + "'";
		System.out.println(tcStepDesc);
		element.click();
	}

	public static void WAITFORVISIBLEELEMENT(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(100);
			// Waiting for element visibility of element
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void WAITINVISIBILITYOFELEMENT(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String CONVERTIMG_BASE64(String screenshotPath) throws IOException {
		byte[] file = FileUtils.readFileToByteArray(new File(screenshotPath));
		String base64Img = Base64.encodeBase64String(file);
		return base64Img;
	}

	public static WebElement ELEMENT(String xpathKey) {
		WebElement element = driver.findElement(By.xpath(obj.getProperty(xpathKey)));
		return element;
	}

	public String GETTEXT(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpathKey));
		String txt = element.getText();
		return txt;
	}

	public String GETTEXTJS(String xpath) {
		String text = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;",
				driver.findElement(By.xpath(obj.getProperty(xpath))));
		return text;
	}

	public String GETVALUE(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpathKey));
		String txt = element.getAttribute("value");
		return txt;
	}

	public String GETVALUEJS(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String value = (String) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].getAttribute('value');", element);
		return value;
	}

	public String GETINNERTXTJS(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String value = (String) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].getAttribute('innerText');", element);
		return value;
	}

	public WebElement ELEMENTSTRING(String xpathKey) {
		WebElement element = driver.findElement(By.xpath(xpathKey));
		return element;
	}

	public static void CLICKONELEMENT(String xpathKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(obj.getProperty(xpathKey))));
		driver.findElement(By.xpath(obj.getProperty(xpathKey))).click();
	}

	public void CLICKONELEMENTBYID(String idKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(obj.getProperty(idKey))));
		driver.findElement(By.id(obj.getProperty(idKey))).click();
	}

	public static void CLICKONELEMENTJS(String xpathKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathKey)));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath(xpathKey)));
	}

	public static void ACTIONONELEMENT(String xpathKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(obj.getProperty(xpathKey)))).click().build().perform();
	}

	public static void SCROLLDOWN(String xpathKey) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(obj.getProperty(xpathKey))));
	}

	public void GETNEWWINDOW(WebDriver driver) {
		for (String windowName : driver.getWindowHandles()) {
			driver.switchTo().window(windowName);
		}
	}

	public static void SENDKEYSBYXPATH(String xpathKey, String data) {
		driver.findElement(By.xpath(obj.getProperty(xpathKey))).sendKeys(obj.getProperty(data));
	}

	public static void SENDKEYS(String xpathKey, String data) {
		driver.findElement(By.xpath(obj.getProperty(xpathKey))).sendKeys(data);
	}

	public static void SENDKEYSVIAXPATH(String xpath, String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	public void SENDKEYSBYNAME(String nameKey, String data) {
		driver.findElement(By.name(obj.getProperty(nameKey))).sendKeys(obj.getProperty(data));
	}

	public void SENDKEYSBYID(String idKey, String data) {
		driver.findElement(By.id(obj.getProperty(idKey))).sendKeys(obj.getProperty(data));
	}

	public void SENDKEYSACTION(String xpath, String data) {
		Actions action = new Actions(driver);
		driver.findElement(By.xpath(obj.getProperty(xpath))).sendKeys(data);
		action.sendKeys(Keys.RETURN);
	}

	public void SENDKEYSBYCLASSNAME(String classnameKey, String data) {
		driver.findElement(By.name(obj.getProperty(classnameKey))).sendKeys(obj.getProperty(data));
	}

	public void SENDKEYSJS(String xpath, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(xpath));
		executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].value='data';", element);
	}

	public void SENDKEYSSPACE(String xpathKey, Keys space, Keys backSpace) {
		driver.findElement(By.xpath(obj.getProperty(xpathKey))).sendKeys(space, backSpace);
	}

	public WebElement ELEMENT2(String xpath) {
		WebElement element = driver.findElement(By.xpath(obj.getProperty(xpath)));
		return element;
	}

	public WebElement ELEMENTSTR(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public void SCROLLDOWNXPATH(String xpath) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(xpath)));

	}

	public void WAITFORELEMENTEXISTID(String idKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(obj.getProperty(idKey))));
	}

	public static void WAITFORELEMENTEXISTXPATH(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
		
	public static void WAITFORELEMENTINVISIBILITYXPATH(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}

	public static boolean ISDISPLAYED(String xpath) {
		boolean eleSelected = driver.findElement(By.xpath(obj.getProperty(xpath))).isDisplayed();
		return eleSelected;
	}

	public static void SCROLLINTOVIEW(String xpath) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath((xpath))));
	}

	public void SCROLLINTOVIEWSTRING(String xpath) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
	}

	public static void WAITTOBECLICKEDBYXPATH(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(obj.getProperty(xpath))));
	}

	public static void WAITTOBECLICKEDBYWEBELEMENT(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
	}

	public String GETDEFAULTVALUEDROPDOWN(String xpath) {
		Select dropdown = new Select(driver.findElement(By.xpath(obj.getProperty(xpath))));
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		String actualSelectedOption = selectedOption.getText();
		Extent.getTest().info("Default Selected option is " + actualSelectedOption);
		return actualSelectedOption;
	}
	
	public String GETCURRENTDATE(String format) {
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat(format);

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);
		return date1;
	}

	public void CLEARTEXTBOX(WebElement element) {
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
	}

	public static void ASSERTFIELDVALUE(WebElement element, String expectedValue, String elementName)
			throws IOException {
		// Start validating the values displayed
		boolean result = false;
		// Get string on the area box
		String actualValue = element.getAttribute("value");
		if (actualValue.equals(expectedValue)) {
			result = true;
			Extent.getTest().info(elementName + " Actual value matches expected");
			Extent.getTest().log(Status.PASS, elementName + " Actual value matches expected");
			Assert.assertTrue(result);
		} else {
			Extent.getTest().info(elementName + " Actual value does not matched expected");
		}
	}

	public static void ASSERTFIELDTEXT(WebElement element, String expectedValue, String elementName)
			throws IOException {
		// Start validating the values displayed
		boolean result = false;
		// Get string on the area box
		String actualValue = element.getText();
		if (actualValue.equals(expectedValue)) {
			result = true;
			Extent.getTest().info(elementName + " Actual value matches expected");
			Extent.getTest().log(Status.PASS, elementName + " Actual value matches expected");
			Assert.assertTrue(result);
		} else {
			Extent.getTest().info(elementName + " Actual value does not matched expected");
		}
	}

	public static void ISTEXTNOTDISPLAYED(String text) throws IOException {
		// get page source
		try {
			if (driver.getPageSource().contains(text)) {
				Extent.getTest().info("Text: " + text + " is present. ");
				Extent.getTest().log(Status.FAIL, "Text: " + text + " is present. ");
			} else {
				Extent.getTest().info("Text: " + text + " is not present. ");
				Extent.getTest().log(Status.PASS, "Text: " + text + " is not present. ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public static void SELECTINDEX(WebElement element, int index) {
		Select selectDropDown = new Select(element);
		selectDropDown.selectByIndex(index);
	}

	public void SELECTDROPDOWNVALUE(String xpath, String dropValue) throws Exception {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByValue(dropValue);
	}

	public void SELECTDROPDOWNINDEX(String xpath, int index) throws Exception {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByIndex(index);
	}

	public String GETSELECTEDOPTION(String xpath) {
		Select dropdown = new Select(driver.findElement(By.xpath(obj.getProperty(xpath))));
		WebElement option = dropdown.getFirstSelectedOption();
		String defaultItem = option.getText();
		return defaultItem;
	}

	public static void WAITFORPAGETOLOAD(long timeOutInSeconds) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(expectation);
		} catch (Throwable error) {
			error.printStackTrace();
		}
	}

	public void HANDLESCROLLUP() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-10000)");
	}
	
	public void HANDLESCROLLDOWN() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1000)", "");
	}

	public void ACTIONSSCROLLUP() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
	}

	public void SCROLLTOTOP() {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}

	public void WAITIMPLICITLY(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void MOUSEHOVER(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void ROBOTENTER() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void ROBOTDOWN() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void HOVERANDCLICK(WebElement elementToClick, String hoverOnElement) throws Exception {
	    MOUSEHOVER("//label[contains(text(), '" + hoverOnElement + "')]");
	    elementToClick = driver.findElement(By.xpath("//label[contains(text(), '" + hoverOnElement + "')]"));
	    elementToClick.click();
	}
	
	public void HOVERANDCLICK(String hoverOnElement) throws Exception {
	    MOUSEHOVER("//label[contains(text(), '" + hoverOnElement + "')]");
	    WebElement elementToClick = driver.findElement(By.xpath("//label[contains(text(), '" + hoverOnElement + "')]"));
	    elementToClick.click();
	}
	
	// Method to capture a screenshot of a webpage
	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
	    // Capture screenshot as a file
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 
	    // Define the destination path to save the screenshot
	    String screenshotPath = "./test-output/SparkReport/" + screenshotName + ".png";

	    // Copy the screenshot file to the destination path
	    Files.copy(screenshotFile.toPath(), new File(screenshotPath).toPath());
	}
	
	public static int generateRandomInt() {
		int min = 1;
		int max = 99999;
		Random random = new Random();
	    
		return random.nextInt(max - min + 1) + min;
	}
	
	public void assessmentSelectDropdownInput(String input, WebElement element, WebElement elementToClick) throws Exception {
	    WAITFORVISIBLEELEMENT(driver, element);
	    Thread.sleep(1000);
	    CLICK(elementToClick, elementToClick + " is clicked");
	    CLEARTEXTBOX(elementToClick);
	    ENTERTEXT(elementToClick, input);
	    Extent.getTest().info("Entered text: " + input);
	    MOUSEHOVER("//label[contains(text(), '" + input + "')]");
	    Extent.getTest().info("Hovered over: " + input);
	    ROBOTDOWN(); // To select desired input from the list
	    ROBOTENTER();
	    Extent.getTest().info("Selected input for " + elementToClick + " " + input);
	}
	
	public void assertLabelOrElementDisplayed(String xpath, String labelElementToBeChecked) throws Exception {
		WAITFORELEMENTEXISTXPATH(xpath);
        // Wait for the element to be visible
        WebElement labelElement = driver.findElement(By.xpath(labelElementToBeChecked));
        boolean labelElementPresent = labelElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(labelElementPresent);
        Extent.getTest().info("Successfully asserted: " + labelElement);
	}
}