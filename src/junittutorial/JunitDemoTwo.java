package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoTwo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	    @Test
        void test1() {            
		
	     }
		@Disabled
		@Test
		void test2() {
			driver.get("https://www.facebook.com");
		
			
		}


		@Test
		void test3() {
			driver.get("https://www.twitter.com");
				
		}

        @Disabled
		@Test
		void test4() {
			driver.get("https://www.selenium.dev");
				
		}

        @Ignore
		@Test
		void test5() {
			driver.get("https://www.redmine.org");
				

		
	

	}
}





















