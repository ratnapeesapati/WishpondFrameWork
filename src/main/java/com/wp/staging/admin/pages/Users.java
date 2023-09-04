package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class Users {
	
	public WebDriver driver;
	
	public Users(WebDriver driver)
	{
		this.driver = driver;
	}

	By createUser = By.xpath("//a[text()='Create a new user']");
	
	public void createuser()
	{
		Utility.WebElementwait(driver, createUser).click();
	}
}