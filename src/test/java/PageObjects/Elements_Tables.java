package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Elements_Tables {
	

	TestBase testBase = new TestBase();
	Elements elemnts = new Elements();
	
	public Elements_Tables(){
		elemnts.navigateToRadioButtons();
		Assert.assertEquals(testBase.driver.getCurrentUrl(), testBase.prop.getProperty("url")+ "webtables");
		Assert.assertTrue(testBase.driver.findElement(webTablesHeading).isDisplayed());	
	}
	
	public By webTablesHeading = By.xpath("//div[text()='Web Tables']");
	public By searchField = By.xpath("//label[text()='Yes']/../input");
	public By addRecord = By.xpath("//label[text()='Impressive']/../input");
	public By addButton = By.xpath("//button[text()='Add']");
	
	public By firstName = By.xpath("//input[@id ='firstName']");
	public By lastName = By.xpath("//input[@id ='lastName']");
	public By email = By.xpath("//input[@id ='userEmail']");
	public By age = By.xpath("//input[@id ='age']");
	public By salary = By.xpath("//input[@id ='salary']");
	public By department = By.xpath("//input[@id ='department']");
	
	public void editRecord(String sRowData) {
		testBase.driver.findElement(By.xpath("//div[text()='"+sRowData+"']/..//span[@title='Edit']")).click();
	}
	
	public void deleteRecord(String sRowData) {
		testBase.driver.findElement(By.xpath("//div[text()='"+sRowData+"']/..//span[@title='Delete']")).click();
	}
	
	public void recordAdded(String[] lsRow) {
		for (String sData : lsRow) {
		testBase.driver.findElement(By.xpath("//div[text()='"+sData+"']")).isDisplayed();
		}
	}
	
	
	
}
