package testcases2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.central.pages.WPCentralPage;

public class TC03b_InvalidMerchant extends BaseClass {
	
	 Adminhomepage admin;
	 WPCentralPage central;
	
	@BeforeTest
	public void leadObjects()
	{
		admin = new Adminhomepage(driver);
		central = new WPCentralPage(driver);
    }
	
	@Test(priority =0, dataProvider = "InvalidMerchantId", dataProviderClass = CustomDataProvider.class)
	public void invalidMerchant(String merchantid)
	{
		admin.searchMerchant(merchantid);
		String text = central.invalidMerchant();
		Assert.assertTrue(text.contains("Cannot find merchant with ID"));
	}

}
