package com.learnautomation.Factory;

import java.time.Duration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v113.network.Network;
import org.openqa.selenium.devtools.v113.network.model.Headers;
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
			        
			 ChromeOptions opt = new ChromeOptions();
			 opt.addArguments("--disable-notifications");
			    driver = new ChromeDriver(opt);
			    DevTools chromeDevTools=((HasDevTools) driver).getDevTools();
			    chromeDevTools.createSession();
			    chromeDevTools.send(Network.enable(Optional.of(0), Optional.of(0), Optional.of(0)));
			    Map<String, Object> header = new HashMap<>();
			    String basicAuth ="Basic " + new String(new Base64().encode(String.format("%s:%s", "wishpond", "suchwow").getBytes()));
			    header.put("Authorization", basicAuth);
			    chromeDevTools.send(Network.setExtraHTTPHeaders(new Headers(header)));
			    
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
