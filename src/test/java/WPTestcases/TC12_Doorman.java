package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Doorman;
import com.wp.staging.admin.pages.Adminhomepage;

public class TC12_Doorman extends BaseClass {
	
	
	Adminhomepage adminHome;
	Doorman doorman;
	
	
	@Test(priority = 0,dataProvider = "MerchantId", dataProviderClass=CustomDataProvider.class)
	public void beforeTests(String merchantid)
	{
		adminHome = new Adminhomepage(driver);
		doorman = new Doorman(driver);
		adminHome.searchMerchant(merchantid);
	}
	
	@Test(priority=1,dataProvider = "Doorman", dataProviderClass=CustomDataProvider.class)
	public void doorman(String doormankey, String doormanvalidate, String successmsg)
	{

	
		adminHome.doorman();
		Assert.assertTrue(driver.getCurrentUrl().contains("doorman"));
		doorman.doorman(doormankey);
		
		String actualtext = doorman.doormancheck(doormanvalidate);
		String expectedtext = "Remove: newsletter_v2_ui";
	   Assert.assertTrue(actualtext.contains(expectedtext));
	   
	   String actualMsg = doorman.successMsgCheck(successmsg);
	   String expectedMsg = "Successfully added feature: newsletter_v2_ui";
	  Assert.assertTrue(actualMsg.contains(expectedMsg));
	  
	  doorman.login();
		
	}
	

}
