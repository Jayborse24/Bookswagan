package BaseTestcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.Bookpage;

public class Bookpagetest extends Test_Base{	
		Loginpagetest loginPage;
		Bookpage bookPage;

		public Bookpagetest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			bookPage = new Bookpage(driver);
		}
			@Test
			public void BookTest() throws InterruptedException {
				bookPage.Book(prop.getProperty("username"), prop.getProperty("password"));
			}
			
			
				
			@AfterMethod
			public void tearDown() {
				//driver.quit();
			}
}
