package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPCreateList {
	
	WebDriver driver;
	
	public WPCreateList(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By listNameField = By.name("name");
	
	By saveListButton = By.xpath("//a[normalize-space()='Save List']");
	
	By listCreationCheck = By.xpath("//span[text()='Static List created.']");
	
	By leadsTab = By.id("nav_contacts");
	
	
	public void createList(String listname)
	{
		Utility.WebElementwait(driver, listNameField).sendKeys(listname);
		Utility.WebElementwait(driver, saveListButton).click();
	}
	
	public boolean listCreationChck()
	{
		boolean status = Utility.WebElementwait(driver, listCreationCheck).isDisplayed();
		return status;
	}
	
	public void leadsTab()
	{
		Utility.WebElementwait(driver, leadsTab).click();
	}

}
