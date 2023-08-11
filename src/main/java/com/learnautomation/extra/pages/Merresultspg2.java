package com.learnautomation.extra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;
import com.wp.staging.admin.pages.Merchant_Login;

public class Merresultspg2 {
	
public WebDriver driver;
	
	public Merresultspg2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By merchantresults = By.xpath("(//a[contains(@href,'admin/merchants')])[3]");
	
	public Merchant_Login merResults()
	{
		Utility.WebElementwait(driver, merchantresults).click();
		Merchant_Login merlink = new Merchant_Login(driver);
		return merlink;
	}
	
	public Boolean merchantVerify()
	{
		Boolean status = Utility.WebElementwait(driver, merchantresults).isDisplayed();
		return status;
	}
	

}
