package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingWebElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		// switch to frame by using id or name attribute value
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		driver.switchTo().frame(frame1);
	
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456789");
		
	}

}
