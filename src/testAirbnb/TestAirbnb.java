package testAirbnb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestAirbnb {
	static WebDriver driver;
	
@BeforeSuite(groups= {"searchFuncionality"})
	public void seetUpBeforeTest()throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Fernando\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
	}
@AfterSuite(groups= {"searchFuncionality"})
	public static void main(String[] args) {
		
		driver.close();

	}

}
