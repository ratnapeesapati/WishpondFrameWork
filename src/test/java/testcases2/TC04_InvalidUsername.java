package testcases2;

import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.extra.pages.Merresultspg1;
import com.learnautomation.extra.pages.homepage;
import com.wp.staging.admin.pages.GPwdPage;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.WPAdmin_Merchant;
import com.wp.staging.admin.pages.WPMerchantSearch;
import com.wp.staging.admin.pages.loginpage;

public class TC04_InvalidUsername extends BaseClass{

	homepage home;
	loginpage login;
	GSigninPage Gsignin;
	
	
	@Test
	public void InvalidUsername(String username)
	{
	 home = new homepage(driver);
	 login = new loginpage(driver);
	 Gsignin = new GSigninPage(driver);
	 
	 
	 home.login();
	 login.googleSignin();
	 Gsignin.gSign(username);
	 
}
}

