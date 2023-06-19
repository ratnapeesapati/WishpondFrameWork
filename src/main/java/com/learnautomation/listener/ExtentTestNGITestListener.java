package com.learnautomation.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.learnautomation.Factory.BrowserFactory;
import com.learnautomation.helper.Utility;


  public class ExtentTestNGITestListener implements ITestListener
  
  {
	  
	  ExtentReports extent = ExtentManager.getInstance();
	  
	  ExtentTest extentTest;
	  
  
  public void onTestStart(ITestResult result)
  {
	  extentTest = extent.createTest(result.getMethod().getMethodName());
  System.out.println("LOG:INFO - Test Started !!!" +  result.getMethod().getMethodName());
  }
  public void onFinish(ITestContext context) 
  {
	  extent.flush();
  System.out.println("LOG:END - Test End !!!" +context.getName());
  } 
  public void onTestSuccess(ITestResult result) 
  {
	  extentTest.pass("Test Passed");
  System.out.println("LOG:PASS - Test Passed !!!" +result.getMethod().getMethodName()); 
  }
  
  public void onTestFailure(ITestResult result)
  {
	String screenshot =  Utility.captureScreenshotAsBase64(BrowserFactory.getDriver());
	  extentTest.fail("Test Failed" +  result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot, "Screenshot of Failed Test").build());
  System.out.println("LOG:FAIL - Test Failed!!!" + result.getMethod().getMethodName()); 
  System.out.println("Exception Trace" +  result.getThrowable().getMessage()); 
  }
  
  public void onTestSkipped(ITestResult result)
  {
	  extentTest.skip("Test Skipped");
  System.out.println("LOG:SKIP - Test Skipped!!!" + result.getMethod().getMethodName()); 
  System.out.println("Exception Trace" +  result.getThrowable().getMessage()); 
  }
  

  }
 
