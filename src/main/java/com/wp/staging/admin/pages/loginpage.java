package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class loginpage {
	
	public WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By googleSignin = By.xpath("(//div[contains(@class,'logo')])[1]");
	
	public GSigninPage googleSignin()
	{
		GSigninPage gsignin = new GSigninPage(driver);
		Utility.WebElementwait(driver, googleSignin).click();
		return gsignin;
	}

}
