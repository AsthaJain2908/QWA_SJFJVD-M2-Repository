package KeyBoardStrokeHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeysEnum_Orangehrm {
	
	public static void main(String[] args) {
		
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin", Keys.TAB, "admin123" ,Keys.TAB, Keys.ENTER);		
	}
}
