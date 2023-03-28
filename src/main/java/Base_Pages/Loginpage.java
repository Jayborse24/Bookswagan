package Base_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Classes.Test_Base;

public class Loginpage extends Test_Base{
	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement username;
	
	@FindBy(name="ctl00$phBody$SignIn$txtPassword")
	WebElement password;
	
	@FindBy(id="ctl00_phBody_SignIn_btnLogin")
	WebElement loginBotton;
	
	
	
//initializing page object
public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//actions 
		public void login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBotton.click();
		}
		public void multipleUserLogin(String un, String pw) {
			 username.sendKeys(un);
			 password.sendKeys(pw);
			 loginBotton.click();
		}
		
}