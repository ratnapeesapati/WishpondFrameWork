package com.learnautomation.Factory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.learnautomation.dataProvider.ConfigReader;
import com.learnautomation.dataProvider.ConfigReader2;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setupApplication()
	{
		System.out.println("LOG:INFO - Running Before Class - Setting up application");
		
		driver = BrowserFactory.startbrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}
	
   @AfterTest
	public void teardown()
	{
	    driver.quit();
 	System.out.println("LOG:INFO - Running After Class -Terminating the session");
	   
	   
	
	}

}
