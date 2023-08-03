package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class WPLeadsPage {
	
	public WebDriver driver;
	
	public WPLeadsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By leadsLink = By.xpath("//a[@id='nav_contacts']");
	
	By addLeadsLink = By.xpath("(//span[@class='caret'])[5]");
	
	By addNewLead = By.xpath("//a[normalize-space()='Add new lead']");
	
	By emailField = By.xpath("(//input[@type='text'])[2]");
	
	By saveNewLead = By.xpath("//button[normalize-space()='Save new lead']");
	
	By cancel = By.xpath("//button[normalize-space()='Cancel']");
	
	By actionsCaret = By.xpath("fa fa-caret-down");
	
	By deletefromAcc = By.xpath("(//ul[@class='dropdown-menu']//following::a[contains(@ng-class,'areSelected')])[1]");
	
	By addtoList = By.xpath("(//ul[@class='dropdown-menu']//following::a[contains(@ng-class,'areSelected')])[2]");
	
	By search = By.xpath("//input[@placeholder='Search by email']");
	
	
	
	
	public Boolean leadsPageVerify()
	{
		Boolean status = Utility.WebElementwait(driver, leadsLink).isDisplayed();
		return status;
	}

}
