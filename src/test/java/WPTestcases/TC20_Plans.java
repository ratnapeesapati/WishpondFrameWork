package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPPlans;

public class TC20_Plans extends BaseClass{
	
	WPCentralPage central;
	WPPlans plans;
	Adminhomepage admin;

	
	
	@BeforeTest
	public void Objects()
	{
		central = new WPCentralPage(driver);
		plans = new WPPlans(driver);
		admin = new Adminhomepage(driver);
	}
	
	@Test(priority=0)
	public void plans()
	{
		central.plans();
		Assert.assertTrue(driver.getCurrentUrl().contains("pricing_plans"));
		String actualplan = plans.plansPageVerify();
		central.returnToAdmin();
		String expectedplan = admin.currentPricingPlan();
		Assert.assertEquals(actualplan, expectedplan);
	}
	
	

}
