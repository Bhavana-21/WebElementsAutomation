package PageObjects;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Elements_CheckBox {
	TestBase testBase = new TestBase();
	Elements elements = new Elements();
	
	public Elements_CheckBox(){
		elements.navigateToCheckBoxes();
		Assert.assertEquals(testBase.driver.getCurrentUrl(), testBase.prop.getProperty("url")+ "checkbox");
	}
	
	public By allCheckBoxes = By.xpath("//input[@type='checkbox']");
	public By homeCB = By.xpath("//span[text()='Home']/../input");
	public By desktopCB = By.xpath("//span[text()='Desktop']/../input");
	public By notesCB = By.xpath("//span[text()='Notes']/../input");
	public By commandsCB = By.xpath("//span[text()='Commands']/../input");
	public By documentsCB = By.xpath("//span[text()='Documents']/../input");
	public By officeCB = By.xpath("//span[text()='Office']/../input");
	public By workSpaceCB = By.xpath("//span[text()='WorkSpace']/../input");
	public By reactCB = By.xpath("//span[text()='React']/../input");
	public By vueCB = By.xpath("//span[text()='Vuew']/../input");
	public By angularCB = By.xpath("//span[text()='Angular']/../input");
	public By publicCB = By.xpath("//span[text()='Public']/../input");
	public By privateCB = By.xpath("//span[text()='Private']/../input");
	public By classifiedCB = By.xpath("//span[text()='Classified']/../input");
	public By generalCB = By.xpath("//span[text()='General']/../input");
	public By downloadsCB = By.xpath("//span[text()='Downloads']/../input");
	public By wordFileCB = By.xpath("//span[text()='Word File.doc']/../input");
	public By excelFileCB = By.xpath("//span[text()='Excel File.doc']/../input");
	public By expandAll = By.xpath("//button[@title='Expand all']");
	public By collapseAll = By.xpath("//button[@title='CollapseaAll']");
	
	public void validateAllCBsChecked() {
		testBase.driver.findElement(homeCB).click();
		List<WebElement> lsCBs = testBase.driver.findElements(allCheckBoxes);
		for(int i = 0; i< lsCBs.size();i++) {
			Assert.assertTrue(lsCBs.get(i).isSelected());
		}
		for(WebElement wCB  : lsCBs) {
			Assert.assertTrue(wCB.isSelected());
		}
	}
	
	public void explandAllSections() {
		testBase.driver.findElement(expandAll).click();
	}
	
	public void collapseAllSections() {
		testBase.driver.findElement(collapseAll).click();
	}
	
	public void validateParentOnChildSelected(WebElement Parent, WebElement FirstChild, WebElement SecondChild, WebElement child) {
		child.click();
		Assert.assertTrue(Parent.isSelected());
		Assert.assertTrue(FirstChild.isSelected());
		Assert.assertTrue(SecondChild.isSelected());
	}
	
	public void validateParentCheckedAllChild(WebElement Parent, List<WebElement> lsChildObjects) {
		Parent.click();
		for(WebElement wCB : lsChildObjects) {
			Assert.assertTrue(wCB.isSelected());	
		}		
	}
}
