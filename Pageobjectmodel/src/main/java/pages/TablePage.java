package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.UtilityClass;

public class TablePage {
	WebDriver driver;
	By table=By.xpath("//li[@class='nav-item']//a[@href='table-pagination.php']");
	By tableheader=By.xpath("//div[contains(text(),'Pagination Example')]");
	
	public TablePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickontablepage() {
		
		WebElement tableelement=driver.findElement(table);
		tableelement.click();
	}
	public boolean displaytableheader(String expectedheader) {
		
		WebElement tableheaderelement=driver.findElement(tableheader);
		UtilityClass utility=new UtilityClass(driver);
		return utility.isTextMatched(tableheaderelement, expectedheader);
	}
}
