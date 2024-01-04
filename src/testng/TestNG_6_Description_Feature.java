package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_Description_Feature {
	WebDriver driver;
  @Test(description="Top Menus module")
  public void RM1() {
	  driver.findElement(By.xpath("//a[@class='projects']")).click(); 	  
  }
  
  @Test(description="login Module")
  public void RM5() {
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("divya");
	 
  }  
  @Test(description="Register Module")
  public void RM6() {
	  driver.findElement(By.xpath("//a[@class='register']")).click();
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("divya");	  
  }
  @Test(description="Search Module")
  public void RM8() {
	  driver.findElement(By.xpath("//input[@id='q']")).sendKeys("java");
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org");  
  }

  @AfterTest
  public void afterTest() {
  }

}
