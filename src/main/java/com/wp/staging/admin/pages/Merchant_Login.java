package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class Merchant_Login {
	
	public WebDriver driver;
	
	public Merchant_Login(WebDriver driver)
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
