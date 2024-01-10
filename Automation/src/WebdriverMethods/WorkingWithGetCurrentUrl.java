package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrl {
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the Web Application
		driver.get("https://www.amazon.com/");
		
		// to fetch the current url
		String url = driver.getCurrentUrl();
		
		//System.out.println("The Current Url of amazon is :"+ url);
		
		if (url.equals("https://www.amazon.com/"))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
	}
}
