package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.learnautomation.helper.Utility;

public class WPNewsletter {

	public WebDriver driver;
	
	public WPNewsletter(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By name = By.xpath("//input[@name='name']");
	
	By arrowDropdown = By.xpath("//i[text()='arrow_drop_down']");
	
	By namePanel = By.xpath("(//div[@class='wp-wizard__header']//following::span)[2]");
	
	By nameNext = By.xpath("//button[normalize-space()='Next']");
	
	By leadsDropdown = By.xpath("//i[normalize-space()='arrow_drop_down']");
	
	By customFilter = By.xpath("//p[normalize-space()='Custom Filter']");
	
	By addFilter = By.xpath("(//div[@class='custom-filter']//following::button)[1]");
	
	By leadProperty = By.xpath("(//div[@class='ng-binding'])[5]");
	
	By leadScore = By.xpath("//li[normalize-space()='Lead Score']");
	
	By leadscorenumber = By.xpath("//input[@type='number']");

	By doneButton = By.xpath("//div[contains(@class,'primary')]");
	
	By leadsNext = By.xpath("//button[normalize-space()='Next']");
	
	By fromName = By.name("from_name-1");
	
	By fromEmailAddress = By.name("from_address-1");
	
	By fromPanelNext = By.xpath("//button[normalize-space()='Next']");
	
		public String newsletterValidate()
		{
			String text = Utility.WebElementwait(driver, namePanel).getText();
			return text;
		}
		
		public void name(String name1)
		{
			Utility.WebElementwait(driver, name).clear();
			Utility.WebElementwait(driver, name).sendKeys(name1);
			WebElement nameNext1 = Utility.WebElementwait(driver, nameNext);
			Actions act = new Actions(driver);
			act.moveToElement(nameNext1).click().perform();
		
		}
		
		public void chooseLeads(String leadscore)
		{
			Utility.WebElementwait(driver, leadsDropdown).click();
			Utility.WebElementwait(driver, customFilter).click();
			Utility.WebElementwait(driver, addFilter).click();
			Actions act = new Actions(driver);
			WebElement leadProp = Utility.WebElementwait(driver, leadProperty);
			act.moveToElement(leadProp).perform();
			Utility.JSclick(driver, leadScore);
			Utility.WebElementwait(driver, leadscorenumber).sendKeys(leadscore);
			Utility.WebElementwait(driver, doneButton).click();
			Utility.WebElementwait(driver, leadsNext).click();
		}
		
		public void fromPanel(String fromname, String fromemail)
		{
			Utility.WebElementwait(driver, fromName).sendKeys(fromname);
			Utility.WebElementwait(driver, fromEmailAddress).sendKeys(fromemail);
			Utility.WebElementwait(driver, fromPanelNext).click();
		}
		
		
}
