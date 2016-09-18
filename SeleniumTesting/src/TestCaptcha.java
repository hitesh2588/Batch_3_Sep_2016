import com.thoughtworks.selenium.DefaultSelenium;

public class TestCaptcha {

	
	public static void main(String[] args) throws InterruptedException {
		
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox C:/Program Files/Mozilla Firefox/firefox.exe", "http://timesofindia.indiatimes.com");
		selenium.start();
		selenium.open("/poll.cms");
		selenium.windowMaximize();
		
		
		String text = selenium.getText("//*[@id='mathq2']");
		
		//String text="22 + 77 =";
		System.out.println(text);
		
		String[] t = text.split(" ");
		
	/*	for(int i =0;i<t.length;i++)
		{
			
			System.out.println(t[i]);
						
		}*/
		
		int num1=Integer.parseInt(t[0]);
		int num2=Integer.parseInt(t[2]);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(t[1]);
		//Thread.sleep(2000);
		
		//String add=t[1];
		
		String operation = t[1];
		
				
		switch(operation){
		
		
		case "+" : 
			//if(t[1].equals(Character.toString('+'))){
				
				selenium.type("//*[@id='mathuserans2']",Integer.toString(num1+num2) + 1);
				
			//}
			break;
		case "-" :
			//if(t[1].equals(Character.toString('-'))){
				
				selenium.type("//*[@id='mathuserans2']",Integer.toString(num1-num2));
			//}
			break;
		case "*" :
			//if(t[1].equals(Character.toString('*'))){
				
				selenium.type("//*[@id='mathuserans2']",Integer.toString(num1*num2));
			//}
			break;
		case "/" :
			//if(t[1].equals(Character.toString('/'))){
				selenium.type("//*[@id='mathuserans2']",Integer.toString(num1/num2));
			//}
			break;
		}
		
		
	/*	if(t[1] == add)
		{
			System.out.println("Entering IF");
			System.out.println(Integer.toString(num1+num2));
			selenium.type("//*[@id='mathuserans2']",Integer.toString(num1+num2));
			
			
		}else 
		{
			System.out.println("Entering ELSE");
			System.out.println(Integer.toString(num1-num2));
			selenium.type("//*[@id='mathuserans2']",Integer.toString(num1-num2));
		}
		*/
		
		
		/*System.out.println(text.substring(0,1));
		System.out.println(text.substring(4,5));
		
		int Sum = Integer.parseInt(text.substring(0,1)) + Integer.parseInt(text.substring(4,5));
		System.out.println(Sum);
		String add= Integer(Sum).toString();*/
//		selenium.type("//*[@id='mathuserans2']",add);
		String aftertype=selenium.getText("//*[@id='mathq2']");
		System.out.println(aftertype);
		if(!aftertype.isEmpty()){
			
			selenium.click("//*[@id='pollform']/table/tbody/tr[4]/td/div");
			
			System.out.println("Clicked on Vote");
		}
	}
	
	/*
		On making the vote button click on website 'http://timesofindia.indiatimes.com/poll.cms' the pop up asking to select the option did not appear.
		Secondly using firebug unable to get the xpath of the popup( need to find a way to get the xpath).
	 */
}
