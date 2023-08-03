package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPMerchantSearch {
	
	public WebDriver driver;
	
	public WPMerchantSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchBox = By.xpath("(//input[@name='query'])[1]");
	
	By submit = By.xpath("(//button[@type='Submit'])[1]");
	
	By wishpondLogo = By.xpath("//a[normalize-space()='Wishpond']");
	
	public Boolean wishpondLogo()
	{
		Boolean status = Utility.WebElementwait(driver, wishpondLogo).isDisplayed();
		return status;
	}
	
	
	
	public void searchMerchant()
	{
		Utility.WebElementwait(driver, searchBox).sendKeys("6");
		Utility.WebElementwait(driver, submit).click();
		
	}
	
	
}
