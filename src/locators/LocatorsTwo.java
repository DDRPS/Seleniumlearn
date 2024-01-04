package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTwo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.redmine.org");
		driver.findElement(By.className("login")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("divya");
		driver.findElement(By.name("password")).sendKeys("Hello@123");
		Thread.sleep(3000);
		driver.findElement(By.className("register")).click();
		driver.findElement(By.id("user_login")).sendKeys("div");
		
		
		
		
	}
}
