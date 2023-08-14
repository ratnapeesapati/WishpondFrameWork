package com.wp.staging.admin.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learnautomation.helper.Utility;



public class newSubscription {
	
	public WebDriver driver;
	
	public newSubscription(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By radiobuttons = By.xpath("//input[@type='radio']");
	
	By datePicker = By.xpath("//input[@type='date']");
	
	
 public void newSubscription(String value1)
 {
    List<WebElement> list1 = driver.findElements(radiobuttons);
    for(WebElement abc : list1)
    {
    	String value = abc.getAttribute("value");
    	if(value.contains(value1))
    	{
    		abc.click();
    		break;
    	}
    	
    }

    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    WebElement datePicker1 = Utility.WebElementwait(driver, datePicker);
    js.executeScript("arguments[0].scrollIntoView(true)", datePicker1);
   
  Utility.JSclick(driver, datePicker);
    
    

   // datePicker1.sendKeys("2023-08-25");
   
    
  //  Utility.WebElementwait(driver, datePicker).sendKeys("2023/08/11");
    
   
    
   
	 
 }
	
	

}
