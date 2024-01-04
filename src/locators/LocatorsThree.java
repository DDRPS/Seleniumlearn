package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsThree {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();}


    @Disabled
	@Test
	void tes() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/form/input[4]")).sendKeys("Tirupati");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@123");
	    
	   driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();}
    

   @Test
  void test() throws InterruptedException {
	driver.get("https://www.redmine.org/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tirupati");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@123");
	driver.findElement(By.xpath("//*[@name=\"autologin\"]")).click();
	
	
	
	
	
	
	
	
	
}
}
    
	    

	

