package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPPlans {

	WebDriver driver;
	
	public WPPlans(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By allPlan = By.xpath("((//span[@class='plan-amount plan-amount-annual'])[2]//preceding::h4)[5]");
	
	
	public String plansPageVerify()
	{
		String text = Utility.WebElementwait(driver, allPlan).getText();
		return text;
		
	}
}
