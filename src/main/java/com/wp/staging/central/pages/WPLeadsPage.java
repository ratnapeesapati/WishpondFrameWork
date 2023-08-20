package com.wp.staging.central.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	
	By leadScore = By.xpath("(//input[@type='number'])[1]");
	
	By firstName = By.xpath("(//input[@type='text'])[3]");
	
	By lastName = By.xpath("(//input[@type='text'])[4]");
	
	By firstNameVerify = By.xpath("(//span[@lead-attribute='value'])[1]");
	
	By lastNameVerify = By.xpath("(//span[@lead-attribute='value'])[2]");
	
	By saveNewLead = By.xpath("//button[normalize-space()='Save new lead']");
	
	By cancel = By.xpath("//button[normalize-space()='Cancel']");
	
	By actionsCaret = By.xpath("fa fa-caret-down");
	
	By deletefromAcc = By.xpath("(//ul[@class='dropdown-menu']//following::a[contains(@ng-class,'areSelected')])[1]");
	
	By addtoList = By.xpath("(//ul[@class='dropdown-menu']//following::a[contains(@ng-class,'areSelected')])[2]");
	
	By search = By.xpath("//input[@placeholder='Search by email']");
	
	By leadrecordvalidate = By.xpath("(//a[contains(@href,'central/leads')])[6]/span");
	
	By leadProfile = By.xpath("//a[normalize-space()='Profile']");
	
	By searchLead = By.xpath("//input[@placeholder='Search by email']");
	
	By leadResult = By.xpath("//a[contains(@href,'central/leads')]/span");
	
	By leadDeletecheckbox = By.xpath("(//input[@type='checkbox'])[2]");
	
	By actionsDropDown = By.xpath("(//i[contains(@class,'caret-down')])[1]");
	
	By deleteLead = By.xpath("(//li[contains(@uib-tooltip,'delete')]/a)[1]");
	
	
	
	public Boolean leadsPageVerify()
	{
		Boolean status = Utility.WebElementwait(driver, leadsLink).isDisplayed();
		return status;
	}
	
	public void addNewLeadlink()
	{
		Utility.WebElementwait(driver, addLeadsLink).click();
		Utility.WebElementwait(driver, addNewLead).click();
	}
	
	public void addNewLead(String email, String leadscore,String firstname, String lastname)
	{
		Utility.WebElementwait(driver, emailField).sendKeys(email);
		Utility.WebElementwait(driver, leadScore).sendKeys(leadscore);
		Utility.WebElementwait(driver, firstName).sendKeys(firstname);
		Utility.WebElementwait(driver, lastName).sendKeys(lastname);
		Utility.JSclick(driver, saveNewLead);
     }
	
	public String newLeadvalidate()
   {
	
  String text = Utility.WebDriverWait(driver, leadrecordvalidate).getText();
  return text;
	}
	
	public void leadProfile()
	{
		Utility.WebElementwait(driver, leadProfile).click();
	}
	
	public String leadFirstName()
	{
		String firstname = Utility.WebElementwait(driver, firstNameVerify).getText();
		return firstname;
	}
	
	public String leadLastName()
	{
		String lastname = Utility.WebElementwait(driver, lastNameVerify).getText();
		return lastname;
	}
	
	public void leadSearch(String leademail)
	{
		Utility.WebElementwait(driver, searchLead).sendKeys(leademail);
	}
	
	public String leadResult()
	{
		String text = Utility.WebDriverWait(driver, leadResult).getText();
		return text;
	}
	
	public void leadDelete()
	{
       Utility.JSclick(driver, leadDeletecheckbox);
		Utility.JSclick(driver, actionsDropDown);
		Utility.JSclick(driver, deleteLead);
		driver.switchTo().alert().accept();
	}
	}


