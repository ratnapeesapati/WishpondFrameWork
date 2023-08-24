package com.learnautomation.dataProvider;

import org.testng.annotations.DataProvider;



public class CustomDataProvider {
	
	@DataProvider(name="Credentials")
	public static Object[][] test1()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("LoginNew");
		return arr;
		
	}
	
	@DataProvider(name="InvalidCredentials")
	public static Object[][] test1b()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("InvalidCredentials");
		return arr;
		
	}
	
	  @DataProvider(name="MerchantId")
		
		  public static Object[][] test2() {
		  
		  Object arr[][] = ExcelReader.getDataFromSheet("merchantid"); 
		  return arr;
		  
		  }
	  
	  @DataProvider(name="InvalidMerchantId")
		
	  public static Object[][] test2a() {
	  
	  Object arr[][] = ExcelReader.getDataFromSheet("invalidmerchantid"); 
	  return arr;
	  
	  }
		 
	@DataProvider(name="PlanId")
	public static Object[][] test3()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("PlanId");
		return arr;
		
	}
	
	@DataProvider(name="Doorman")
	public static Object[][] test4()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("doorman");
		return arr;
		
	}
	
	@DataProvider(name="Campaign")
	public static Object[][] test5()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("Campaign");
		return arr;
		
	}
	
	@DataProvider(name="NewLead")
	public static Object[][] test6()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("NewLead");
		return arr;
		
	}
	
	@DataProvider(name="LeadSearch")
	public static Object[][] test7()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("LeadSearch");
		return arr;
		
	}
	
}
