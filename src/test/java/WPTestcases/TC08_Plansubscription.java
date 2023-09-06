package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.newSubscription;



public class TC08_Plansubscription extends BaseClass{
	
	Adminhomepage ahome;
	newSubscription planId;
	Merchant_Login merchant;
	
	@Test(priority=0,dataProvider = "Merchantid", dataProviderClass=CustomDataProvider.class)
	public void searchMerchant(String merchantid)
	{
		ahome = new Adminhomepage(driver);
    	ahome.searchMerchant(merchantid);
		ahome.newSubscription();
		Assert.assertTrue(driver.getCurrentUrl().contains("new_subscription"));
		
	}
	
	@Test(priority=1,dataProvider = "PlanId", dataProviderClass=CustomDataProvider.class)
	public void planSubscription(String PlanId)
	{
		planId = new newSubscription(driver);
		planId.newSubscription(PlanId);
	}
	

}
