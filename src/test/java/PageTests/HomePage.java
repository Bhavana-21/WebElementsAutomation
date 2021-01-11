package PageTests;

import org.testng.annotations.Test;

import PageObjects.TestBase;

public class HomePage{
	
	TestBase tb = new TestBase();
	
	@Test
	public void launchApp() {
		tb.launchApplication();
		
	}
	
	@Test()
	public void launchElements() {
		
	}
	
	
	
	
	

}
