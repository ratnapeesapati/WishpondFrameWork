package testcases2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v110.network.Network;
import org.openqa.selenium.devtools.v110.network.model.Headers;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.loginpage;
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


}
