package windowsTab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowTab_GetWindowID {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
		
		//it will give Window Id of Parent Tab
		String parent_Window_Id = driver.getWindowHandle();
		
		System.out.println("Parent Window Id is : "+parent_Window_Id);
		
		//it will give Window Id of Parent Tab as well as Child Window ID
		 Set<String> all_Id = driver.getWindowHandles();
				
		System.out.println("Parent and child Window Id is : "+all_Id);
	}
}
