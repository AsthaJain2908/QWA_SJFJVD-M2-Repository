package Actions_MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WorkingWithClickAndHold_ReleaseMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		// Identify the circle and ClickAndHold Method
		WebElement circle = d.findElement(By.id("circle"));
		
		//Create Object for Actions Class
		Actions act = new Actions(d);
				
		// ClickAndHold Method
		act.clickAndHold(circle).perform();
		
		Thread.sleep(2000);
		// Release Method
		act.release().perform();
	}

}
