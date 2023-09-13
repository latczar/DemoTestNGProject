package com.breeam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonFunctions;
import reporting.Extent;
import util.Constant;

public class Assets_CopyAssets extends CommonFunctions {
	
	Assets assets = new Assets();
	Assets_CreateAssetsPage createAssets = new Assets_CreateAssetsPage();
	WebElement elementToClick;
	
	@FindBy(xpath="//span[contains(text(),'Copy')]")
	WebElement copyAssetButton;
	
	@FindBy(xpath="(//h1)[2]")
	WebElement copyLabel;
	
	public Assets_CopyAssets() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCopyAsset() throws Exception {
		WAITFORELEMENTINVISIBILITYXPATH("//label[contains(text(), 'Asset created successfully')]");
	    CLICK(copyAssetButton, "Copy Asset button is clicked");
	    Extent.getTest().info("Copy Asset clicked");
	}
	
	public void assertCopyLabelOnPage() throws Exception {
		WAITFORELEMENTEXISTXPATH("(//h1)[2]");
        // Wait for the toast message element to be visible
        WebElement copyLabelElement = driver.findElement(By.xpath("(//h1)[2]"));
        boolean copyLabelPresent = copyLabelElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(copyLabelPresent);
        Extent.getTest().info("User successfully initiated Copy Asset operation");
	}
		
	//Start test cases copy for Assets
	
	public void copyAsset_Building() throws Exception {
		
	    clickOnCopyAsset();
	    createAssets.clickAndEnterNameOfAssetInput(Constant.nameOfCopiedAssetV2);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    assertAssetCopiedToastMessage();
	}
	
	public void assertAssetCopiedToastMessage() throws Exception {
		WAITFORELEMENTEXISTXPATH("//label[contains(text(), 'Asset copied successfully')]");
        // Wait for the toast message element to be visible
        WebElement toastMessageElement = driver.findElement(By.xpath("//label[contains(text(), 'Asset copied successfully')]"));
        boolean toastMessagePresent = toastMessageElement.isDisplayed();

        // Assertion to check if the toast message is present
        Assert.assertTrue(toastMessagePresent);
        Extent.getTest().info("Asset copied successfully toast message displayed");
	}

	
	public void copyAsset_Infrastructure() throws Exception {
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clearAndenterNameOfCopiedAssetInput(Constant.nameOfCopiedAssetV2);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    assertAssetCopiedToastMessage();
	}
	
	public void copyAsset_Community() throws Exception {
		/*
		 * Start Copy Asset Operation
		*/
	    
	    clickOnCopyAsset();
	    createAssets.clearAndenterNameOfCopiedAssetInput(Constant.nameOfCopiedAssetV2);
	    assertCopyLabelOnPage();
	    Thread.sleep(3000);
	    createAssets.clickSave();
	    assertAssetCopiedToastMessage();
	}
}