package testcases2;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.admin.pages.Adminhomepage;
import com.wp.staging.admin.pages.NewUser;
import com.wp.staging.admin.pages.Users;


@Test
public class TC17_CreateUser extends BaseClass

{
	
	Adminhomepage admin;
	Users user;
	NewUser newuser;
	
	@BeforeTest
	public void objects()
	{
		admin = new Adminhomepage(driver);
		user = new Users(driver);
		newuser = new NewUser(driver);
	}
	@Test(priority=0)
	public void userPage()
	{
		admin.users();
		admin.userslink();
		Assert.assertTrue(driver.getCurrentUrl().contains("admin/users"));
	}
	
	@Test(priority=1)
	public void createUserlink()
	{
		user.createuser();
		Assert.assertTrue(driver.getCurrentUrl().contains("/admin/users/new"));
	}
	
	@Test(priority=2, dataProvider = "NewUser1", dataProviderClass = CustomDataProvider.class)
	public void newUserCreation(String Firstname, String lastname, String email, String pass, String confirmpass,  String usercreatedmsg)
	{
		newuser.createUser(Firstname, lastname, email, pass, confirmpass);
		newuser.usertype();
		newuser.create();
		Assert.assertTrue(newuser.usermsg().contains(usercreatedmsg));
		
	}
	
	@Test(priority=3, dataProvider = "NewUser1", dataProviderClass = CustomDataProvider.class)
	public void newUserRepeat(String Firstname, String lastname, String email, String pass, String confirmpass, String usercreatedmsg)
	{
		admin.users();
	    admin.userslink();
	    user.createuser();
		newuser.createUser(Firstname, lastname, email, pass, confirmpass);
		newuser.usertype();
		newuser.create();
		Assert.assertTrue(newuser.userRepeat().contains("has already been taken"));
		
	}
	
	
	
	
	
	
	

}