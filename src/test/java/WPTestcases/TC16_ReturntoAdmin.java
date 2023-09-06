package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.central.pages.WPCentralPage;

public class TC16_ReturntoAdmin extends BaseClass {
	
	WPCentralPage central;
	Adminhomepage admin;
	
	@BeforeTest
	public void objects()
	{
		central = new WPCentralPage(driver);
		admin = new Adminhomepage(driver);
	}
	
	@Test(priority=0)
	public void returnToAdmin()
	{
		central = new WPCentralPage(driver);
		central.returnToAdmin();
		Assert.assertTrue(driver.getCurrentUrl().contains("admin/merchants"));
	}
	
	@Test(priority=1)
	public void logout()
	{
		admin.logout();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	
	

}
