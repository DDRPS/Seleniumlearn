package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
  @Test
  public void Errorscreenshot() throws IOException {
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("E:\\DD\\Screenshots\\Bugscreenshot.png"));
  }
  
  @Test
  public void googlesearch() throws IOException { 
  driver.get("https:\\www.google.com/");  
  
  try {
	  driver.findElement(By.name("q")).sendKeys("tirupati");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	 
	driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a")).click();
  }
  catch(Exception e)
  {
  System.out.println("error due to :"+e);
      Errorscreenshot();
  }
  }
	 
  
	  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
