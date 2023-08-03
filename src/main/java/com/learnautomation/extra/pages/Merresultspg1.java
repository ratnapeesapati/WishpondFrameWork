package com.learnautomation.extra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class Merresultspg1 {
	
	public WebDriver driver;
	
	public Merresultspg1(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By Merchantlink = By.xpath("//a[normalize-space()='Merchant']");
	
	public Merresultspg2 merchantLink()
	{
		Utility.WebElementwait(driver, Merchantlink).click();
		Merresultspg2 mer = new Merresultspg2(driver);
		return mer;
	}
	
	public Boolean merchantVerify()
	{
		Boolean status = Utility.WebElementwait(driver, Merchantlink).isDisplayed();
		return status;
	}
	

}
