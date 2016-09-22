import com.thoughtworks.selenium.DefaultSelenium;

public class Dropdown {

	public static void main(String[] args) {
		
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "https://www.wikipedia.org/");
		selenium.start();
//		selenium.waitForPageToLoad("1800000");
		selenium.open("/");
		selenium.windowMaximize();
		
//		selenium.select("//*[@id='searchLanguage']", "value=hi");
		
		String[] values= selenium.getSelectOptions("//*[@id='searchLanguage']");

		for(int i=1; i<values.length ;i++){
			
			//String[] values= selenium.getSelectOptions("//*[@id='searchLanguage']/option["+i+"]");
			System.out.println(values[i]);
		}
		
	}

}
