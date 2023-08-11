package com.learnautomation.dataProvider;

import org.testng.annotations.DataProvider;



public class CustomDataProvider {
	
	@DataProvider(name="Credentials")
	public static Object[][] test2()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("LoginNew");
		return arr;
		
	}
	
	@DataProvider(name="Merchantid")
	public static Object[][] test3()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("merchantid");
		return arr;
		
	}
	
	@DataProvider(name="PlanId")
	public static Object[][] test4()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("PlanId");
		return arr;
		
	}
	
	
}
