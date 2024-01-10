package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseMethod {
	
		public static void main(String[] args) {
			
			// to launch the browser
			WebDriver d = new ChromeDriver();
			
			// to maximize the browser
			d.manage().window().maximize();
					
			// to launch the Web Application
			d.get("https://www.amazon.com/");
			
			// to launch the Web Application
			d.close();
		}	

}
