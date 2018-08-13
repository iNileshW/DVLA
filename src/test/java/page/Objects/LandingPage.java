package page.Objects;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.TestBase;
public class LandingPage extends TestBase {
	// Initilization of Objects by constructor	
	public LandingPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory Design Pattern - Object Repository
	/*@FindBy (xpath = "//a[@href='https://www.vehicleenquiry.service.gov.uk']")
	static WebElement btnStart_Now;*/
	
	
	
	//Actions
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public static RegEntryPage clickbtnStart() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href='https://www.vehicleenquiry.service.gov.uk']"))));
		driver.findElement(By.xpath("//a[@href='https://www.vehicleenquiry.service.gov.uk']")).click();
		return new RegEntryPage();
	}
}
