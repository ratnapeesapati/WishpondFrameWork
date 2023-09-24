package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPPhotoContest;

public class TC21_PhotoContest extends BaseClass{
	
	WPCentralPage central;
	WPPhotoContest contest;
	
	@BeforeTest
	public void objects()
	{
		central = new WPCentralPage(driver);
		contest = new WPPhotoContest(driver);
		
	}
	
	@Test(priority=0)
	public void photoContest()
	{
		central.photoContest();
		Assert.assertTrue(driver.getCurrentUrl().contains("type=photo"));
		contest.photoContest();
	}

}
