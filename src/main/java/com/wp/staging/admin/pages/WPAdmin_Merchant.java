package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPAdmin_Merchant {
	
	public WebDriver driver;
	
	public WPAdmin_Merchant(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By summary = By.xpath("//a[text()='Summary']");
	
	By loginAsMerchant = By.xpath("//a[text()='Login as this merchant']");
	
	
	public Boolean summaryExists()
	{
	    Boolean status = Utility.WebElementwait(driver, summary).isDisplayed();
		return status;
	}
	
	public void loginAsMerchant()
	{
		Utility.WebElementwait(driver, loginAsMerchant).click();
	}
}
