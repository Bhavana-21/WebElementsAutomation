package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

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
	public By addRecord = By.xpath("//button[text()='Add']");
	
	public By firstName = By.xpath("//input[@id ='firstName']");
	public By lastName = By.xpath("//input[@id ='lastName']");
	public By email = By.xpath("//input[@id ='userEmail']");
	public By age = By.xpath("//input[@id ='age']");
	public By salary = By.xpath("//input[@id ='salary']");
	public By department = By.xpath("//input[@id ='department']");
	public By submit = By.xpath("//button[text() ='Submit']");
	
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

	public void addRecord(String firstName, String lastName , String email, String age, String salary, String department) {
		testBase.driver.findElement(this.firstName).sendKeys(firstName);
		testBase.driver.findElement(this.lastName).sendKeys(lastName);
		testBase.driver.findElement(this.email).sendKeys(email);
		testBase.driver.findElement(this.age).sendKeys(age);
		testBase.driver.findElement(this.salary).sendKeys(salary);
		testBase.driver.findElement(this.department).sendKeys(salary);
		testBase.driver.findElement(this.submit).click();
		
	}
	
	
	
}
