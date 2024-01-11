package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedLocator {
	WebDriver driver;
 @Test
  public void Takescreenshot() throws InterruptedException, IOException {
	  driver.get("https:\\www.google.com");
	  Thread.sleep(1000);
	 
	  WebElement gm = driver.findElement(By.xpath("//a[normalize-space()='Images']"));
	  File f = gm.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("E:\\DD\\Screenshots\\gmail.png"));
	  
  }
 
 
 
 
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  
  }

}
