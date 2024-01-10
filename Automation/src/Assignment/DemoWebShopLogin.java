package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLogin {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver d = new ChromeDriver();

		// to maximize the browser
		d.manage().window().maximize();

		// to launch the Web Application
		d.get("https://demowebshop.tricentis.com/");

		// to click on Login link
		d.findElement(By.linkText("Log in")).click();

		// to enter Email textfield
		d.findElement(By.id("Email")).sendKeys("afl@gmail.com");

		// to enter Password textfield
		d.findElement(By.id("Password")).sendKeys("password@123");

		// to click on Remember Password checkbox
		d.findElement(By.id("RememberMe")).click();

		// to enter Login Button
		d.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		
		String title = d.getTitle();
		System.out.println(title);
	}
}
