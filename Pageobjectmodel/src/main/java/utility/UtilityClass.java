package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	WebDriver driver;
	By inputform=By.xpath("//a[contains(text(),'Input Form')]");
	By showmessage=By.xpath("//button[@id='button-one']");
	
	public UtilityClass(WebDriver driver) {
		this.driver=driver;
	}
	public String getTextofElement(WebElement element) {
		return element.getText();
	}
	
	public boolean isTextMatched(WebElement element,String expected) {
		String actualtext=element.getText();
		return actualtext.equals(expected);
	}
}
