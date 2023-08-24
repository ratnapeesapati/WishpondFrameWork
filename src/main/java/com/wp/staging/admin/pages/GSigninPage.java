package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class GSigninPage {
	
	public WebDriver driver;
	
	public GSigninPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By email = By.xpath("//input[@type='email']");
	
	By invalidEmail = By.xpath("//div[text()='Couldn’t find your Google Account']");
	
	By nextButton = By.xpath("//span[text()='Next']");
	
	public Boolean signinPageValidate()
	{
		Boolean Status = Utility.WebElementwait(driver, email).isDisplayed();
		return Status;
	}
	
	public GPwdPage gSign(String username)
	{
		Utility.WebElementwait(driver, email).sendKeys(username);
		Utility.WebElementwait(driver, nextButton).click();
		GPwdPage gpwd = new GPwdPage(driver);
		return gpwd;
	}
	
	public String invalidGmail()
	{
		String text = Utility.WebElementwait(driver, invalidEmail).getText();
		return text;
	}
}
