package PageTests;

import org.testng.annotations.Test;

import PageObjects.Elements_Tables;
import PageObjects.TestBase;

public class Tables {
	Elements_Tables tables = new Elements_Tables();
	TestBase testBase = new TestBase();
	
	@Test
	public void addRecord() {
		testBase.driver.findElement(tables.addRecord).click();
		tables.addRecord("Bhavana", "Vasamsetti", "bhavana@gmail.com", "25", "10000", "Testing");
		
	}


}
