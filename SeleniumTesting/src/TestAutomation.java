import com.thoughtworks.selenium.DefaultSelenium;

/**
 * @author Hitesh
 *
 */


public class TestAutomation {

	public static void main(String[] args) {

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files (x86)/Mozilla Firefox/firefox.exe", "http://gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		String actual_title = selenium.getTitle();
		System.out.println(actual_title);
		
		String expected_title = "Yahoo.com";
		
		if(actual_title.equals(expected_title)){
			
			System.out.println("Test Case Pass!!");
			
		}else{
			System.out.println("Test Case Fail!!");
			//selenium.captureScreenshot("D:/Screenshot/Error.jpg");
			selenium.captureEntirePageScreenshot("D:/Screenshot/EntirePageError.jpg", "background=#1A55D6");
		}
		
		selenium.click("next");
		
		/* selenium.close(); //Close Current Browser on which the main focus or site was opened.
		selenium.stop(); // Kill Session - Close all related windows like tabs and popups*/
		
	}

}
