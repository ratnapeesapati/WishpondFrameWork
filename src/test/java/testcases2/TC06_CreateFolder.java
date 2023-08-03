package testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.Merresultspg2;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.WPAdmin_Merchant;
import com.wp.staging.admin.pages.WPMerchantSearch;
import com.wp.staging.admin.pages.loginpage;
import com.wp.staging.central.pages.WPCentralPage;

@Test(dataProvider = "Credentials", dataProviderClass=CustomDataProvider.class)
public class TC06_CreateFolder extends BaseClass {
	
	loginpage login;
	GSigninPage signin;
	GPwdPage pwd;
	WPMerchantSearch search;
	WPAdmin_Merchant results;
	WPCentralPage central;
	
	public void CreateFolder(String username, String password)
	{

		login = new loginpage(driver);
		signin = new GSigninPage(driver);
		pwd = new GPwdPage(driver);
		search = new WPMerchantSearch(driver);
		results = new WPAdmin_Merchant(driver);
		central = new WPCentralPage(driver);
	
		login.googleSignin();
		signin.gSign(username);
		pwd.gPwd(password);
		search.searchMerchant();
		results.loginAsMerchant();
		central.createFolderPopup();
		Assert.assertTrue(central.folderPopupExists());
		central.createFolder();
		Boolean Foldersuccessmsg = central.folderSuccessMsg();
		Assert.assertTrue(Foldersuccessmsg);
		
		
	}
	
	
	
	
	

}
