package com.wp.staging.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	
By merchanttoggle = By.xpath("(//a[@class='dropdown-toggle'])[1]");
	
	By usersLink = By.xpath("//a[text()='Users']");
	
	By userslink2 = By.xpath("//a[text()='Users']");
	
	By logout = By.xpath("//a[contains(@href,'logout')]");
	

	public void users()
	{
		Actions act = new Actions(driver);
		WebElement merchantlink = Utility.WebElementwait(driver, merchanttoggle);
		act.moveToElement(merchantlink).perform();
	}
	
	public void logout()
	{
		Utility.WebElementwait(driver, logout).click();
	}
	
	public void userslink()
	{
		Utility.WebElementwait(driver, userslink2).click();
	}
	
	
	
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
