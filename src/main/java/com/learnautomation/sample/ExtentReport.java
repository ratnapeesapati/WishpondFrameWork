package com.learnautomation.sample;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	@Test
	public void test1()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/AutomationReport.html");
		
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Sprint 1 Report");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test1 = extent.createTest("Login");
		
		test1.log(Status.INFO, "User is able to enter email");
		test1.log(Status.INFO, "User is able to enter password");
		test1.log(Status.INFO, "User is click on login button");
		test1.log(Status.FAIL, "User is not able to see dashboard");
		
		extent.flush();	
		
		ExtentTest test2 = extent.createTest("Payment");
		
		test2.info("User is able to enter card Details");
		test2.info("User is able to enter cvv details");
		
		
		
		
	}

}
