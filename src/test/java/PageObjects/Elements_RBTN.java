package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Elements_RBTN {
	

	TestBase testBase = new TestBase();
	Elements elemnts = new Elements();
	
	public Elements_RBTN(){
		elemnts.navigateToRadioButtons();
		Assert.assertEquals(testBase.driver.getCurrentUrl(), testBase.prop.getProperty("url")+ "radio-button");
		Assert.assertTrue(testBase.driver.findElement(doYouLikeTheSite).isDisplayed());
		
	}
	
	public By doYouLikeTheSite = By.xpath("//div[text()='Do you like the site?']");
	public By yes = By.xpath("//label[text()='Yes']/../input");
	public By impresive = By.xpath("//label[text()='Impressive']/../input");
	public By no = By.xpath("//label[text()='No']/../input");
}
