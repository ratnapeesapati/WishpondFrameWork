package testcases2;

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

@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
public class TC08_CreateWebsite extends BaseClass {
	
	//incomplete testcase
	
	loginpage login;
	GSigninPage signin;
	GPwdPage pwd;
	WPMerchantSearch Search;
	WPAdmin_Merchant results;
	WPCentralPage central;
	
	public void CreateWebsite(String username, String password)
	{
	  login = new loginpage(driver);
	  signin = new GSigninPage(driver);
	  pwd = new GPwdPage(driver);
	  Search = new WPMerchantSearch(driver);
	  results = new WPAdmin_Merchant(driver);
	  central = new WPCentralPage(driver);
	  
	  
		login.googleSignin();
		signin.gSign(username);
		pwd.gPwd(password);
		Search.searchMerchant();
		results.loginAsMerchant();
		central.createWebsite();
	}
	

}
