package com.learnautomation.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.constants.Constants;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseClass {
	
@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
	public void loginToApp(String Username, String Password)
	{
	
		LoginPage page = new LoginPage(driver);
		page.loginToApplication(Username, Password);
		boolean status = page.captureErrorMessage().contains(Constants.userDoesNotExist);
	     Assert.assertTrue(status, "Error messages is displayed as expected");		
		
	}
	//@Test
	public void loginToApp2()
	{
	
		LoginPage page = new LoginPage(driver);
		page.loginToApplication("admin@gmail.com", "admin@123");
		boolean status = page.captureErrorMessage().contains(Constants.userDoesNotExist);
	     Assert.assertTrue(status, "Error messages is displayed as expected");		
		
	}

	
}
