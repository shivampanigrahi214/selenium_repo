package mavendemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PractiseTest {
	
	@Test
	public void dropDowns() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select listBox=new Select(years);
		List<WebElement> allYears = listBox.getOptions();
		listBox.selectByIndex(allYears.size()-1);
		
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		Select listBox2=new Select(months);
		List<WebElement> allMonths = listBox2.getOptions();
		
		for(int i=0;i<allMonths.size();i++) {
			listBox2.selectByIndex(i);
		}
		
		
	}

}
