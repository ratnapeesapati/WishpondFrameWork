package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.learnautomation.helper.Utility;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;


public class TC04a_LeadAddition extends BaseClass {
	

	WPCentralPage Central;
	WPLeadsPage leads;
	
	@BeforeTest
	public void leadobjects()
	{
		Central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
	}
	
	@Test(priority=0)
	public void leadPage()
	{
	    Central.leadsPage();
		Boolean Leadspagecheck = leads.leadsPageVerify();
		Assert.assertTrue(Leadspagecheck);
	}

	
	@Test(priority = 1, dataProvider = "NewLead", dataProviderClass = CustomDataProvider.class)
	public void createLead(String email, String leadscore, String firstname, String lastname)
	{
		leads.addNewLeadlink();
		Assert.assertTrue(driver.getCurrentUrl().contains("leads/new"));
		leads.addNewLead(email, leadscore, firstname, lastname);
		driver.navigate().to(driver.getCurrentUrl());
	   String actualemail = leads.newLeadvalidate();
		Assert.assertEquals(actualemail, email);
		leads.leadRecordClick();
		leads.leadProfile();
		String actualfirstname = leads.leadFirstName();
		Assert.assertTrue(actualfirstname.equalsIgnoreCase(firstname));
        String actuallastname = leads.leadLastName();
        Assert.assertTrue(actuallastname.equalsIgnoreCase(lastname));

		}
	
	
	

  @Test(priority =3, dataProvider = "LeadSearch", dataProviderClass = CustomDataProvider.class)
	public void leadSearch(String email)
	{
		
		leads.leadSearch(email);
	    String leadresult = leads.leadResult();
		Assert.assertTrue(leadresult.equalsIgnoreCase(email));
		
	}
	

}