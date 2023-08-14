package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPNewsletter {

	public WebDriver driver;
	
	public WPNewsletter(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By name = By.xpath("//input[@name='name']");
	
	By nextButton1 = By.xpath("//button[normalize-space()='Next']");
	
	By arrowDropdown = By.xpath("//i[text()='arrow_drop_down']");
	
		public void newsLetter()
		{
			Utility.WebElementwait(driver, name).clear();
			Utility.WebElementwait(driver, name).sendKeys("Automated Newsletter");
			
		}
}
