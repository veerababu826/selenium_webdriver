package day28;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
		}
	
	public void capturescreenshot(String filename) throws Exception {
		
		/*
		 * TakesScreenshot takesScreenshot=(TakesScreenshot) driver; File sourceFile =
		 * takesScreenshot.getScreenshotAs(OutputType.F); File destFile = new
		 * File("./Screenshots/img1.jpg"); FileUtils.copyFile(sourceFile, destFile);
		 * System.out.println("Screenshot saved successfully");
		 */
		    TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		    File sourcefile=takesScreenshot .getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	        File destfile=new File("./screenshots/+filename");
	        FileUtils.copyFile(sourcefile, destfile);
	        System.out.println("screenshot saved successfully");
	}

}
