package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPPhotoContest {
	
	WebDriver driver;
	
	public WPPhotoContest(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By contestTemplate = By.xpath("(//img)[2]");
	
	public void photoContest()
	{
		Utility.JSclick(driver, contestTemplate);
	}

}
