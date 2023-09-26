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
	
	@DataProvider(name="NewUser1")
	public static Object[][] test8()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("NewUser");
		return arr;
		
	}
	
	@DataProvider(name="Filter")
	public static Object[][] test9()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("Filter");
		return arr;
		
	}
	
	@DataProvider(name="NewUserNegative")
	public static Object[][] test10()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("NewUserNegative");
		return arr;
		
	}

	@DataProvider(name="ListName")
	public static Object[][] test11()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("ListName");
		return arr;
		
	}
	
	@DataProvider(name="ExpectedListName")
	public static Object[][] test12()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("ExpectedListName");
		return arr;
		
	}
	
}