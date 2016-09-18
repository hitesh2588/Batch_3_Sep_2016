import com.thoughtworks.selenium.DefaultSelenium;


/**
 * @author Hitesh
 *
 */
public class TestAutomation {

	
	public static void main(String[] args) throws InterruptedException {

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "http://gmail.com");
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
		
		selenium.type("//*[@id='Email']", "hitesh.cool88@gmail.com");
		selenium.click("next");
		Thread.sleep(2000);
		selenium.type("//*[@id='Passwd']","qwerty");	
		selenium.click("//*[@id='signIn']");
		selenium.waitForPageToLoad("20000");
		System.out.println(selenium.getText("//*[@id='errormsg_0_Passwd']"));
				
		/*selenium.close(); //Close Current Browser on which the main focus or site was opened.
		selenium.stop(); // Kill Session - Close all related windows like tabs and popups*/		
	}

}
