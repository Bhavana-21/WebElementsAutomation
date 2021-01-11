package PageTests;

import org.testng.annotations.Test;

import PageObjects.Elements_CheckBox;

public class CheckBoxes {
	
	Elements_CheckBox checkBoxes = new Elements_CheckBox();
	
	@Test
	public void validateAllChecked() {
		checkBoxes.validateAllCBsChecked();
		
	}

}
