package WPTestcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;

@Test()
public class TC10_SearchEditCampaign extends BaseClass{
	
	

	WPCentralPage central;
	
	@Test(priority=0,dataProvider = "Campaign", dataProviderClass=CustomDataProvider.class)
	public void searchCampaign(String campaignName)
	{
	    
		central = new WPCentralPage(driver);
		central.searchByName(campaignName);
		 String url = driver.getCurrentUrl(); String updatedurl = url.substring(8);
		  String updatedurl1 = "https://wishpond:suchwow@"+updatedurl;
		  System.out.println(updatedurl1); driver.get(updatedurl1);
		 
	}
	
	@Test(priority=1, dataProvider = "Campaign", dataProviderClass=CustomDataProvider.class)
	public void searchCampaign1(String campaignName)
	{
	 central.searchByName(campaignName);
	}
	
	
	
	@Test(priority=2, dependsOnMethods = {"searchCampaign1"})
	
	  public void campaignResult()
	{ 
		String actualcampaign1 = central.campaignResult(); 
		String expectedcampaign1 = "Harika WS";
	  System.out.println(actualcampaign1);
	  // Assert.assertEquals(actualcampaign1,expectedcampaign1);
	  
	  
	  }
	 


}
