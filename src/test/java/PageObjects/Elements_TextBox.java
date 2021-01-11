package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Elements_TextBox {
	

	TestBase testBase = new TestBase();
	Elements elemnts = new Elements();
	public By fullname = By.xpath("//input[@id ='userName']");
	public By email = By.xpath("//input[@id ='userEmail']");
	public By currentaddress = By.xpath("//textarea[@id ='currentAddress']");
	public By permenantaddress = By.xpath("//textarea[@id ='permanentAddress']");
	public By submitbutton = By.xpath("//button[@id ='submit']");
	
	public Elements_TextBox(){
		elemnts.navigateToTextBoxes();
		Assert.assertEquals(testBase.driver.getCurrentUrl(), testBase.prop.getProperty("url")+ "text-box");
	}
	
	public void enterFullName(String sName) {
		 testBase.driver.findElement(fullname).sendKeys(sName);
	}
	
	public void fillForm(String sName, String sEmail, String Add1, String Add2) {
		this.enterFullName(sName);
		testBase.driver.findElement(email).sendKeys(sEmail);
		
		testBase.driver.findElement(submitbutton).click();
	}
	
	
}
