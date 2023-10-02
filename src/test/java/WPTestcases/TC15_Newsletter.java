package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.wp.staging.automation.pages.WPDetailedCampaigns;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPNewsletter;

public class TC15_Newsletter extends BaseClass{
	
	WPCentralPage central;
	WPDetailedCampaigns campaignslist;
	WPNewsletter newsletter;
	
	@Test
	public void newsletter()
	{
		central = new WPCentralPage(driver);
		campaignslist = new WPDetailedCampaigns(driver);
		newsletter = new WPNewsletter(driver);
		
		central.viewMore();
		campaignslist.newsletterLink();
	

		
		
		
		
	}

}
