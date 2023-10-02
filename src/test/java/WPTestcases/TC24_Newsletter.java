package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPNewsletter;
import com.wp.staging.admin.pages.Adminhomepage;

public class TC24_Newsletter extends BaseClass {
	
	Adminhomepage admin;
	WPCentralPage central;
	WPNewsletter newsletter;
	
	@BeforeTest	
	public void testObjects()
	{
		central = new WPCentralPage(driver);
		newsletter = new WPNewsletter(driver);
	}
	
	@Test(priority=0)
	public void newsletter()
	{
		central.viewMore();
		central.newsletter();
		Assert.assertTrue(newsletter.newsletterValidate().contains("Name"));
	}
	
	@Test(priority=1, dataProvider = "Newsletter", dataProviderClass = CustomDataProvider.class)
	public void newsletterFill(String name)
	{
		newsletter.name(name);
	}
	
	//Test(priority=2, dataProvider ="LeadScore", dataProviderClass = CustomDataProvider.class)
	public void leadSelection(String leadscore)
	{
		newsletter.chooseLeads(leadscore);
	}
	
	
	//Test(priority=3, dataProvider = "FromPanel", dataProviderClass = CustomDataProvider.class)
	public void fromPanel(String fromName, String fromEmail)
	{
		newsletter.fromPanel(fromName, fromEmail);
	}
	

}
