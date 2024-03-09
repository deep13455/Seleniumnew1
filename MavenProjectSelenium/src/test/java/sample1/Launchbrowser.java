package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	@Test
	public void launch() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	}

}
