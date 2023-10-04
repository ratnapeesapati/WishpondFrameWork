package com.wp.staging.central.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	By nameValidate = By.xpath("(//span[contains(@class,'action-title')])[1]");
	
	By filterValidate = By.xpath("//span[text()='Custom Filter']");
	
	By fromNameValidate = By.xpath("(//span[contains(@class,'action-title')])[3]");
	
	By fromEmailValidate = By.xpath("(//span[contains(@class,'action-title')])[4]");
	
	By subjectLine = By.name("subject-1");
	
	By previewText = By.name("preview_text-1");
	
	By subjectPanelNext = By.xpath("//button[normalize-space()='Next']");
	
	By subjectValidate = By.xpath("(//span[contains(@class,'title')])[6]");
	
	By previewtextValidate = By.xpath("(//span[contains(@class,'title')])[7]");
	
	By emailContent = By.xpath("//img[contains(@src,'email-content')]");
	
	By emailContentValidate = By.xpath("//h3[normalize-space()='Choose Template']");
	
	By htmlTemplate = By.xpath("(//div[contains(@class,'template')])[6]");
	
	By chooseButton = By.xpath("(//span[normalize-space()='CHOOSE'])[2]");
	
	By emailBodyValidate = By.xpath("//a[@class='wp_header_link']");
	
	
  By saveButton = By.xpath("//span[normalize-space()='Save & Close']");
  
  By doneButton2 = By.xpath("//button[normalize-space()='Done']");
  
  By sendButton = By.xpath("//span[normalize-space()='Send']");
  
  By sendpopup = By.xpath("//h4[normalize-space()='Send Email Newsletter']");
  
  By sendnowButton = By.xpath("//span[normalize-space()='Send Now']");
  
  By liftoffmsg = By.xpath("//h1[normalize-space()='We have lift off!']");
  
  By campaignsLink = By.id("nav_marketing_automation");
  
  By usernameLink = By.id("nav_account");
	
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
		
		public String nameValidate()
		{
			String text = Utility.WebElementwait(driver, nameValidate).getText();
			return text;
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
		
		public String filterValidate()
		{
			String text = Utility.WebElementwait(driver, filterValidate).getText();
			return text;
		}
		
		public void fromPanel(String fromname, String fromemail)
		{
			Utility.WebElementwait(driver, fromName).sendKeys(fromname);
			Utility.WebElementwait(driver, fromEmailAddress).sendKeys(fromemail);
			Utility.WebElementwait(driver, fromPanelNext).click();
		}
		
		public String fromNameValidate()
		{
			String text = Utility.WebElementwait(driver, fromNameValidate).getText();
			return text;
		}
		
		public String fromEmailValidate()
		{
			String text = Utility.WebElementwait(driver, fromEmailValidate).getText();
			return text;
		}
		
		public void subjectLine(String subject, String text)
		{
			Utility.WebElementwait(driver, subjectLine).sendKeys(subject);
			Utility.WebElementwait(driver, previewText).sendKeys(text);
			Utility.WebElementwait(driver, subjectPanelNext).click();
		}
		
		public String subjectValidate()
		{
			String text = Utility.WebElementwait(driver, subjectValidate).getText();
			return text;
		}
		
		public String previewtextValidate()
		{
			String text = Utility.WebElementwait(driver, previewtextValidate).getText();
			return text;
		}
		
		public void emailContent()
		{
			Utility.WebElementwait(driver, emailContent).click();
		}
		
		public String emailContentValidate()
		{
			String text = Utility.WebElementwait(driver, emailContentValidate).getText();
			return text;
		}
		
		public void chooseTemplate()
		{
            Utility.JSclick(driver, htmlTemplate);
			Utility.JSclick(driver, chooseButton);
		}
		
		public boolean emailBodyValidate()
		{
			Boolean status = Utility.WebElementwait(driver, emailBodyValidate).isDisplayed();
			return status;
		}
		
		public void emailBody()
		{
			 
           Utility.WebElementwait(driver, saveButton).click();
			
		}
		
		public boolean doneButton()
		{
			Boolean status = Utility.WebElementwait(driver, doneButton2).isDisplayed();
			return status;
		}
		
		public void sendButton()
		{
			Utility.WebElementwait(driver, sendButton).click();
		}
		
		public Boolean sendpopupValidate()
		{
			Boolean status = Utility.WebElementwait(driver, sendpopup).isDisplayed();
			return status;
		}
		
		public void sendnowButton()
		{
			Utility.WebElementwait(driver, sendnowButton).click();
		}
		
		public boolean sentValidation()
		{
			Boolean status = Utility.WebElementwait(driver, liftoffmsg).isDisplayed();
		
			return status;
		}
		
		public void campaignLink()
		{
			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
			WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(campaignsLink));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background:yellow; border : 2px solid red');", element);
			Utility.waitforseconds(2);
			js.executeScript("arguments[0].setAttribute('style','border : 2px solid white');", element);
			element.click();
			}
		
		public Boolean campaigndashboardValidation()
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
			Boolean status  = wait1.until(ExpectedConditions.elementToBeClickable(campaignsLink)).isDisplayed();
			return status;
		}
	
}
