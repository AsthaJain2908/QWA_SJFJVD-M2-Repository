package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11_EnterMobileNumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.dream11.com/");
		
		Thread.sleep(2000);
		
		// not working because there are 2 frames
		d.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456789");
	}
}
