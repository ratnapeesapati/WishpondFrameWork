package testcases2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPLeadsPage;


// Incomplete testcase

public class TC04d_LeadEdit extends BaseClass
{
  WPCentralPage central;
  WPLeadsPage leads;
  
  @BeforeTest
  public void leadObjects()
  {
	  central = new WPCentralPage(driver);
	  leads = new WPLeadsPage(driver);
	  
   }
  
  @Test(priority=0, dataProvider = "LeadSearch", dataProviderClass = CustomDataProvider.class)
  public void leadSearch(String email)
  {
	  central.leadsPage();
	  leads.leadSearch(email);
	  String leadresult = leads.leadResult();
	  Assert.assertTrue(leadresult.equalsIgnoreCase(email));
    }
  
  //@Test(priority=1)
  public void leadEdit()
  {
	  driver.navigate().refresh();
	  leads.leadEdit();
  }
  
  
  
  
	
	
	
	
	
}
