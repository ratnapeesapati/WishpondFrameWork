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
	
	By searchField = By.xpath("//input[@placeholder='Search by Name']");
	
	By listResult = By.xpath("//ul[contains(@class,'primary')]//following::a[contains(@href,'leads/lists')]");
	
	By listCheckbox = By.xpath("//ul[contains(@class,'primary')]//following::input");
	
	By actionsCheckbox = By.xpath("//i[@class='fa fa-caret-down']");
	
	By deleteButton = By.xpath("//a[@class='wp_table_column_link']");
	
	By listTotal = By.xpath("//ul[contains(@class,'pagination')]/div");
	
	By listSettings = By.xpath("//i[contains(@class,'dropdown_toggle')]");
	
	By listRename = By.xpath("(//a[normalize-space()='Rename'])[1]");
	
	By renamePopupText = By.xpath("//h4[normalize-space()='Rename List']");
	
	By listName = By.name("name");
	
	By saveButton = By.xpath("//button[normalize-space()='Save']");
	
	
	
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
	
	public void listSearch(String listname)
	{
		Utility.WebElementwait(driver, searchField).sendKeys(listname);
	}
	
	public String listResult()
	{
		String text = Utility.WebElementwait(driver, listResult).getText();
		return text;
	}
	
	public void listSelect()
	{
		Utility.WebElementwait(driver, listCheckbox).click();
		Utility.WebElementwait(driver, actionsCheckbox).click();
		Utility.WebElementwait(driver, deleteButton).click();
		driver.switchTo().alert().accept();
	}
	
	public void listDeleteNegative()
	{
		Utility.WebElementwait(driver, listCheckbox).click();
		Utility.WebElementwait(driver, actionsCheckbox).click();
		Utility.WebElementwait(driver, deleteButton).click();
		driver.switchTo().alert().dismiss();
	}
	
	public String listTotal()
	{
		String text = Utility.WebElementwait(driver, listTotal).getText();
		return text;
	}
	
	public String listRenamepopup()
	{
		Utility.WebElementwait(driver, listSettings).click();
		Utility.WebElementwait(driver, listRename).click();
		String text = Utility.WebElementwait(driver, renamePopupText).getText();
		return text;
	}
	
	public void listRename(String newlistname)
	{
		Utility.WebElementwait(driver, listName).clear();
		Utility.WebElementwait(driver, listName).sendKeys(newlistname);
		Utility.WebElementwait(driver, saveButton).click();
		
	}
	
	
	
	
	
	

}
