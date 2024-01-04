package sikulitutorial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();
  @Test
  public void f() throws SikuliException, InterruptedException {
	  s.click("E:\\DD\\sikuli\\Windowstart.PNG");
	  Thread.sleep(3000);	 
	  s.click("E:\\DD\\sikuli\\E:\\DD\\sikuli.PNG");
	  s.doubleClick("E:\\DD\\sikuli\\file.PNG");
	 s.dragDrop("E:\\DD\\sikuli\\Any.PNG", "E:\\DD\\sikuli\\dd.PNG");
  }
}
