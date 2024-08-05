package testngconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallel_Demo {
    
	WebDriver driver;
	
	
	@BeforeClass
	
	@Parameters({"browser"})
	
	void setup(String br) {
		
	switch (br.toLowerCase()) {
	
	/*
	 * case "chrome":driver=new ChromeDriver();
	 * 
	 * break;
	 */
	 case "Edge":driver=new EdgeDriver();	
		break;

	default:
		System.out.println("invalid browser");
		
		return;
	}
		

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
driver.manage().window().maximize();

	}
	
	@Test(priority = 1)
	
	void testLogo() {
		
		
		boolean status1=
				  driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed(); 
	        Assert.assertEquals(status1, true);
		
	}
	
	@Test(priority = 2)
	    void testtitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Test(priority = 3)
	void testurl() {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
   /* @AfterClass
    public void tearDown() {
        // Quit WebDriver instance
        if (driver != null) {
            driver.quit();
        }*/
    }

	

