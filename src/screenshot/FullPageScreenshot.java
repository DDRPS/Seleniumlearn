package screenshot;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import java.awt.Image;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullPageScreenshot {
	WebDriver driver;
  @Test
  public void completepagescreenshot() throws InterruptedException {
	  driver.get("");
	  Thread.sleep(2000);
	//  Screenshot s = new AShot().shootingStrategy(ShootingStrategies viewportPasting(1000)).takeScreenshot(driver);
	//  Image10.write(s.getImage(),"PNG",new File("")
  }
  

	

private ShootingStrategy ShootingStrategies(int i) {
	// TODO Auto-generated method stub
	return null;
}




@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
