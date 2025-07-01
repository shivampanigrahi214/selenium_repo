package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaTest {
	@Test
	public void openHomepage() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("YamahaTest class is executed",true);
		Thread.sleep(1000);
		driver.close();
	}

}
