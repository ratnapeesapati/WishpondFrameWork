package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class Doorman {

	public WebDriver driver;
	
 public Doorman(WebDriver driver)
	{
		this.driver = driver;
	}
	
  By doormanTextField = By.xpath("//input[@type='text']");
  
  By addFeatureButton = By.xpath("(//input[@type='submit'])[2]");
  
  By doormanCheck = By.xpath("(//input[@type='submit'])[3]");
  
  By successMsg = By.xpath("//div[@level='success']");
  
  By loginasMerchant = By.xpath("//a[text()='Login as this merchant']");
  
  public void doorman(String doormankey)
  {
	  Utility.WebElementwait(driver, doormanTextField).sendKeys(doormankey);
	  Utility.WebElementwait(driver, addFeatureButton).click();
  }
  
  public String doormancheck(String doormanvalidate)
  {
	  String text = Utility.WebElementwait(driver, doormanCheck).getAttribute("value");
	  return text;
  }
  
  public String successMsgCheck(String successmsg)
  {
	  String text =Utility.WebElementwait(driver, successMsg).getAttribute("innerHTML");
	  return text;
  }
  
  public void login()
  {
	  Utility.WebElementwait(driver, loginasMerchant).click();
  }
	
  
}
