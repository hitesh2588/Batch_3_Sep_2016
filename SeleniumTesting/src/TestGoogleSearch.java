import com.thoughtworks.selenium.DefaultSelenium;

public class TestGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"firefox C:/Program Files/Mozilla Firefox/firefox.exe","https://www.google.co.in");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
		boolean b=selenium.isElementPresent("//*[@id='lst-ib']");
		
		
		System.out.println(b);
		selenium.type("//*[@id='lst-ib']", "selenium");
		Thread.sleep(1000); //due to synchronization issue of web element based on 'AJAX','Java Script', 'JQuery','Angular JS' with respect to the page load.
		int i =1;
		int count=0;
		while(selenium.isElementPresent("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li["+i+"]/div/div[@class='sbqs_c']"))
		{
		System.out.println(selenium.getText("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li["+i+"]/div/div[@class='sbqs_c']"));
		i++;
		count++;
		}
		System.out.println("Total Values are:" + count);
	}
	
}
