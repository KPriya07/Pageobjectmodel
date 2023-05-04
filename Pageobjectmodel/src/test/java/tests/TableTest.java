package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {

	TablePage tablepage;
	
	@Test
	public void verifytablepage() {
		
		tablepage=new TablePage(driver);
		tablepage.clickontablepage();
		String expected="Table with Pagination Example";
		boolean status=tablepage.displaytableheader(expected);
		Assert.assertTrue(status);
		
	}

}
