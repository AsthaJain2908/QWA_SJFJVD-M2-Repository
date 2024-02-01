package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
l
public class HandlingFrameUsingIntIndex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		// switch to frame by using int index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456789");
	}
}