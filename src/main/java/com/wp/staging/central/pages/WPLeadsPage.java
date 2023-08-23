package com.wp.staging.central.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	By leadrecordvalidate = By.xpath("(//span[@display-name='lead'])[1]");
	
	By leadProfile = By.xpath("//a[normalize-space()='Profile']");
	
	By searchLead = By.xpath("//input[@placeholder='Search by email']");
	
	By leadResult = By.xpath("//a[contains(@href,'central/leads')]/span");
	
	By leadDeletecheckbox = By.xpath("(//input[@type='checkbox'])[2]");
	
	By actionsDropDown = By.xpath("(//i[contains(@class,'caret-down')])[1]");
	
	By deleteLead = By.xpath("(//li[contains(@uib-tooltip,'delete')]/a)[1]");
	
	By duplicateLeadmsg = By.xpath("//div[text()='A Lead with this Email already exists']");
	
	By leadDelMsg = By.xpath("(//div[contains(@class,'success')]/i)[1]");
	
	By leadSettings = By.xpath("//div[@class='dropdown-toggle'])[1]");
	
	By leadEdit = By.xpath("//li[normalize-space()='Edit']");
	
	
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
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(leadrecordvalidate));
     String text = Utility.WebDriverWait(driver, leadrecordvalidate).getText();
      return text;
	}
	
	public void leadRecordClick()
	{
		Utility.WebDriverWait(driver, leadrecordvalidate).click();
	}
	
	public void leadProfile()
	{
	  Utility.JSclick(driver, leadProfile);
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
		Utility.JSclick(driver, searchLead);
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
	
	public Boolean leadDeleteCheck()
	{
		Boolean msg = Utility.WebElementwait(driver, leadDelMsg).isDisplayed();
		return msg;
	}
	
	
	public Boolean leadDuplicate()
	{
		Boolean msg = Utility.WebElementwait(driver, duplicateLeadmsg).isDisplayed();
		return msg;
	}
	
	public void leadEdit()
	{
		Utility.JSclick(driver, leadSettings);
		Utility.WebElementwait(driver, leadEdit).click();
	}
	}


