package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class Adminhomepage {
	
	public WebDriver driver;
	
	public Adminhomepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchBox = By.xpath("(//input[@name='query'])[1]");
	
	By submit = By.xpath("(//button[@type='Submit'])[1]");
	
	By wishpondLogo = By.xpath("//a[normalize-space()='Wishpond']");
	
	By newSubscription = By.xpath("(//a[contains(@href,'subscription')])[2]");
	
	By doorman = By.xpath("//a[normalize-space()='Doorman']");
	
	public Boolean wishpondLogo()
	{
		Boolean status = Utility.WebElementwait(driver, wishpondLogo).isDisplayed();
		return status;
	}
	
	public void searchMerchant(String merchantid)
	{
		Utility.WebElementwait(driver, searchBox).sendKeys(merchantid);
		Utility.WebElementwait(driver, submit).click();
		
	}
	
	public void newSubscription()
	{
		Utility.WebElementwait(driver, newSubscription).click();
	}
	
	public void doorman()
	{
		Utility.WebElementwait(driver, doorman).click();
	}
	
	
}
