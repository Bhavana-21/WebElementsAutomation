package PageTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.Elements_TextBox;
import PageObjects.TestBase;

public class TextBoxes {
	
	TestBase testBase = new TestBase();
	Elements_TextBox textBox = new Elements_TextBox();
	
	@BeforeClass
	public void launchApp(){
		testBase.launchApplication();
	}
	
	@Test
	public void formSubmit() {
		textBox.fillForm("Bhavana", "test@gmail.coom", "Address 1 Test", "Address 1 Test");
	}

}
