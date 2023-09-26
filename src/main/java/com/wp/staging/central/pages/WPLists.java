package com.wp.staging.central.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learnautomation.helper.Utility;

public class WPLists {
	
	WebDriver driver;
	
	public WPLists(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By createListLink = By.xpath("(//a[contains(@href,'lists')])[2]");
	
	By lists = By.xpath("//ul[contains(@class,'primary')]//following::a[contains(@href,'lists')]");
	
	public void createList()
	{
		Utility.WebElementwait(driver, createListLink).click();
	}
	
	public void listIdentify(String listname)
	{
		List<WebElement> list1 = driver.findElements(lists);
		for(WebElement abc : list1)
		{
			String value = abc.getText();
			System.out.println(value);
			if(value.contains(listname))
			{
				System.out.println("TC Passed");
				
			}
			
		}
		
	}

}
