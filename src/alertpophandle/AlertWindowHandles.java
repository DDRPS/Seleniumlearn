package alertpophandle;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindowHandles {
	WebDriver driver;
  @Test
  public void alertokbutton() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000);
	  driver.switchTo().alert().accept();
	  
  } 
  @Test
  public void alertcancelbutton() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(4000);
	  driver.switchTo().alert().dismiss();
  } 
  
  
  @Test
  public void alertwindowsendtextokorcancelbutton() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(8000);
	/*  driver.switchTo().alert().sendKeys("dwaraka");
	  Thread.sleep(4000);
	  driver.switchTo().alert().accept();*/
    Alert alt = driver.switchTo().alert();
    alt . sendKeys("dwaraka");
    alt . accept();
	  
	  
  }
  
	  
	  
	  
	  
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
