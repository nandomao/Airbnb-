package testAirbnb;

//import org.omg.CORBA.PUBLIC_MEMBER;
//import org.openqa.selenium.Alert;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class searchFuncionality extends TestAirbnb{
	
@BeforeClass(groups={"searchFuncionality"})
	public void funcionalidadeHome() {
		driver.get("http://www.airbnb.com.br/");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}	

@Test (groups= {"searchFuincionality"})
public void PlaceManaus()throws Exception{
	AdressDescription("Av. Getúlio Vargas, 741, Centro, Manaus - Am");
	Thread.sleep(2000);
    Assert.assertTrue(driver.findElement(By.id("Koan-magic-carpet-koan-search-bar-standard__input")).getText().contentEquals("Hotel Taj Mahal "));
    
    driver.findElement(By.xpath("")).click();
	}
 void AdressDescription(String description) {
	 driver.findElement(By.className("_1wl3axt0")).sendKeys(description);
	 	driver.findElement(By.xpath("//*[@id=\"lp-search-button\"]/div/button")).click();
	
}


}

