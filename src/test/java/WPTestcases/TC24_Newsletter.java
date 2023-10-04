package WPTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.Factory.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.wp.staging.central.pages.WPCentralPage;
import com.wp.staging.central.pages.WPNewsletter;
import com.wp.staging.admin.pages.Adminhomepage;

public class TC24_Newsletter extends BaseClass {
	
	Adminhomepage admin;
	WPCentralPage central;
	WPNewsletter newsletter;
	
	@BeforeTest	
	public void testObjects()
	{
		central = new WPCentralPage(driver);
		newsletter = new WPNewsletter(driver);
	}
	
	@Test(priority=0)
	public void newsletter()
	{
		central.viewMore();
		central.newsletter();
		Assert.assertTrue(newsletter.newsletterValidate().contains("Name"));
	}
	
	@Test(priority=1, dataProvider = "Newsletter", dataProviderClass = CustomDataProvider.class)
	public void newsletterFill(String name)
	{
		newsletter.name(name);
		Assert.assertTrue(newsletter.nameValidate().equalsIgnoreCase(name));
	}
	
	@Test(priority=2, dataProvider ="LeadScore", dataProviderClass = CustomDataProvider.class)
	public void leadSelection(String leadscore)
	{
		newsletter.chooseLeads(leadscore);
		Assert.assertTrue(newsletter.filterValidate().equalsIgnoreCase("Custom Filter"));
	}
	
	
	@Test(priority=3, dataProvider = "FromPanel", dataProviderClass = CustomDataProvider.class)
	public void fromPanel(String fromName, String fromEmail)
	{
		newsletter.fromPanel(fromName, fromEmail);
		Assert.assertTrue(newsletter.fromNameValidate().equalsIgnoreCase(fromName));
		Assert.assertTrue(newsletter.fromEmailValidate().equalsIgnoreCase(fromEmail));
	}
	
	@Test(priority=4, dataProvider = "SubjectPanel", dataProviderClass = CustomDataProvider.class)
	public void subjectPanel(String subject, String text)
	{
		newsletter.subjectLine(subject, text);
		Assert.assertTrue(newsletter.subjectValidate().equalsIgnoreCase(subject));
		Assert.assertTrue(newsletter.previewtextValidate().equalsIgnoreCase(text));
	}
	
	@Test(priority=5)
	public void emailContent()
	{
		newsletter.emailContent();
		Assert.assertTrue(newsletter.emailContentValidate().equalsIgnoreCase("Choose Template"));
		newsletter.chooseTemplate();
		Assert.assertTrue(newsletter.emailBodyValidate());
		newsletter.emailBody();
		Assert.assertTrue(newsletter.doneButton());
		newsletter.sendButton();
		Assert.assertTrue(newsletter.sendpopupValidate());
		newsletter.sendnowButton();
		Assert.assertTrue(newsletter.sentValidation());
		newsletter.campaignLink();
		Assert.assertTrue(newsletter.campaigndashboardValidation());
	}

}
