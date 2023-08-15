package testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;

public class TC01_verifyURL  extends BaseClass{
	
	@Test
	public void verifyURL()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("staging"));
		System.out.println("User is in Staging Wishpond Homepage");
		System.out.println("TC executed successfully");
	}
	
	

}
