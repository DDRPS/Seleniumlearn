package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	
	static WebDriver driver ;

	
	public static void main(String[] args) throws InterruptedException {
		  
		   Thread.sleep(3000);
	      driver = new ChromeDriver();
	      driver.manage().window().maximize(); 		  
		  driver.manage().window().minimize();
		  driver.close();
		  driver.quit();
		  
		 // driver = new EdgeDriver();
		 // driver.manage().window().maximize();
			
		
		
		// driver = new FirefoxDriver();
	
}	 

}
