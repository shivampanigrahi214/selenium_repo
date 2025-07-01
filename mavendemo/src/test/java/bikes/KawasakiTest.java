package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawasakiTest {
	@Test
	public void openHomepage() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("KawasakiTest class is executed",true);
		Thread.sleep(1000);
		driver.close();
	}

}
