package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.GSigninPage;
import com.wp.staging.admin.pages.loginpage;

public class TC02b_InvalidGmail extends BaseClass{
	
	loginpage login ;
	GSigninPage Signin ;
	
	@BeforeTest
	public void leadObjects()
	{
		login = new loginpage(driver);
		Signin = new GSigninPage(driver);
	}
	
	@Test(priority=0, dataProvider = "InvalidCredentials", dataProviderClass = CustomDataProvider.class)
	public void InvalidGmail(String username)
	{
		 login.googleSignin();
		Signin.gSign(username);
		String text = Signin.invalidGmail();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Couldn’t find your Google Account"));
	}

}
