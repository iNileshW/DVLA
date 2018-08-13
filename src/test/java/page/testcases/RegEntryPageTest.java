package page.testcases;

import java.io.IOException;

import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import baseclass.TestBase;
import page.Objects.LandingPage;
import page.Objects.RegConfirmPage;
import page.Objects.RegEntryPage;
import page.Objects.RegErrorPage;

public class RegEntryPageTest extends TestBase {

	LandingPage landingpage;
	RegEntryPage regentrypage;
	RegConfirmPage regconfirmpage;
	RegErrorPage regerrpage;
	//Constructor
	public RegEntryPageTest() throws IOException {
		super();
	}
	
	@Before
	public void Before() throws IOException {
		initialize();
		landingpage = new LandingPage();
		regentrypage = new RegEntryPage();
		regconfirmpage = new RegConfirmPage();
		regerrpage = new RegErrorPage();
	}
	
	@Test
	public void RegEntryPage_Title_Test() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String pageTitle = regentrypage.validatePageTitle();
		Assert.assertEquals("Check if a vehicle is taxed and has an MOT",pageTitle);
	}
	
	@Test
	public void RegEntrypage_functionality_test_blank_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String dummyno = "";
		regentrypage.Reg_txtbox(dummyno);
		RegEntryPage.clickbtnContinue();
		Assert.assertEquals(regentrypage.lblValidationMsg(), 
				"Please enter your registration number");		
	}
	
	@Test
	public void RegEntrypage_functionality_test_incomplete_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String dummyno = "  ";
		regentrypage.Reg_txtbox(dummyno);
		RegEntryPage.clickbtnContinue();
		Assert.assertEquals(regentrypage.lblValidationMsg(), 
				"You must enter your registration number in a valid format");		
	}
	
	@Test
	public void RegEntrypage_functionality_test_invalid_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String dummyno = baseclass.TestBase.prop.getProperty("RegNo");
		String reverse = "";        
        for(int i = dummyno.length() - 1; i >= 0; i--)
        {
            reverse = reverse + dummyno.charAt(i);
        }
        regentrypage.Reg_txtbox(reverse);
		RegEntryPage.clickbtnContinue();	
		Assert.assertEquals(driver.getTitle(), prop.getProperty("regErrorPage_title"));
	}
	
	@Test
	public void RegEntrypage_functionality_test_valid_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		regentrypage.Reg_txtbox(baseclass.TestBase.prop.getProperty("RegNo"));
		regconfirmpage = RegEntryPage.clickbtnContinue();
		
	}
	/*@Test
	public void RegConfirmpage_Title_Test() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		String regentrypage_title = regentrypage.validatePageTitle();
		Assert.assertEquals(regentrypage_title, prop.getProperty("regentryPage_title"));
	}
*/	
	
	@After
	public void After() {
		driver.quit();
	}

}
