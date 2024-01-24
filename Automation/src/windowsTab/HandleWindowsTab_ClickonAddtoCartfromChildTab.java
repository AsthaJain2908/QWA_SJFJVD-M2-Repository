package windowsTab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsTab_ClickonAddtoCartfromChildTab {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
		
		//it will give Window Id of Parent Tab as well as Child Window ID
		 Set<String> all_Id = driver.getWindowHandles();
		 //for each loop
		 for (String id:all_Id)
		 {
		    driver.switchTo().window(id);
			if (driver.getTitle().equals("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
			  break;
			}
		 }
		 // to click on Add to Cart Button
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 Thread.sleep(2000);
		 // click on Remove from cart
		 driver.findElement(By.xpath("//div[text()='Remove']")).click();
		 driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	}
}
