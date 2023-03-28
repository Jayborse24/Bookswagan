package Base_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Classes.Test_Base;

public class Bookpage extends Test_Base{

	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement username;
	
	@FindBy(name="ctl00$phBody$SignIn$txtPassword")
	WebElement password;
	
	@FindBy(id="ctl00_phBody_SignIn_btnLogin")
	WebElement loginBotton;

		@FindBy(xpath="//a[normalize-space()='Book']")
		WebElement Book;
		
		@FindBy(xpath="//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Computer & Internet']")
		WebElement ComputerandInternet;
		
		@FindBy(xpath="/html[1]/body[1]/form[1]/div[10]/div[1]/div[2]/div[3]/div[1]/div[4]/div[5]/input[1]")
		WebElement AddToWishlist;
		
		public Bookpage(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	
		}
		public void Book(String un,String pwd) throws InterruptedException {
	    	username.sendKeys(un);
	    	password.sendKeys(pwd);
	    	loginBotton.click(); 
	    	Thread.sleep(2000);
	    	Book.click();
	    	Thread.sleep(2000);
	    	ComputerandInternet.click();
	    	Thread.sleep(2000);
			AddToWishlist.click();
			Thread.sleep(2000);
			
		}
}
