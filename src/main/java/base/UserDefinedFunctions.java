package base;

import reporting.Extent;
import util.Constant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UserDefinedFunctions extends CommonFunctions {

	public void validateButtonState(String expectedState, WebElement buttonElement, String buttonName) {
		if (expectedState.equals("Enabled")) {
			WAITFORVISIBLEELEMENT(driver, buttonElement);
			Assert.assertTrue(buttonElement.isEnabled());
			Extent.getTest().pass(buttonName + " is enabled");
		} else if (expectedState.equals("Disabled")) {

			WAITFORVISIBLEELEMENT(driver, buttonElement);
			Assert.assertFalse(buttonElement.isEnabled());
			Extent.getTest().pass(buttonName + " is disabled");

		} else {
			Extent.getTest().fail(buttonName + "Cannot identify the enabled/disabled property of the button");
		}
	}
	
	// Checks if the button is enabled/disabled
	public void checkButtonState(WebElement buttonName, String state) throws InterruptedException {
		if (state.equals("enabled")) {
			Thread.sleep(2000);
			Assert.assertTrue(buttonName.isEnabled());
			Extent.getTest().pass("Button is enabled as expected");
		} else if (state == "disabled") {
			Thread.sleep(2000);
			Assert.assertTrue(buttonName.isEnabled());
			Extent.getTest().pass("Button is enabled as expected");
		} else {
			Extent.getTest().fail("Button state is not recognized");
			System.out.println("Button state is not recognized");
		}

	}

	public void assertIsEqual(String expected, String actual, String elementName) throws IOException {
		boolean result = expected.equals(actual);
		if (result == true) {
			Extent.getTest().pass(elementName + ": Actual text matches the expected");

		} else {
			Extent.getTest().fail(elementName + ": Actual text does not matched the expected");
			Extent.getTest().info("Expected " + expected + ": " + "Actual " + actual);
		}
	}

	public void assertIsDisplayed(WebElement element, String elementName) throws IOException {
		if (element.isDisplayed() == true) {
			Extent.getTest().pass(elementName + " is displayed");

		} else {
			Extent.getTest().fail(elementName + " is not displayed");
		}
	}
	
	
}