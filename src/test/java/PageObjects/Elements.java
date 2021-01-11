package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Elements {
	
	TestBase testBase = new TestBase();
	HomePage homePage = new HomePage();
	Elements(){
		
		Assert.assertEquals(testBase.driver.getCurrentUrl(), testBase.prop.getProperty("url")+ "elements");
	}

	public By textBox = By.xpath("//span[text()='Text Box']");
	public By checkbox = By.xpath("//span[text()='Check Box']");
	public By radiobutton = By.xpath("//span[text()='Radio Button']");
	public By webTables = By.xpath("//span[text()='Web Tables']");
	public By buttons = By.xpath("//span[text()='Buttons']");
	public By links = By.xpath("//span[text()='Links']");
	public By brokenlinks = By.xpath("//span[text()='Broken Links - Images']");
	public By uploadanddownload = By.xpath("//span[text()='Upload and Download']");
	public By dynamicproperties = By.xpath("//span[text()='Dynamic Properties']");
	
	
	public void navigateToTextBoxes() {
		testBase.driver.findElement(textBox).click();		
	}
	public void navigateToCheckBoxes() {
		testBase.driver.findElement(checkbox).click();		
	}
	public void navigateToRadioButtons() {
		testBase.driver.findElement(radiobutton).click();		
	}
	public void navigateToWebTables() {
		testBase.driver.findElement(webTables).click();		
	}
	public void navigateTButtons() {
		testBase.driver.findElement(buttons).click();		
	}
	public void navigateToLinks() {
		testBase.driver.findElement(links).click();		
	}
	public void navigateToBrokenLinks() {
		testBase.driver.findElement(brokenlinks).click();		
	}
}
