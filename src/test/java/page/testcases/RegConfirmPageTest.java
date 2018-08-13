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
import page.Objects.RegResultPage;

public class RegConfirmPageTest extends TestBase {

	LandingPage landingpage;
	RegEntryPage regentrypage;
	RegConfirmPage regconfirmpage;
	RegResultPage regresultpage;
	RegErrorPage regerrorpage;
	//Constructor
	public RegConfirmPageTest() throws IOException {
		super();
	}
	
	@Before
	public void Before() throws IOException {
		initialize();
		landingpage = new LandingPage();
		regentrypage = new RegEntryPage();
		regconfirmpage = new RegConfirmPage();
		regresultpage = new RegResultPage();
		regerrorpage = new RegErrorPage();
	}
	
	@Test
	public void RegConfirmPage_Title_Test() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		regentrypage.Reg_txtbox(baseclass.TestBase.prop.getProperty("RegNo"));
		regconfirmpage = regentrypage.clickbtnContinue();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String pageTitle = regconfirmpage.validatePageTitle();
		Assert.assertEquals("Check if a vehicle is taxed and has an MOT",pageTitle);
	}
	
	@Test
	public void RegConfirmPage_functionality_Yes_RadioBtn() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		regentrypage.Reg_txtbox(baseclass.TestBase.prop.getProperty("RegNo"));
		regconfirmpage = regentrypage.clickbtnContinue();
		regresultpage = regconfirmpage.clickradiobtnYes();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		Assert.assertEquals(baseclass.TestBase.prop.getProperty("RegNo"), regresultpage.validateRegNo());		
	}
	
	@Test
	public void RegEntrypage_functionality_test_invalid_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		String dummyno = "  ";
		regentrypage.Reg_txtbox(dummyno);
		regentrypage.clickbtnContinue();
		Assert.assertEquals(regentrypage.lblValidationMsg(), 
				"You must enter your registration number in a valid format");		
	}
	
	@Test
	public void RegEntrypage_functionality_test_valid_data() throws IOException {
		regentrypage = LandingPage.clickbtnStart();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Check if a vehicle is taxed and has an MOT"));
		regentrypage.Reg_txtbox(baseclass.TestBase.prop.getProperty("RegNo"));
		regconfirmpage = regentrypage.clickbtnContinue();		
	}	
	
	@After
	public void After() {
		driver.quit();
	}

}
