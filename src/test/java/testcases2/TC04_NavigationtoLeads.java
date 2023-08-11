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
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.adminHomePage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;


public class TC04_NavigationtoLeads extends BaseClass {
	

	WPCentralPage Central;
	WPLeadsPage leads;
	
	@Test
	public void  leadspage()
	{
	   Central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
		Central.leadsPage();
		Boolean Leadspagecheck = leads.leadsPageVerify();
		Assert.assertTrue(Leadspagecheck);
	}
	
	

}
