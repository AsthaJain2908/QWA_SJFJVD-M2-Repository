package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAppsQspidersRegister {

	public static void main(String[] args) throws InterruptedException {

		// to launch the browser
		WebDriver obj = new EdgeDriver();

		// to maximize the browser
		obj.manage().window().maximize();

		// to launch the Web Application
		obj.get("https://demoapps.qspiders.com/?scenario=1");

		Thread.sleep(2000);

		// to enter Name textfield
		obj.findElement(By.id("name")).sendKeys("ABCDE");

		// to enter Email textfield
		obj.findElement(By.id("email")).sendKeys("abc@gmail.com");

		// to enter Password textfield
		obj.findElement(By.id("password")).sendKeys("abc@123");

		// to click on Register Button
		obj.findElement(By.cssSelector("[type = 'submit']")).click();
		
	}

}
