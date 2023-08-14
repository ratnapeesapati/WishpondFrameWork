package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learnautomation.helper.Utility;

public class GPwdPage {
	
	public WebDriver driver;
	
	public GPwdPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By passwordField = By.xpath("//input[@type='password']");
	
	By nextButton = By.xpath("//span[text()='Next']");
	
	
	
	public Boolean pwdPageValidate()
	{
		WebElement passwordfield1 = Utility.WebElementwait(driver, passwordField);
		Boolean status = passwordfield1.isDisplayed();
		return status;
	}
	
	public Adminhomepage gPwd(String password)
	{
		Utility.WebElementwait(driver, passwordField).sendKeys(password);
		Utility.WebElementwait(driver, nextButton).click();
		Adminhomepage adminhome = new Adminhomepage(driver);
		return adminhome;
	}

}
