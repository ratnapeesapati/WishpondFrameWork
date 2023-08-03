package com.wp.staging.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPDetailedCampaigns {
	
	WebDriver driver;
	
	public WPDetailedCampaigns(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By automationLink = By.xpath("(//a[contains(@class,'create_rule')])[1]");
	
	public void automationClick()
	{
	
		Utility.JSclick(driver, automationLink);
	}


}
