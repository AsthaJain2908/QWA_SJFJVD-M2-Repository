package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodAmazon {
	
	public static void main(String[] args) {
		
		// to launch a browser
		WebDriver d = new ChromeDriver();
		
		//to maximize the browser
		d.manage().window().maximize();
		
		// to open the Web Application
		d.get("https://www.amazon.com/");
		
		// to fetch the title
		String title = d.getTitle();
		//System.out.println("Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.");
		
		if(title.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
	}

}
