package JavaScriptExecutor_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisabledWebElementusingJavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);	
		
		js.executeScript("document.getElementById('name').value='Doremon'");
		
		js.executeScript("document.getElementById('email').value='Doremon@gmail.com'");
		
		js.executeScript("document.getElementsByName('password').value='Dore123'");
		
		// to click on Register Button when it is disabled
		WebElement disabledRegbutton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		js.executeScript("arguments[0].click()", disabledRegbutton);
		
	}

}
