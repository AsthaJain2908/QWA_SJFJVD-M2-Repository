package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginandCreateCustomerLogout {
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r = new Random ();
		
		int no = r.nextInt(2000);
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("http://127.0.0.1/login.do;jsessionid=3jo91krcmgb58");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@class='ccontent tasks']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("IDFC Bank"+no);
		
		d.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

}
