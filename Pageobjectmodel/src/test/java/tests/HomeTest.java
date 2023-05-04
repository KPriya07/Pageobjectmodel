package tests;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{
	HomePage homepage;

	@Test
	public void verifyhomepagelogo() {
		homepage=new HomePage(driver);
		homepage.ishomepagelogodisplayed();
	}
}
