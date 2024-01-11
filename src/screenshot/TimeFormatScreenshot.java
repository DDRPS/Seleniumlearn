package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
	WebDriver driver;
  
  public void screenshot() throws IOException {
	  SimpleDateFormat dateformat = new SimpleDateFormat("yy_MM_dd_HH_mm_ss");
	  Date date = new Date();
	  String time = dateformat.format(date);
	  Object outputType;
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("E:\\DD\\Screenshots\\Google_"+time+".png"));
  }
  @Test
  public void google() throws InterruptedException, IOException {
	  driver.get("https:\\www.google.com");
	  Thread.sleep(1000);
	  screenshot();
	  driver.findElement(By.name("q")).sendKeys("benguluru");
	  Thread.sleep(1000);
	  screenshot();
	
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
