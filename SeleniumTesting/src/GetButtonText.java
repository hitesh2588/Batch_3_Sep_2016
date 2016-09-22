import com.thoughtworks.selenium.DefaultSelenium;

@SuppressWarnings("deprecation")
public class GetButtonText {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "http://gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.getAttribute("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input");
		

	}

}
