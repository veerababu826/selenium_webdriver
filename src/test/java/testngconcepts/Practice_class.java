package testngconcepts;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_class {
	
	
	  @Test
	  
	  public void openbrowser() throws Exception {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.manage().window().maximize();
	  
	  String filePath = "C:\\Users\\user\\Desktop\\Flipkartscreenshot\\shot" +generatetimestamp()+ ".jpeg";
      File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File(filePath));
	  
	  }
	 
		
		  @Test public String generatetimestamp() {
		  
		  java.util.Date date=new java.util.Date();
		  
		  return date.toString().replace(" ","_" ).replace(":","_");
		  
		  }
		 
	 
	
	
	
	
	

}
