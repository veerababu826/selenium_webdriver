package testngconcepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider_parameterisation {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		
driver=new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
driver.manage().window().maximize();

}
	
@Test(dataProvider = "dp")
	
public void login(String username ,String password) throws Exception {
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		/*
		 * WebElement
		 * status=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		 * 
		 * System.out.println(status.getText());
		 */
		 
              boolean status1=
			  driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed(); 
			  
			  System.out.println(status1);
			  
			  if(status1==true) {
			  
			  WebElement dropd=driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']"));
			  
			  dropd.click();
			  
			  driver.findElement(By.xpath("//*[text()='Logout']")).click();
			  
			  Assert.assertTrue(true);
			  
			  } else {
	                // Handle unsuccessful login
	                WebElement errorMessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
	                System.out.println(errorMessage.getText());
	                Assert.fail("Login failed with invalid credentials");
	            } 
			    }
	
      @DataProvider(name="dp")
	
	    Object[][] logindata() {
		
	return new	Object [][] {{"Admin","admin123"},{"xyz@gmail.com","test@231"}};
		
		/* return data; */
	
	}
	
}
