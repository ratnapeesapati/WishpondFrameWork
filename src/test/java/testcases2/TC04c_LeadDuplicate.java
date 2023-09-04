package testcases2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;

public class TC04c_LeadDuplicate extends BaseClass {
	
	WPCentralPage central;
	WPLeadsPage leads;
	
	@BeforeTest
	public void objects()
	{
		leads = new WPLeadsPage(driver);
		central = new WPCentralPage(driver);
	}
	
	@Test(priority=0)
	public void leadsPage()
	{
		central.leadsPage();
		Boolean Leadspagecheck = leads.leadsPageVerify();
		Assert.assertTrue(Leadspagecheck);
	}
	
	
	@Test(priority = 1, dataProvider = "NewLead", dataProviderClass = CustomDataProvider.class)
	public void createLead(String email, String leadscore, String firstname, String lastname)
	{
		leads.addNewLeadlink();
		leads.addNewLead(email, leadscore, firstname, lastname);
	}
	
	@Test(priority=2, dependsOnMethods = {"createLead"}, dataProvider = "NewLead",dataProviderClass = CustomDataProvider.class)
	public void leadDuplicate(String email, String leadscore, String firstname, String lastname)
	{
	    central.leadsPage();
	    leads.addNewLeadlink();
		leads.addNewLead(email, leadscore, firstname, lastname);
		Assert.assertTrue(leads.leadDuplicate());
		
	}

	

}