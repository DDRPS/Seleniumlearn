package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j {
	WebDriver driver;
  @Test
  public void googlesearch() throws InterruptedException {
	  Logger log= Logger.getLogger("search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("chrome browser launch");
	  driver.manage().window().maximize();
	  log.info("browser maximize");
	  driver.get("https://www.google.com");
	  log.info("navigate to google application");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  log.info("enter text selenium in google bar");
	  driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	  log.info("enter button pressed");
	  Thread.sleep(3000);
	  log.info("wait for 3 sec");
	  driver.get("http://www.seleniumlearn.com/");
	  log.info("navigate to selenium application");
	  driver.findElement(By.xpath("//a[normalize-space()='Resume']")).click();
	  log.info("press that resume button");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
  }
}
