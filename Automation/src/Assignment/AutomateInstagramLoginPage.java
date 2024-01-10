package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInstagramLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		// to fetch title of instagram
		String title = driver.getTitle();
		System.out.println(title);
		 
		// for wait the page to load for 2 seconds we need to throw an exception InterruptedException in main method
		Thread.sleep(2000);
		
		// to identify the username textfield and perform any action with name locator use sendKeys method
		driver.findElement(By.name("username")).sendKeys("astha.jain2908");
		
		// to identify the password textfield and perform any action with name locator use sendKeys method
		driver.findElement(By.name("password")).sendKeys("Astha@123");
		
		// to identify the Login Button and perform any action with id locator use click method
		driver.findElement(By.className("_acap")).click();	
		
		// to fetch title of Login Page
		String t = driver.getTitle();
		System.out.println(t);
		
		Thread.sleep(2000);
		
		driver.close();	
	}
}

