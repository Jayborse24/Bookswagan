package com.listenerproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyTestListener.class)
//@Listeners(test.MyTestListener.class)
public class SampleProject {
	
		
		@Test
			public void openBrowser() {
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.bookswagon.com/");
				//driver.quit();
				
			}
			@Test
			public void validateMathOPeration() {
				
				Assert.assertEquals(true, true);
			}

		}

