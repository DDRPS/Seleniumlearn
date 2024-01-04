package dropdownmethod2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValueMethods2 {
	WebDriver driver;
  @Test(enabled=false)
  public void dropdownmethod() {
	 driver.get("https://www.redmine.org/account/register");
	 new Select( driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByVisibleText("Albanian (Shqip)");
     new Select( driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByValue("sq");
     new Select( driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByIndex(1);	  
	 Select c = new Select( driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
     c.selectByVisibleText("Albanian (Shqip)");
  }
	  
	  @Test
	  public void drop() {	 
		driver.get("https://www.redmine.org/account/register");  
	  new Select(driver.findElement(By.xpath("//*[@id=\"operators_status_id\"]"))).selectByVisibleText("is");
	  
	    }
	  @Test(enabled=false)
	  public void dropdownmethods() throws InterruptedException { 
	 driver.get("http://www.seleniumlearn.com/program-drop-down-select-option");	  
	 new Select(driver.findElement(By.xpath("//*[@id=\"transactionType\"]"))).selectByVisibleText("Developer");		  
     new Select(driver.findElement(By.xpath("//*[@id=\"transactionType\"]"))).selectByValue("1");

	  }	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
