package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demo() {
		WebDriver driver=new FirefoxDriver();
		Reporter.log("DemoTest class is executed",true);
	}

}
