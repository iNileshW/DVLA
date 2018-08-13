package page.Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class RegConfirmPage extends TestBase {

	@FindBy (id = "Correct_True")
	WebElement radiobtnTrue;
	
	@FindBy (id = "Correct_False")
	WebElement radiobtnFalse;
	
	@FindBy (xpath = "//*[@id=\"pr3\"]/div/ul/li[2]/span[2]/strong")
	static WebElement lblcar_make;
	
	@FindBy (xpath = "//*[@id=\"pr3\"]/div/ul/li[3]/span[2]/strong")
	static WebElement lblcar_colour;
	
	@FindBy (name = "Continue")
	WebElement btnContinue;
	
	public RegConfirmPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public RegResultPage clickradiobtnYes() throws IOException {
		btnContinue.click();
			return new RegResultPage();						
	}
	
	public RegEntryPage clickradiobtnNo() throws IOException {
		btnContinue.click();
			return new RegEntryPage();						
	}
	
	public static String car_make() throws IOException {
		String make = lblcar_make.getText();
			return make;						
	}
	
	public static String car_colour() throws IOException {
		String colour = lblcar_colour.getText();
			return colour;						
	}
}
