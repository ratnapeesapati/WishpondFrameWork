package com.wp.staging.admin.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.learnautomation.helper.Utility;

public class NewUser {
	
	public WebDriver driver;
	
	public NewUser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstName = By.name("user[first_name]");
	
	By lastName = By.name("user[last_name]");
	
	By email = By.name("user[email]");
	
	By password = By.name("user[password]");
	
	By confirmPassword = By.name("user[password_confirmation]");
	
	By usertype = By.name("user[user_type]");
	
	By createButton = By.xpath("//input[@type='submit']");
	
	By usertypeoption = By.xpath("//select[@name='user[user_type]']/option[@value='20']");
	
	By usersuccessmsg = By.xpath("//div[@level='success']");
	
	By userrepeatmsg = By.xpath("//span[@class='help-block']");
	
	public String userRepeat()
	{
		String msg = Utility.WebElementwait(driver, userrepeatmsg).getText();
		return msg;
	}

	public void usertype()
	{
		Utility.WebElementwait(driver, usertype).click();
        Utility.WebElementwait(driver, usertypeoption).click();
        driver.findElement(By.tagName("html")).click();
		}
	
	public void createUser(String firstname,String lastname, String useremail, String pass, String passconfirm)
	{
		Utility.WebElementwait(driver, firstName).sendKeys(firstname);
		Utility.WebElementwait(driver, lastName).sendKeys(lastname);
		Utility.WebElementwait(driver, email).sendKeys(useremail);
		Utility.WebElementwait(driver, password).sendKeys(pass);
		Utility.WebElementwait(driver, confirmPassword).sendKeys(passconfirm);
		}
	
  public void create()
	{
        Utility.JSclick(driver, createButton);
	}
  
  public String usermsg()
  {
	 String msg =  Utility.WebElementwait(driver, usersuccessmsg).getText();
	 return msg;
  }
}
