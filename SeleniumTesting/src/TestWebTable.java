import com.thoughtworks.selenium.DefaultSelenium;

public class TestWebTable {

	public static void main(String[] args) {
		
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "http://www.espncricinfo.com");
		selenium.start();
		selenium.open("/indian-premier-league-2016/engine/match/980901.html");
		selenium.waitForPageToLoad("60000");
		selenium.windowMaximize();
		/*selenium.close();
		selenium.stop();*/
	
//		//table[1]/tbody/tr[2]/td[2]/a (Partial Xpath)
		
//		String text=selenium.getText("//table[1]/tbody/tr[2]/td[2]/a");
		
//		System.out.println(text);
		
		for(int i=2 ; i <=20 ; i++){
			
		//System.out.println(selenium.getText("//table[1]/tbody/tr["+ i +"]/td[2]/a"));
			for(int j=2; j <=9; j++){
				
				System.out.print(selenium.getText("//table[1]/tbody/tr["+ i +"]/td["+ j + "]"));
				System.out.print(" ");
			}
		i=i+1;
		System.out.println();;
		}
		
	}
}
