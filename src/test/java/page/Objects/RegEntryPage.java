package page.Objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class RegEntryPage extends TestBase {

	@FindBy (xpath = "//input")
	static WebElement Reg_txtbox;
	
	@FindBy (name = "Continue")
	static WebElement btnContinue;
	
	@FindBy (id = "Vrm-error")
	WebElement lblValidationMsg;
	
	public RegEntryPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public static RegConfirmPage clickbtnContinue() throws IOException {
		btnContinue.click();
		return new RegConfirmPage();
	}
	
	public static void Reg_txtbox(String no) throws IOException {
		Reg_txtbox.sendKeys(no);
		/*return Reg_txtbox()*/;
	}
	
	public String lblValidationMsg() throws IOException {
		String ValidationMsg = lblValidationMsg.getText();
		return ValidationMsg;
	}
}
