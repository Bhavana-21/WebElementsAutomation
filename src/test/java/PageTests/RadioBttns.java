package PageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Elements_RBTN;
import PageObjects.TestBase;

public class RadioBttns {

	TestBase testBase = new TestBase();
	Elements_RBTN rbtns = new Elements_RBTN();

	@Test
	public void clickImpressive() {
		testBase.driver.findElement(rbtns.doYouLikeTheSite).click();
		Assert.assertTrue(testBase.driver.findElement(rbtns.doYouLikeTheSite).isSelected());
	}


}
