package sikulitutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliWebAutomation {
		WebDriver driver;
		Screen s= new Screen();
  @Test
  public void webautomation() {
	  driver.get("http://www.seleniumlearn.com/");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
	  
	  
	  
	  
  }

}
