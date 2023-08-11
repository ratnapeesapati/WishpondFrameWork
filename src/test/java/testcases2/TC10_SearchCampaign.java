package testcases2;

import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.adminHomePage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
public class TC10_SearchCampaign extends BaseClass{
	
	
	adminHomePage search;
	Merchant_Login loginasmerchant;
	WPCentralPage central;
	
	@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
	public void searchCampaign(String username,String password)
	{
	
		search = new adminHomePage(driver);
		loginasmerchant = new Merchant_Login(driver);
		central = new WPCentralPage(driver);
	
	//	search.searchMerchant();
		loginasmerchant.loginAsMerchant();
		central.searchByName();
		
		
		
		
		
	}

	
	

}
