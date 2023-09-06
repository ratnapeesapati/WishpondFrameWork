package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

public class TC03_loginasMerchant  extends BaseClass{

	Adminhomepage admin;
	Merchant_Login results;
	WPCentralPage Central;
	
	@Test(priority=1,dataProvider = "MerchantId", dataProviderClass=CustomDataProvider.class)
	//Searching of Merchant
	public void searchMerchant(String merchantid)
	{
	
		admin = new Adminhomepage(driver);
		results = new Merchant_Login(driver);
		Central = new WPCentralPage(driver);
		admin.searchMerchant(merchantid);
        results.loginAsMerchant();
        Boolean successfullogin = Central.merchantName();
        Assert.assertTrue(successfullogin);
        
	}
	

}
