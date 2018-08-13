package step_definitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DVLA.MOT.file_details;
import baseclass.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Objects.LandingPage;
import page.Objects.RegEntryPage;
import service_bean.ServiceImplement;
import service_bean.ServiceInterface;

public class service_bean_steps_definitions {
	
	private ServiceInterface service;
	
	
	@Before
	public void setup() {
		baseclass.TestBase.initialize();
	}
	@Given("^User is on (.*) directory with readable files$")
	public void User_is_on_path_of_directory_with_readable_files(String path) throws Throwable {
		service = new ServiceImplement();
		service.get_File_Content(path);
		
	}

	@When("^user opens the excel or csv (.*)$")
    public void user_opens_the_excel_or_csv_file(String file_name) throws Exception {
		file_details.file_name = file_name;
    }
	
	@When("^the user enters the (.*) on webpage$")
    public void the_user_can_enter_the_reg_no(String reg_no) throws Exception {
		new RegEntryPage();
		LandingPage.clickbtnStart();
		RegEntryPage.Reg_txtbox(reg_no);
		//page.Objects.RegEntryPage.clickbtnContinue();
		TestBase.driver.findElement(By.name("Continue")).click();
    }
	
	@Then ("^the user is shown (.*) and (.*) of car and test result and take screenshot if test fails$")
	public void the_user_is_shown_make_and_colour_of_car(String Make,String Colour) throws Exception {
		
		if (Make.equals(page.Objects.RegConfirmPage.car_make())&& Colour.equals(page.Objects.RegConfirmPage.car_colour())){
					System.out.println("Test Passed");
				}
		else {
					System.out.println("Test Fail");
					Screenshot("Error_ScreenShot");
		}
		
		
    }
	public static void Screenshot(String filename) throws IOException {
		File file = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\nwairagade\\eclipse-workspace\\Test_Workspace\\MOT\\src\\test\\java\\util\\"+filename+".jpg"));		
	}
}
