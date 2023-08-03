package com.wp.staging.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPMarketingAutomation {
	
	WebDriver driver;
	
	public WPMarketingAutomation(WebDriver driver)
	{
		this.driver = driver;
	}

	By leadPropCon = By.xpath("(//btn[contains(@class,'btn')])[4]/span");
	
	By leadPropCaret = By.xpath("//i[@class='fa fa-caret-down']");
	
	By email = By.xpath("//h5[normalize-space()='Email']");
	
	public void leadProdCon()
	{
		Utility.WebElementwait(driver, leadPropCon).click();
		Utility.WebElementwait(driver, leadPropCaret).click();
		Utility.WebElementwait(driver, email).click();
	}
	
	
	
	
}
