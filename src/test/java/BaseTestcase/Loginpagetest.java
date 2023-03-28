package BaseTestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.Loginpage;


public class Loginpagetest extends Test_Base{
	 Loginpage loginPage;

	public Loginpagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new Loginpage(driver);
	}

	@Test(priority=1)
	public void loginTest() {

		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void MultiUserLogin(String un, String pw) {
		loginPage.multipleUserLogin(un,pw);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		//driver.quit();
	}
}