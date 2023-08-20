package testcases2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.Merchant_Login;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

@Test
public class TC05_CreateFolder extends BaseClass {

	WPCentralPage central;
	
	@BeforeTest
	public void objects()
	{
	       central = new WPCentralPage(driver);
	}
	
	@Test(priority = 0)
	public void CreateFolder()
	{
        central.createFolderPopup();
		Assert.assertTrue(central.folderPopupExists());
		central.createFolder();
		Boolean Foldersuccessmsg = central.folderSuccessMsg();
		Assert.assertTrue(Foldersuccessmsg);
	}
	
	@Test(priority = 1)
	public void CreateFoldernegative()
	{
		central.createFolderPopup();
		central.createFolderNegative();
		Assert.assertTrue(central.folderMsgExists());
	}
	
	
	
	
	
	

}
