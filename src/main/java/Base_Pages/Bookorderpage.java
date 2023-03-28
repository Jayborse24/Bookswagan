package Base_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Classes.Test_Base;

public class Bookorderpage extends Test_Base{

	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement username;
	
	@FindBy(name="ctl00$phBody$SignIn$txtPassword")
	WebElement password;
	
	@FindBy(id="ctl00_phBody_SignIn_btnLogin")
	WebElement loginBotton;

	@FindBy(xpath="//li[@id='ctl00_libestseller']//a[contains(text(),'Best sellers')]")
	WebElement Boxsets;
		
	@FindBy(xpath="//img[@alt='Rich Dad Poor Dad']")
	WebElement TheHobbitandTheLordoftheRingsBoxedSet;
		
	@FindBy(xpath="//input[@value='Buy Now']")
	WebElement BuyNow;
		
	@FindBy(className="btn-red")
	WebElement PlaceOrder;
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_lvCustomerAdd_ctrl0_btnUseAddress']")
	WebElement DeliverAddress;
	
		public Bookorderpage(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	
		}
		public void Box(String un,String pwd) throws InterruptedException {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBotton.click(); 
	    	Thread.sleep(2000);
	    	Boxsets.click();
	    	Thread.sleep(2000);
	    	TheHobbitandTheLordoftheRingsBoxedSet.click();
	    	Thread.sleep(2000);
	    	BuyNow.click();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			PlaceOrder.click();
			Thread.sleep(2000);
			DeliverAddress.click();
			Thread.sleep(2000);
		}
	
}
