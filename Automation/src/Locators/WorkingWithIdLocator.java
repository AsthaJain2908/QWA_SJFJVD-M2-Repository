package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// to identify the username textfield and perform any action with id locator use sendKeys method
		driver.findElement(By.id("email")).sendKeys("astha.jain2908@gmail.com");
		
		// to identify the password textfield and perform any action with id locator use sendKeys method
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

}
