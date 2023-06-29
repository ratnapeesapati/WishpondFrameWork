package com.learnautomation.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;

public class SmokeTest extends BaseClass {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(driver.getTitle().contains("Learn Automation Courses"));
	}

}
