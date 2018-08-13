package page.testcases;

import java.io.IOException;

import org.junit.*;

import baseclass.TestBase;
import page.Objects.LandingPage;
import page.Objects.RegEntryPage;

public class LandingPageTest extends TestBase {

	LandingPage landingpage;
	RegEntryPage regentrypage;
	//Constructor
	public LandingPageTest() throws IOException {
		super();
	}
	
	@Before
	public void Before() throws IOException {
		initialize();
		landingpage = new LandingPage();		
	}
	
	@Test
	public void Landingpage_Title_Test() {
		String pageTitle = landingpage.validatePageTitle();
		Assert.assertEquals(pageTitle, prop.getProperty("landingPage_title"));
	}
	
	@Test
	public void Landingpage_Start_Button_Test() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		String regentrypage_title = regentrypage.validatePageTitle();
		Assert.assertEquals(regentrypage_title, prop.getProperty("regentryPage_title"));
	}
	
	
	@After
	public void After() {
		driver.quit();
	}

}
