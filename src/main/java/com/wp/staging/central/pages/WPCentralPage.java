package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learnautomation.helper.Utility;

public class WPCentralPage {
	
	public WebDriver driver;
	
	public WPCentralPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By merchantUsername = By.xpath("//a[contains(@class,'dropdown_toggle')]");
	
	By returntoAdminlink = By.xpath("//a[text()='Return to admin']");
	
	By merchantName = By.xpath("//a[@id='nav_account']");
	
	By leadsLink = By.xpath("//a[@id='nav_contacts']");
	
	By createFolder = By.xpath("(//span[normalize-space()='Create Folder'])[2]");
	
	By folderNameField =By.xpath("//input[@name='name']");
	
	By saveButton = By.xpath("//button[normalize-space()='Save']");
	
	By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
	
	By folderSuccessMsg = By.xpath("//div[normalize-space()='The Folder Test Folder has been created!']");
	
	By folderMsginRed = By.xpath("//div[normalize-space()='Please enter a folder name']");
	
	By websiteCreateButton = By.xpath("(//a[contains(@class,'website')])[2]");
	
   By viewMoreButton = By.xpath("//div[normalize-space()='View More']");
	
	By searchByName = By.xpath("(//input[@placeholder='Search by Name'])[2]");
	
	By campaignResult = By.xpath("(//a[@class='ng-binding ng-scope'])[1]");
	
	
	
	
  public Boolean merchantName()
	{
		Boolean successfullogin = Utility.WebElementwait(driver, merchantName).isDisplayed();
		return successfullogin;
	}
	
	
	public void  returnToAdmin()
	{
        Utility.WebElementwait(driver, merchantUsername).click();
		Utility.WebElementwait(driver, returntoAdminlink).click();
	
	}
	
	public String campaignResult()
	{
		WebElement CampaignResult = driver.findElement(campaignResult);
          String text = CampaignResult.getText();
	    return text;
	}
	public WPLeadsPage leadsPage()
	{
		Utility.WebElementwait(driver, leadsLink).click();
		WPLeadsPage leads = new WPLeadsPage(driver);
		return leads;
	}
	
	public void createFolderPopup()
	{
		Utility.WebElementwait(driver, createFolder).click();
		
	}
	
	public Boolean folderPopupExists()
	{
		Boolean folderexists = Utility.WebElementwait(driver, createFolder).isDisplayed();
		return folderexists;
	}
	
	public void createFolder()
	{
	Utility.WebElementwait(driver, folderNameField).sendKeys("Test Folder");
	Utility.WebElementwait(driver, saveButton).click();
	
	}
	
	public Boolean folderSuccessMsg()
	{
		Boolean foldersuccessmsg = Utility.WebElementwait(driver, folderSuccessMsg).isDisplayed();
		return foldersuccessmsg;
	}
	
	public void createFolderNegative()
	{
		Utility.WebElementwait(driver, saveButton).click();
	}
	public Boolean folderMsgExists()
	{
		Boolean Foldermsgexists = Utility.WebElementwait(driver, folderMsginRed).isDisplayed();
		return Foldermsgexists;
	}
	
	public void createWebsite()
	{
		Utility.WebElementwait(driver, websiteCreateButton).click();
	}
	
	public void viewMore()
	{
		Utility.WebElementwait(driver, viewMoreButton).click();
		
	}
	
	public void searchByName(String campaignName)
	{
		Utility.WebElementwait(driver, searchByName).sendKeys(campaignName);
	}
	
	

	
}
