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

public class TC23_RenameList extends BaseClass{
	
	WPCentralPage central;
	WPLeadsPage leads;
	WPLists lists;
	WPCreateList createlist;
	
	@BeforeTest
	public void objects()
	{
		central = new WPCentralPage(driver);
		leads = new WPLeadsPage(driver);
		lists = new WPLists(driver);
		createlist = new WPCreateList(driver);
	}
	
	@Test(priority=0, dataProvider="ListName",dataProviderClass = CustomDataProvider.class)
	public void listSearch(String listname)
	{
		central.leadsPage();
		leads.listsPage();
		lists.createList();
		createlist.createList(listname);
		central.leadsPage();
		leads.listsPage();
		lists.listSearch(listname);
		Assert.assertTrue(lists.listRenamepopup().contains("Rename List"));
	}
	
	@Test(priority=1, dataProvider="NewListName", dataProviderClass = CustomDataProvider.class)
	public void listRename(String newlistname)
	{
		lists.listRename(newlistname);
	}
	
	
	

}
