package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.central.pages.WPCentralPage;

public class TC16_ReturntoAdmin extends BaseClass {
	
	WPCentralPage central;
	
	@Test
	public void returnToAdmin()
	{
		central = new WPCentralPage(driver);
		central.returnToAdmin();
		Assert.assertTrue(driver.getCurrentUrl().contains("admin/merchants"));
	}
	

}
