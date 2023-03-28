package BaseTestcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Test_Base;
import Base_Pages.SignUp;


public class SignUptest extends Test_Base{
	public SignUp signup;

	public SignUptest() {
		super();
	}
	
	@BeforeMethod
		public void setUp() {
		initialization();
			signup = new SignUp(driver);
		}
	@Test
	public void SignUptest1() throws InterruptedException {
		signup.Signup(prop.getProperty("FirstName"), prop.getProperty("MobileNumber"), prop.getProperty("EnterOTP")
				, prop.getProperty("password"), prop.getProperty("confirm-password"));
	
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}
}