package testcases2;

import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.automation.pages.WPChooseAutomation;
import com.wp.staging.automation.pages.WPDetailedCampaigns;
import com.wp.staging.automation.pages.WPMarketingAutomation;
import com.wp.staging.central.pages.WPCentralPage;

@Test()
public class TC07_EmailAutomation extends BaseClass {

//yet to add actions for this testcase
	
	WPCentralPage central;
	WPDetailedCampaigns allcampaigns;
	WPChooseAutomation standard;
	WPMarketingAutomation automation;
	
	
	public void EmailAutomation()
	{
		central = new WPCentralPage(driver);
		allcampaigns = new WPDetailedCampaigns(driver);
		standard = new WPChooseAutomation(driver);
		automation = new WPMarketingAutomation(driver);

		
		//Search.searchMerchant();
		central.viewMore();
		allcampaigns.automationClick();
		standard.standardauto();
		automation.leadProdCon();
		
	}
}
