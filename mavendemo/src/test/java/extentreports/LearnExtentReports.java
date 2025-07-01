package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {

	@Test
	public void createReport() {
		//step-1: create ExtentSparkReporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreport.html");
		
		//step-2: create ExtentReports object
		ExtentReports eReport=new ExtentReports();
		
		//step3: attach ExtentSparkReporter to ExtentReports
		eReport.attachReporter(spark);
		
		//create ExtentTest object
		ExtentTest test=eReport.createTest("createReport");
		
		//step5 call log(status,"message")
		test.log(Status.PASS, "log message added into report");
		
		//step-6: call flush()
		eReport.flush();
	}
}
