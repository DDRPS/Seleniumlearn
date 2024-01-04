package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_TimeOut_feature {
	WebDriver driver;
  @Test
  public void searchTestNG() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("TestNG");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
  }
  
  @Test(timeOut=5000)
  public void searchselenium() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//a[normalize-space()='Images']")).click(); 
	  
  }  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
