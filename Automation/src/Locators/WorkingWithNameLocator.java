package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1378pi99be89d");
		
		// to identify the username textfield and perform any action with name locator use sendKeys method
		driver.findElement(By.name("username")).sendKeys("admin");
		
		// to identify the password textfield and perform any action with name locator use sendKeys method
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		// to identify the Login Button and perform any action with id locator use click method
		driver.findElement(By.id("loginButton")).click();
	}
}
