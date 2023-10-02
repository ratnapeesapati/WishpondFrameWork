package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPCreateList;
import com.wp.staging.central.pages.WPLeadsPage;
import com.wp.staging.central.pages.WPLists;

public class TC22_StaticList extends BaseClass{
	
	WPCentralPage central;
	WPLeadsPage leads;
	WPLists listspage;
	WPCreateList list;
	
	@BeforeTest
	public void objects()
	{
		central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
		listspage= new WPLists(driver);
		list = new WPCreateList(driver);
	}
	
	@Test(priority=0, dataProvider = "ListName" , dataProviderClass = CustomDataProvider.class)
	public void createListPage(String listname)
	{
		central.leadsPage();
		leads.listsPage();
		Assert.assertTrue(leads.listsPageCheck());
		listspage.createList();
		Assert.assertTrue(driver.getCurrentUrl().contains("lists/new"));
		list.createList(listname);
		Assert.assertTrue(list.listCreationChck());
	}
	
	@Test(priority=1, dataProvider = "ExpectedListName", dataProviderClass = CustomDataProvider.class)
	public void listCreatedCheck(String expectedlistname)
	{
		list.leadsTab();
		leads.listsPage();
		listspage.listIdentify(expectedlistname);
	}
	
	@Test(priority=2,dataProvider = "ListName", dataProviderClass = CustomDataProvider.class)
	public void listDeleteNegative(String listname)
	{
		listspage.listSearch(listname);
		listspage.listDeleteNegative();
		Assert.assertTrue(listspage.listResult().equalsIgnoreCase(listname));
	}
	
	
   @Test(priority=3,dataProvider = "ListName", dataProviderClass = CustomDataProvider.class)
	public void listSearch(String listname)
	{
	   driver.navigate().refresh();
		listspage.listSearch(listname);
		Assert.assertTrue(listspage.listResult().equalsIgnoreCase(listname));
		listspage.listSelect();
		driver.navigate().refresh();
		listspage.listSearch(listname);
		Assert.assertTrue(listspage.listTotal().equalsIgnoreCase("Total Lists: 0"));
	}
	


}
