package page.Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class RegErrorPage extends TestBase{

	
	
	@FindBy (xpath = "//*[@id=\"content\"]/div/h3")
		WebElement lblNoDetails;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div/div/a")
	WebElement lnkSearchAgain;
	
	public RegErrorPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public RegEntryPage lnkSearchagain() throws IOException {
		lnkSearchAgain.click();
		return new RegEntryPage();
	}
}
