package enteroptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GoogleSearch {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
   @Disabled
	@Test
	void test() {
		driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Java");
	    driver.findElement(By.name("q")).submit();
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   // driver.findElement(By.name("q")).sendKeys("Java"+Keys.ENTER); }
   }
	    
     /**
     * @throws InterruptedException
     */
    @Test
	 void testClear() throws InterruptedException {
	  driver.get("http://hyderabadreport.com/user");
	  driver.findElement(By.name("name")).sendKeys("divya");
	  driver.findElement(By.name("pass")).sendKeys("Hello@123");
	  driver.findElement(By.id("edit-submit")).click();
	  driver.findElement(By.id("edit-name")).clear();
	  driver.findElement(By.id("edit-name")).sendKeys("dwaraka");
		
     }

}
