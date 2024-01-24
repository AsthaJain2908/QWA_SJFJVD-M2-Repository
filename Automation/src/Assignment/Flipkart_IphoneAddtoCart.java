package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_IphoneAddtoCart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		
		d.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();		
		
		//d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		Thread.sleep(2000);
		// First Handle because it will handle in new tab
		//d.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}
}
