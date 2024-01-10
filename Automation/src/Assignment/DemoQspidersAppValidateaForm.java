package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspidersAppValidateaForm {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://demoapps.qspiders.com/formValidation?sublist=0");
		
		obj.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Hello");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='minLength']")).sendKeys("Diwali");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='password']")).sendKeys("Pune@123");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Pune@123");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("allow");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='email']")).sendKeys("Pune@gmail.com");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("Testing");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='minValue']")).sendKeys("145632");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("1");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='url']")).sendKeys("https://www.demoPune.com");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("77");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='digits']")).sendKeys("1234");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='number']")).sendKeys("5");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("Pune123");
		Thread.sleep(2000);
		
		WebElement submitbutton = obj.findElement(By.xpath("//button[text()='Submit']"));
		
		submitbutton.submit();
		
	}

}
