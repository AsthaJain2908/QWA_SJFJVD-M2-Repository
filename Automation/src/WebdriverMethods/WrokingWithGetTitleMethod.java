package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrokingWithGetTitleMethod {
	
	public static void main(String[] args) {
		
		//to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		
		driver.manage().window().maximize();		
				
		//to open the Web Application
				
		driver.get ("https://www.flipkart.com/");
		
		// to fetch the title
		
		String actualTitle = driver.getTitle();
		
		//.System.out.println("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!");
		
		if (actualTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
		   System.out.println("Test Case is Pass");
		}
		else
		{
		   System.out.println("Test Case is Fail");
		}
	}

}
