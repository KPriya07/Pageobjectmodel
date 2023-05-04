package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By logo=By.xpath("//div[@class='top-logo']//img[@src='images/logo.png']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public boolean ishomepagelogodisplayed() {
		WebElement logoelement=driver.findElement(logo);
		return logoelement.isDisplayed();
	}
}
