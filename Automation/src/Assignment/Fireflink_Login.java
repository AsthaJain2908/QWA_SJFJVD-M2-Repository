package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//d.get("https://www.fireflink.com/");
		d.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@href='https://app.fireflink.com/signin']")).click();
		Thread.sleep(2000);
		
		// Enter Email Id & Password
		d.findElement(By.name("emailId")).sendKeys("astha.jain9381@gmail.com");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("Manager@123");
		Thread.sleep(2000);
		
		 //Click on Sign in Button
		d.findElement(By.xpath("//button[text()='Sign in']")).click();
	}
}




































