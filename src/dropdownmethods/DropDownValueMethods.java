package dropdownmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValueMethods {
	WebDriver driver;
  @Test
  public void dropdownoptions() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517214");
	  Select c = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	  c.selectByVisibleText("Afghanistan");
	 // c.selectByValue("AF");
	 // c.selectByIndex(2);  
	  
	  
	 // new Select( driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(5);	  
	  //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("AS");			  
	  //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("American Samoa");

	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
