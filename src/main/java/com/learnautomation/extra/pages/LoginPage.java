package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class LoginPage {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By newUserLink=By.linkText("New user? Signup");
	
	private By errorMessage=By.className("errorMessage");

	private By username=By.id("email1");

	private By password=By.id("password1");
	
	private By loginButton=By.className("submit-btn");
	
	
	public void  clickOnNewUserLink()
	{
		//driver.findElement(newUserLink).click();
		Utility.WebElementwait(driver, newUserLink).click();
		
	}

	public void loginToApplication(String uname,String pass)
	{

	//	driver.findElement(username).sendKeys(uname);
		Utility.WebElementwait(driver, username).sendKeys(uname);
	//	driver.findElement(password).sendKeys(pass);
		Utility.WebElementwait(driver, password).sendKeys(pass);
	//	driver.findElement(loginButton).click();
		Utility.WebElementwait(driver, loginButton).click();
		
	}
	
	public String captureErrorMessage()
	{
		//String error_msg=driver.findElement(errorMessage).getText();
		String error_msg = Utility.WebElementwait(driver, errorMessage).getText();
		
		return error_msg;
	}
	
}