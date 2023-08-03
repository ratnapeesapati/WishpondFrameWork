package com.learnautomation.extra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;
import com.wp.staging.admin.pages.loginpage;

public class homepage {
	
	public WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Login = By.xpath("//a[text()='LOG IN']");
	
	
	
	public loginpage login()
	{
		Utility.WebElementwait(driver, Login).click();
		loginpage login1 = new loginpage(driver);
		return login1;
		
	}
	


}
