package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class loginpage {
	
	protected  WebDriver driver;

	public loginpage(WebDriver loginpagedriver)
	{
		this.driver = loginpagedriver;
	}
	
	By googleSignin = By.xpath("(//div[contains(@class,'logo')])[1]");
	
	public GSigninPage googleSignin()
	{
		GSigninPage gsignin = new GSigninPage(driver);
		Utility.WebElementwait(driver, googleSignin).click();
		return gsignin;
	}

}
