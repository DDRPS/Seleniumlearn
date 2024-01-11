package newtabswitching;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SwitchBrowserTabs {
	WebDriver driver;
  @Test
  public void irctc() throws InterruptedException {
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[4]/a")).click();	  
	  Thread.sleep(3000);
	  ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	  driver.findElement(By.xpath("//*[@id=\"loginuserid\"]")).sendKeys("dwaraka");
	  driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Hello@123");
	  Thread.sleep(3000);
	  driver.switchTo().window(tabs.get(0));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
  }
	  @Test
	  public void flipkart () throws InterruptedException  {
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]")).click();         
		 ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		// driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		// driver.switchTo().window(tabs.get(0));
		 
	  }
	  
	  
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
