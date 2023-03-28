package BaseTestcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Classes.Test_Base;
import Base_Pages.Loginpage;
import Base_Pages.Searchpage;

public class Searchpagetest extends Test_Base{
			Loginpage loginPage;
			Searchpage search;
			
			public Searchpagetest() {
				super();
			}
			@BeforeMethod
			public void setUp() {
				initialization();
				search = new Searchpage(driver);
				
			}
			@Test
			public void SearchTest() throws InterruptedException {
				search.Search(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("Srh"));
				
			}
			
			
			@AfterMethod
			public void tearDown() {
			//driver.quit();
			}

}
