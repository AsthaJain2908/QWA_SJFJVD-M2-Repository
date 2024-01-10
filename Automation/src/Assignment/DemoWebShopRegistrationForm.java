package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegistrationForm {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver d = new ChromeDriver();

		// to maximize the browser
		d.manage().window().maximize();

		// to launch the Web Application
		d.get("https://demowebshop.tricentis.com/");

		// to click on Register link
		d.findElement(By.linkText("Register")).click();
		
		String t = d.getTitle();
		System.out.println(t);

		// to click on radio button
		d.findElement(By.id("gender-female")).click();

		// to enter firstname textfield
		d.findElement(By.id("FirstName")).sendKeys("First");

		// to enter firstname textfield
		d.findElement(By.id("LastName")).sendKeys("Last");

		// to enter Email textfield
		d.findElement(By.name("Email")).sendKeys("afl@gmail.com");

		// to enter Password textfield
		d.findElement(By.name("Password")).sendKeys("password@123");

		// to enter ConfirmPassword textfield
		d.findElement(By.name("ConfirmPassword")).sendKeys("password@123");
		
		// to enter Register Button
		d.findElement(By.name("register-button")).click();

	}

}
