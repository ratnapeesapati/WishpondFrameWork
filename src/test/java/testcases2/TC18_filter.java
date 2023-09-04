package testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;

public class TC18_filter extends BaseClass{
	
	WPCentralPage central;
	
	@BeforeTest
	public void objects()
	{
		central = new WPCentralPage(driver);
	}
	
	@Test(priority=0, dataProvider = "Filter", dataProviderClass = CustomDataProvider.class)	
	public void filters(String filtervalue)
	{
		central.filters();
		central.filtercheckbox(filtervalue);
	}

}