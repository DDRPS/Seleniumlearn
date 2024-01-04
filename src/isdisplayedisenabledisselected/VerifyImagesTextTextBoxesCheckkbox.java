package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyImagesTextTextBoxesCheckkbox {
	WebDriver driver;
  @Test
  public void verifytextandimages() throws Exception {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  Boolean sign = driver.findElement(By.xpath("//div[@id='top-menu']")).isDisplayed();
	  
	  if (sign==true)
	  {
	  System.out.println("sign in link is available in redmine.com");
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  }
	  else
	  { 
		  System.out.println("sign in link is not avialable in redmine application");
	  }  
		  
	  }
  
  @Test
  public void verifytextandimage() throws Exception {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  Boolean redmine = driver.findElement(By.xpath("//tbody/tr/td[1]/a[1]/img[1]")).isDisplayed();
	  
	  if(redmine==true)
	  {
	  }
	  }
  
  
	  @Test
	  public void verifytextfiledsbox() throws Exception {
		  driver.get("https://www.redmine.org/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@class='login']")).click();
		  Boolean log = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		  if(log==true)
		  {
			System.out.println("login text filed is enabled to enter usernmae");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dwaraka");
		  }
		  else
		  {
			  System.out.println("login text filed is not enabled to enter usernmae");
			  
		  }
		  }
		  @Test
		  public void verifycheckboxradibuttons() throws Exception {
			  driver.get("https://www.redmine.org/");
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//a[@class='login']")).click();
			  driver.findElement(By.xpath("//label[@for='autologin']")).click();
			  Boolean checkbox = driver.findElement(By.xpath("//label[@for='autologin']")).isSelected();
			  if(checkbox==true)
			  {
				  System.out.println("stay logged is checkbox is selected");
				  			  }
			  else
			  {
				  System.out.println("stay logged in checkbox is not selected");
			  }
		  
		  }
			  @Test
			  public void verifycheckboxradibutton() throws Exception {
				  driver.get("https://www.redmine.org/projects/redmine/roadmap");
				  Thread.sleep(3000);
			 
				  Boolean checkbox = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/form/ul[1]/li[1]/label/input")).isSelected();
			  
				  if(checkbox==true)
				  {
					  System.out.println("defect is selected in checkbox");					  
				  }
				  else {
					  System.out.println("defect is not selected in checkbox");
				  }
			  
			  
		  
		  
	  
		  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  
  }

}
