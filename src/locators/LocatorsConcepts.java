package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsConcepts {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
     @Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("divya");
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.cssSelector("input.form-submit")).click();
     }
		
		@Disabled
        @Test
		void testcase() throws InterruptedException {
			driver.get("http://hyderabadreport.com/user");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Photos")).click();
			driver.findElement(By.linkText("Telangana")).click();
			driver.findElement(By.partialLinkText("News")).click();
		}
			@Test
			void totalnumoflinks() throws InterruptedException {
				driver.get("https://www.ndtv.com/");
				List< WebElement> tnlinks = driver.findElements(By.tagName("a"));
				
				System.out.println(tnlinks.size());
			
		
    
   
		
		
		
	}

}
