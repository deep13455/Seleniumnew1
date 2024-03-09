package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreport {
	public ExtentReports reports;
	public ExtentTest test;

	@BeforeClass
	public void report() {
		reports = new ExtentReports("./testreport/defect.html");
		test = reports.startTest("runner_class");
	}

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver();
		dr.get("https://www.facebook.com");
		if()
	}
}
