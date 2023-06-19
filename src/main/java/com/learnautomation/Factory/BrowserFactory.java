package com.learnautomation.Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.learnautomation.dataProvider.ConfigReader;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	public static WebDriver startbrowser(String browsername, String applicationurl)
	{
		
		
		if(browsername.equalsIgnoreCase("chrome") || browsername.equalsIgnoreCase("GC") || browsername.equalsIgnoreCase("Google Chrome"))
				{
			        
			 ChromeOptions options = new ChromeOptions();
			    driver = new ChromeDriver();
				}else if(browsername.equalsIgnoreCase("Edge") || (browsername.equalsIgnoreCase("Microsoft Edge")))
						
				{
					driver = new EdgeDriver();
				}else if(browsername.equalsIgnoreCase("Firefox") || browsername.equalsIgnoreCase("Mozilla Firefox") || browsername.equalsIgnoreCase("FF"))
		{
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
			}else
			{
				driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("pageLoad"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get(applicationurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
				
	}

}
