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
import com.wp.staging.automation.pages.WPChooseAutomation;
import com.wp.staging.automation.pages.WPDetailedCampaigns;
import com.wp.staging.automation.pages.WPMarketingAutomation;
import com.wp.staging.central.pages.WPCentralPage;

@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
public class TC09_EmailAutomation extends BaseClass {


	loginpage login;
	GSigninPage signin;
	GPwdPage pwd;
	WPMerchantSearch Search;
	WPAdmin_Merchant results;
	WPCentralPage central;
	WPDetailedCampaigns allcampaigns;
	WPChooseAutomation standard;
	WPMarketingAutomation automation;
	
	
	public void EmailAutomation(String username, String password)
	{

		login = new loginpage(driver);
		signin = new GSigninPage(driver);
		pwd = new GPwdPage(driver);
		Search = new WPMerchantSearch(driver);
		results = new WPAdmin_Merchant(driver);
		central = new WPCentralPage(driver);
		allcampaigns = new WPDetailedCampaigns(driver);
		standard = new WPChooseAutomation(driver);
		automation = new WPMarketingAutomation(driver);

		login.googleSignin();
		signin.gSign(username);
		pwd.gPwd(password);
		Search.searchMerchant();
		results.loginAsMerchant();
		central.viewMore();
		allcampaigns.automationClick();
		standard.standardauto();
		automation.leadProdCon();
		
		
		
		
		
		
		
		
}
}
