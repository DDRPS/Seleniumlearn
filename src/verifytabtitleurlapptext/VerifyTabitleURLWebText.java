package verifytabtitleurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabitleURLWebText {
	WebDriver driver;
  @Test
  public void verifytabtitle() {
	  driver.get("https://www.google.com");
	  
	  String exptabtext = "Google";
	  System.out.println("Exp Tab Title Is: "+exptabtext  );  
	  
	  String acttabtext = driver.getTitle();
	  System.out.println("Act Tab Title Is: "+acttabtext);
	  Assert.assertEquals(acttabtext, exptabtext);
  }
  @Test
  public void verifytext() {
	  driver.get("https://www.google.com/");
	  String expgtext = "Gmail";
	  String actgtext = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).getText();
	 Assert.assertEquals(actgtext ,expgtext );
  }
  @Test
  public void verifytex() {
	  driver.get("https://www.google.com/");	 
	 String expitext = "Images";
	  String actitext = driver.findElement(By.xpath("//a[@aria-label='Search for Images (opens a new tab)']")).getText();
	 Assert.assertEquals(actitext, expitext);
  }
  @Test
  public void verifytexts() {
	  driver.get("https://www.techlearn.in/wp-login.php/");
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("divya");
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("hello@123");
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	  String exptext = "The username divya is not registered on this site. If you are unsure of your username, try your email address instead.";
	  String acttext = driver.findElement(By.xpath("//p[contains(text(),'The username')]")).getText();
	  Assert.assertEquals(acttext , exptext);
  }
  @Test
  public void verifytextss() throws Exception {
	  driver.get("https://www.redmine.org/projects/redmine/wiki/Download/");
	  String exptext = "Download";
	  
	  String acttext = driver.findElement(By.xpath("//div[@id='main']//h1[1]")).getText();
	  Assert.assertEquals(acttext, exptext);
  }
  
	  
    
  
	  
  
	  @Test
	  public void verifyurl() {
		  driver.get("https://www.google.com");
		  String expurl = "https://www.google.com/";
		  String acturl = driver.getCurrentUrl();
		  Assert.assertEquals(acturl , expurl);
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
