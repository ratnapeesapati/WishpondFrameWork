package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.central.pages.WPCentralPage;

public class TC19_AccountSettings extends BaseClass{
	
	WPCentralPage central;
	

@BeforeTest
public void objects()
{
	central = new WPCentralPage(driver);
}
	
@Test(priority=0)
public void accountSettings()
{
central.accountSettings();
central.accountSettings2();
//Assert.assertTrue(driver.getCurrentUrl().contains("central/settings"));
}

 

}