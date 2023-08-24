package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Doorman;
import com.wp.staging.admin.pages.Adminhomepage;

public class TC12_Doorman extends BaseClass {
	
	
	Adminhomepage adminHome;
	Doorman doorman;
	
	@Test(dataProvider = "Doorman", dataProviderClass=CustomDataProvider.class)
	public void doorman(String doormankey, String doormanvalidate, String successmsg)
	{

		adminHome = new Adminhomepage(driver);
		doorman = new Doorman(driver);
		
		adminHome.doorman();
		Assert.assertTrue(driver.getCurrentUrl().contains("doorman"));
		doorman.doorman(doormankey);
		
		String actualtext = doorman.doormancheck(doormanvalidate);
		String expectedtext = "Remove: website_builder";
	   Assert.assertTrue(actualtext.contains(expectedtext));
	   
	   String actualMsg = doorman.successMsgCheck(successmsg);
	   String expectedMsg = "Successfully added feature: website_builder";
	  Assert.assertTrue(actualMsg.contains(expectedMsg));
		
	}
	

}
