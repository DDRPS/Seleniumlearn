package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoFour {
	static WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test1() {
		driver.get("https://www.google.com");
		
	

	
	}
	@Test
	void test2() {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	void test3() {
		driver.get("https://www.twitter.com");
		
	}
	@Test
	void test4() {
		driver.get("https://www.selenium.dev");
		
	}
}

						
		
		
		
		
		
	

