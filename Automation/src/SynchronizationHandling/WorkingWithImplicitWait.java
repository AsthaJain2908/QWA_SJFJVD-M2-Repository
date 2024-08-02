package SynchronizationHandling;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImplicitWait {

public class ActiTimeLoginandCreateCustomerLogout {
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r = new Random ();
		
		int no = r.nextInt(2000);
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		// implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("http://127.0.0.1/login.do;jsessionid=3jo91krcmgb58");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
		d.findElement(By.xpath("//a[text()='Login']")).click();
		
		d.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		d.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		//d.findElement(By.xpath("//input[@name='name']")).sendKeys("IDFC Bank");
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("IDFC Bank"+no);
		
		d.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		
		d.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}
}