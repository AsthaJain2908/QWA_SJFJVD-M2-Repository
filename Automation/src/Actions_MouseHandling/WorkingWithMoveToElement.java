package Actions_MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(fashion).perform();
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
