package com.thoughtworks.selenium;

public class DefaultSelenium {
	
		public DefaultSelenium(String host,int port, String browser, String URL){
			
			System.out.println("Calling Constructor");
			System.out.println(host);
			System.out.println(port);
			System.out.println(browser);
			System.out.println(URL);
		}
				
		public void start()
		{
			
				System.out.println("Launching a browser");
		}
		
		public void open(String url)
		{
			
				System.out.println("Navigating to the URL");
		}
		
		public void click()
		{
						
				System.out.println("Click on an element");
		}
		
		public void type()
		{
				System.out.println("Type in an element");
		}
		
		public void getTitle()
		{
			
				System.out.println("Get Title of the element");
		}
		
		public static void main(String[] args) {
			
			/*browser,local host ip - 127.0.0.1,port - 4444 - In RC you need to tell your 
			code which browser and through which host we are starting the server
			
			Server started on which port.
			*/
			//Default selenium contructor always giove the base path
			/*In open() function we pass rthe local path as / or 
			if we want to go to a particular path then / further path ex: /index.phop */
		
			
		}

}
