package com.wp.staging.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPChooseAutomation {
	
	WebDriver driver;
	
	public WPChooseAutomation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By standardLink = By.xpath("(//div[@class='panel'])[1]");
	
	public void standardauto()
	{
		Utility.WebElementwait(driver, standardLink).click();
	}

}
