package day28;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestngListeners_demo {
	
	      WebDriver driver;
	
          @BeforeClass
	
	        public void setup() {
		
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
			}
	
	      @Test(priority = 1)
	       public void testlogo() {
		   boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	       Assert.assertEquals(logo, true);
	       }
	      @Test(priority = 2)
	      public void testappurl() {
	      Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
	      }
	      @Test(priority = 3,dependsOnMethods ={"testappurl"})
	     void testhomepagetitle() {
	     Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	     }
	     @AfterClass
	     void teardown() {
	     driver.quit();
	     }
	     }


