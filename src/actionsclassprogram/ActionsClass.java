package actionsclassprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsClass {
	WebDriver driver;
  @Test
  public void rightclick() {
	  driver.get("http://www.seleniumlearn.com/");
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Testing']"))).build().perform();  }
	  
	  @Test
	  public void doubleclick() throws InterruptedException {
		  driver.get("http://www.seleniumlearn.com/double-click");
		  Thread.sleep(5000);
		  Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me!']"))).doubleClick().build().perform();
	  }
		  @Test
		  public void mousehover() throws InterruptedException {
			  driver.get("http://www.seleniumlearn.com/");
			  Thread.sleep(5000);
		     Actions act = new Actions(driver);
		     act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		     Thread.sleep(2000);
		     act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']"))).click().build().perform();
		  }
		  @Test
		  public void draganddrap() throws InterruptedException {
			  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
			  Thread.sleep(5000);
			  Actions act = new Actions(driver);
			  WebElement source = driver.findElement(By.id("draggable"));
			  WebElement target = driver.findElement(By.id("droppable"));
			  act.dragAndDrop(source, target).build().perform();
		  }
		  
		  @Test
		  public void keyboardfunctions() throws InterruptedException {
			  driver.get("https://www.redmine.org/login");
			  Thread.sleep(5000);
			  Actions act = new Actions(driver);
			  Thread.sleep(2000);
			  act.sendKeys(Keys.TAB).build().perform();
			  act.sendKeys(Keys.ENTER).build().perform();
			  
			  
			  
			  	  
			  
			
			  
			  
			  
			  
			  
			  
			  
		     
		     
		     
		  
		  
		  
		  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
