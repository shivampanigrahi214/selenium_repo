package extentreports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShotIntoReport {
	
	@Test
	public void addScreenShot() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.makemytrip.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/screenshotReport.html");
		ExtentReports eReport=new ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test=eReport.createTest("addScreenShot");
		test.log(Status.INFO, "Adding Screenshot");
		test.addScreenCaptureFromBase64String(screenshot);
		eReport.flush();
	}

}
