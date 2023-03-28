package Base_Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Classes.Test_Base;
public class Searchpage extends Test_Base{

	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement username;
	
	@FindBy(name="ctl00$phBody$SignIn$txtPassword")
	WebElement password;
	
	@FindBy(id="ctl00_phBody_SignIn_btnLogin")
	WebElement loginBotton;

	@FindBy(xpath="//input[@id='inputbar']")
	WebElement Search;
	
	@FindBy(xpath="//input[@id='inputbar']")
	WebElement Book;
				
	public Searchpage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
		    	
			}
	public void Search(String un,String pwd, String Srh) throws InterruptedException {
				username.sendKeys(un);
				password.sendKeys(pwd);
				loginBotton.click(); 
		    	Thread.sleep(2000);
		    	Search.sendKeys(Srh);
		    	Thread.sleep(2000);
		    	Search.sendKeys(Keys.ENTER);
		    		
			}
}
