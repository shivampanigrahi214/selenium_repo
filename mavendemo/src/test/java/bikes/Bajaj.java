package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bajaj {
	
	@Test
	public void openHomepage() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("Bajaj class is executed",true);
		Thread.sleep(2000);
		driver.close();
	}
	

}
