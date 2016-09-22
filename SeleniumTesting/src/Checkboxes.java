import com.thoughtworks.selenium.DefaultSelenium;

public class Checkboxes {

	public static void main(String[] args) {
		
		
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "http://www.tizag.com");
		selenium.start();
//		selenium.waitForPageToLoad("1800000");
		selenium.open("/htmlT/htmlcheckboxes.php");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		/*for(int i=1; i<=4; i++)
		{
			selenium.click("//div[4]/input["+i+"]");
			
		}*/
		
		int i = 1;
		int count=0;
		while(selenium.isElementPresent("//div[4]/input[" + i + "]")){
			
			selenium.click("//div[4]/input["+i+"]");
			i++;
			count ++;
		}
		
		System.out.println("Total checkboxes are " + count);
	}

}
