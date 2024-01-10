package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAppsQspidersLogin {
	
public static void main(String[] args) throws InterruptedException {
	
	// to launch the browser
	WebDriver obj = new EdgeDriver();

	// to maximize the browser
	obj.manage().window().maximize();

	// to launch the Web Application
	obj.get("https://demoapps.qspiders.com/?scenario=1");

	Thread.sleep(2000);
	
	// to click on Login Link
	obj.findElement(By.cssSelector("[class='poppins text-[12px] font-sans font-bold text-slate-500 relative top-3 hover:text-slate-700 cursor-pointer underline']")).click();

	// to enter Email Id in textfield in Login Page
	obj.findElement(By.id("email")).sendKeys("abc@gmail.com");

	// to enter Password in textfield in Login Page
	obj.findElement(By.id("password")).sendKeys("abc@123");
	
	// to click on Login Button
	obj.findElement(By.cssSelector("[type ='submit']")).click();
}

}
