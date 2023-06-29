package com.learnautomation.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.pages.LoginPage;

public class LoginTest1 extends BaseClass {
	
	@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
	public void logintoApp(String username, String password)
	{
		LoginPage page = new LoginPage(driver);
		page.loginToApplication(username, password);
		AssertJUnit.assertTrue(driver.getTitle().contains("Learn Automation Courses"));
		
	}

}
