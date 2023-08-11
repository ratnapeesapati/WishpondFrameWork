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
import com.wp.staging.admin.pages.adminHomePage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

@Test()
public class TC06_CreateWebsite extends BaseClass {
	
	//incomplete testcase
	

	WPCentralPage central;
	
	public void CreateWebsite(String username, String password,String merchantid)
	{
	
	  central = new WPCentralPage(driver);
	  
	 	central.createWebsite();
	}
	

}
