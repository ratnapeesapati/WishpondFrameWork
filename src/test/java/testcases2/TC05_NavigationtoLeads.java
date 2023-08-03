package testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.learnautomation.helper.Utility;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.WPAdmin_Merchant;
import com.wp.staging.admin.pages.WPMerchantSearch;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;

@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
public class TC05_NavigationtoLeads extends BaseClass {
	
	loginpage login;
	GSigninPage GSignin;
	GPwdPage GPwd;
	WPMerchantSearch Search;
	WPAdmin_Merchant results;
	WPCentralPage Central;
	WPLeadsPage leads;
	
	
	public void  leadspage(String username, String password)
	{
		login = new loginpage(driver);
		GSignin = new GSigninPage(driver);
		GPwd = new GPwdPage(driver);
		Search = new WPMerchantSearch(driver);
		results = new WPAdmin_Merchant(driver);
		Central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
		
		login.googleSignin();
		GSignin.gSign(username);
		GPwd.gPwd(password);
		Search.searchMerchant();
		results.loginAsMerchant();
		Central.leadsPage();
		Boolean Leadspagecheck = leads.leadsPageVerify();
		Assert.assertTrue(Leadspagecheck);
		
		
	}
	
	
	

}
