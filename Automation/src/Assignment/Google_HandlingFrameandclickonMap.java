package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_HandlingFrameandclickonMap {
	
	public static void main(String[] args) {
		
		WebDriver g = new ChromeDriver();
		
		g.manage().window().maximize();
		
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		g.get("https://www.google.co.in/");
	
		g.findElement(By.xpath("//a[@class='gb_d']")).click();
		
		g.switchTo().frame("app");
			
		g.findElement(By.xpath("//span[text()='Maps']")).click();
		
	}

}
