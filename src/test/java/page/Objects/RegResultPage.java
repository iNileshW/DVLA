package page.Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class RegResultPage  extends TestBase{

	@FindBy (xpath = "//*[@id=\"content\"]/div[1]/h1/span")
	WebElement lblRegNo;
	
	@FindBy (xpath = "//*[@id=\'content\']/div[2]/div[1]/div[1]/h2")
	WebElement lblTaxed;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[1]/p/strong")
	WebElement lblTaxDate;
	
	@FindBy (xpath = "//*[@id=\\\"content\\\"]/div[2]/div[2]/div[1]/h2")
	WebElement lblMOT;
	
	@FindBy (xpath = "//*[@id=\\\"content\\\"]/div[2]/div[2]/div[1]/p/strong")
	WebElement lblMOTDate;
	
	@FindBy (xpath = "//*[@id='content']/div[4]/div/ul/li[1]/span[2]/strong")
	WebElement lblMake;
	
	@FindBy (xpath = "//*[@id=\"UKRegistrationDateDummyDateV5CMatch\"]/span[2]/strong")
	WebElement lblFirstregdate;
	
	@FindBy (xpath = "//*[@id='content']/div[4]/div/ul/li[3]/span[2]/strong")
	WebElement lblYear;
	
	@FindBy (xpath = "//*[@id=\\'CylinderCapacity\\']/span[2]/strong")
	WebElement lblCc;
	
	@FindBy (xpath = "//*[@id=\\'CO2EmissionShown\\']")
	WebElement lblCo2;
	
	@FindBy (xpath = "//*[@id=\\'FuelTypeShown\\']\"")
	WebElement lblFuel;
	
	@FindBy (xpath = "//*[@id='content']/div[4]/div/ul/li[7]/span[2]/strong")
	WebElement lblEport;
	
	@FindBy (xpath = "//*[@id=\\'content\\']/div[4]/div/ul/li[8]/span[2]/strong")
	WebElement lblStatus;
	
	@FindBy (xpath = "//*[@id='content']/div[4]/div/ul/li[9]/span[2]/strong")
	WebElement lblColour;
	
	@FindBy (xpath = "//*[@id=\\'content\\']/div[4]/div/ul/li[10]/span[2]/strong")
	WebElement lblApproval;
	
	@FindBy (xpath = "//*[@id=\\'content\\']/div[4]/div/ul/li[11]/span[2]/strong")
	WebElement lblWheelplan;
	
	@FindBy (xpath = "//*[@id=\\'content\\']/div[4]/div/ul/li[12]/span[2]/strong")
	WebElement lblRevenue;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div/p[2]/a")
	WebElement lnkSearch;
	
	
	public RegResultPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public RegEntryPage clicklnkSearch() throws IOException {
		lnkSearch.click();
			return new RegEntryPage();						
	}
	
	public String validateRegNo() {
		return lblRegNo.getText();
	}

	}


