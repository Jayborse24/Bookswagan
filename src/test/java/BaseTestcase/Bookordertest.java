package BaseTestcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Classes.Test_Base;
import Base_Pages.Bookpage;
import Base_Pages.Bookorderpage;
import Base_Pages.Loginpage;
public class Bookordertest extends Test_Base{
		Loginpage loginPage;
		Bookpage bookPage;
		Bookorderpage boxsets;
		
		public Bookordertest() {
			super();
		}
		@BeforeMethod
		public void setUp() {
			initialization();
			boxsets = new Bookorderpage(driver);
		}
		@Test
		public void BoxsetsTest() throws InterruptedException {
			boxsets.Box(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		@AfterMethod
		public void tearDown() {
			//driver.quit();
		}
}
