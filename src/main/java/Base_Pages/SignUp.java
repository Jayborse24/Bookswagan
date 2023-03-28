package Base_Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Classes.Test_Base;

public class SignUp extends Test_Base{

		@FindBy(xpath="//div[@class='form-group col-sm-12']//a[@class='themecolor d-block w-100 mb-3 font-weight-bold signuplink'][normalize-space()='New to Bookswagon? Sign up']")
		WebElement NewtoBookswagonSignup;
		
		@FindBy(name="ctl00$phBody$SignUp$txtName")
		WebElement FirstName;
		
		@FindBy(name="ctl00$phBody$SignUp$txtEmail")
		WebElement EnterMobileNumber;
		
		@FindBy(xpath="//div[@class='g-recaptcha']")
		WebElement recaptcha;
		
		@FindBy(xpath="//input[@id='ctl00_phBody_SignUp_btnContinue']")
		WebElement ContinueBtn;
		
		@FindBy(name="ctl00$phBody$SignUp$txtOTP")
		WebElement EnterOTP;
		
		@FindBy(xpath="//input[@id='ctl00_phBody_SignUp_txtPassword']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='ctl00_phBody_SignUp_txtConfirmPwd']")
		WebElement confirmpassword;
		
		public SignUp(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void Signup(String FN,String EMN, String otp, String pwd, String cpwd) throws InterruptedException {
			NewtoBookswagonSignup.click();
			FirstName.sendKeys(FN);
			EnterMobileNumber.sendKeys(EMN);
			Thread.sleep(2000);
	    	recaptcha.click();
	    	Thread.sleep(2000);
	    	ContinueBtn.click();
	    	Thread.sleep(2000);	
	    	EnterOTP.sendKeys(otp);
	    	Thread.sleep(2000);	
	    	password.sendKeys(pwd);
	    	Thread.sleep(2000);	
	    	confirmpassword.sendKeys(cpwd);
	    	Thread.sleep(2000);	
	    	EnterOTP.sendKeys(Keys.ENTER);
	    	password.sendKeys(Keys.ENTER);
	    	confirmpassword.sendKeys(Keys.ENTER);
		}
	}