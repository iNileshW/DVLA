package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.TestUtil;

public class TestBase {

	//public static WebDriver driver;
	public static Properties prop;
	
	//constructor
	public TestBase() throws IOException{
		prop = new Properties();
		FileInputStream ip;
		ip = new FileInputStream (
				"C:/Users/nwairagade/eclipse-workspace/Test_Workspace/MOT/src/test/java/configuration/config.properties");
		prop.load(ip);
	}
	public static WebDriver driver;
	public static void initialize() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("URL"));
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
		wait.until(ExpectedConditions.titleContains("Get vehicle information from DVLA - GOV.UK"));
		//Log.info("App url is : "+prop.getProperty("URL"));
	}
}
