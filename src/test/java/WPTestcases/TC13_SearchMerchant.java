package WPTestcases;

import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Adminhomepage;

public class TC13_SearchMerchant extends BaseClass {
	
	Adminhomepage adminHome;
	
	@Test(priority=1,dataProvider = "MerchantId", dataProviderClass=CustomDataProvider.class)
	public void searchMerchant(String merchantid)
	{
		adminHome = new Adminhomepage(driver);
		
		adminHome.searchMerchant(merchantid);
		
	
		
	}

}
