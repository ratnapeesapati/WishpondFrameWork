package testcases2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;

public class TC04b_LeadDeletion extends BaseClass {
	
	WPCentralPage Central;
	WPLeadsPage leads;
	
	@BeforeTest
	public void leadobjects()
	{
		Central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
	}
	
	@Test(priority =0, dataProvider = "LeadSearch", dataProviderClass = CustomDataProvider.class)
	public void leadSearch(String email)
	{
		leads.leadSearch(email);
	    String leadresult = leads.leadResult();
		Assert.assertTrue(leadresult.equalsIgnoreCase(email));
		
	}
	
	@Test(priority=1)
	public void leadDelete()
	{
		 leads.leadDelete();
		 Assert.assertTrue(leads.leadDeleteCheck());
    }
	
	

}