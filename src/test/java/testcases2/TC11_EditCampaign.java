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


public class TC11_EditCampaign extends BaseClass {

	adminHomePage search;
	Merchant_Login loginasmerchant;
	WPCentralPage central;
	
	@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
	public void editCampaign(String username, String password)
	{
		
		search = new adminHomePage(driver);
		loginasmerchant = new Merchant_Login(driver);
		central = new WPCentralPage(driver);
	
		//search.searchMerchant();
		loginasmerchant.loginAsMerchant();
		central.searchByName();
	}
	
	

}
