package testcases2;

import org.testng.Assert;
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


public class TC04_Leads extends BaseClass {
	

	WPCentralPage Central;
	WPLeadsPage leads;
	
	@Test(priority = 0)
	public void  leadspage()
	{
	   Central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
		Central.leadsPage();
		Boolean Leadspagecheck = leads.leadsPageVerify();
		Assert.assertTrue(Leadspagecheck);
	}
	
	@Test(priority = 1, dataProvider = "NewLead", dataProviderClass = CustomDataProvider.class)
	public void createLead(String email, String leadscore, String firstname, String lastname)
	{
		leads = new WPLeadsPage(driver);
		leads.addNewLeadlink();
		Assert.assertTrue(driver.getCurrentUrl().contains("leads/new"));
		leads.addNewLead(email, leadscore, firstname, lastname);
		String actualemail = leads.newLeadvalidate();
		System.out.println(actualemail);
		String expectedemail = "ratnatest2@gmail.com";
		Assert.assertEquals(actualemail,expectedemail);
	}
	
	@Test(priority = 2)
	public void leadProfile()
	{
		leads = new WPLeadsPage(driver);
		leads.leadProfile();
		String firstname = leads.leadFirstName();
		Assert.assertEquals(firstname, "Ratna");
		String lastname = leads.leadLastName();
		Assert.assertEquals(lastname, "Test");
	}

	
	

}
