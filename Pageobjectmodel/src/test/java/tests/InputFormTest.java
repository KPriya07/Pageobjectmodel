package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {

	InputFormPage inputformpage;
	
	@Test
	public void verifyinputformpage() {
		
		inputformpage=new InputFormPage(driver);
		inputformpage.clickoninformformpage();
		String expectedbuttontext="Show Message";
		String actualbuttontext=inputformpage.getInputformButtonText();
		Assert.assertEquals(actualbuttontext, expectedbuttontext);
	}
}
