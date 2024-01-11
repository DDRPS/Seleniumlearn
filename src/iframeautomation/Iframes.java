package iframeautomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframes {
	WebDriver driver;
  @Test
  public void iframe() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(3000);
	  
	  WebElement res = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(res);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
