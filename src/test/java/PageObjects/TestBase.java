package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.commons.math3.fraction.ProperBigFractionFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class TestBase {

	public WebDriver driver;
	Properties prop = new Properties();
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//src//test//java//resources//chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public void launchApplication() {
		try {
			WebDriver driver = initializeDriver();
			File file = new File(System.getProperty("user.dir")+ "//src//test//java//resources//config.properties");
			FileInputStream fi = new FileInputStream(file);
			prop.load(fi);
			driver.get(prop.getProperty("url"));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@AfterTest
	public void quitDriver() {
		System.out.println("Entering After Test");
		driver.quit();
	} 
}
