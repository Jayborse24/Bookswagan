package Base_Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base_Utility.Testutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base {
	public static Logger Log = Logger.getLogger(Test_Base.class);
	
	public  WebDriver driver;
    public Properties prop;
    
    public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
    
	public Test_Base() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\eclipse-workspace\\Bookswagan\\src\\main\\java\\Base_config\\config.properties");
							
			prop.load(ip);
	 	}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();			
		} 
		
}
	public void initialization() {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
	   driver.manage().window().maximize();
	 //  driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Testutility.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
	}
}