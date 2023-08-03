package testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.WPAdmin_Merchant;
import com.wp.staging.admin.pages.WPMerchantSearch;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

public class TC03_SearchMerchant  extends BaseClass{
	
	loginpage login;
	GSigninPage GSignin;
	GPwdPage Gpwd;
	WPMerchantSearch admin;
	WPAdmin_Merchant results;
	WPCentralPage Central;
	
	@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
	public void SearchMerchant(String username, String password)
	{
		//Creating objects for pages needed
		login = new loginpage(driver);
		GSignin = new GSigninPage(driver);
		Gpwd = new GPwdPage(driver);
		admin = new WPMerchantSearch(driver);
		results = new WPAdmin_Merchant(driver);
		Central = new WPCentralPage(driver);
		
		//Login to Admin page
		login.googleSignin();
		GSignin.gSign(username);
		Gpwd.gPwd(password);
	
		//Searching of Merchant
		admin.searchMerchant();
        results.loginAsMerchant();
        Boolean successfullogin = Central.merchantName();
        Assert.assertTrue(successfullogin);
        
        
        
  
		
		
		
		
		
		
	    }

}
