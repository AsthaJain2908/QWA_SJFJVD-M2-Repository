package JavaScriptExecutor_Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithExecuteScriptMethod_ScrollRight {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(500,0)"); for 1 time Scroll Right
		
		//for 2 times Scroll Right
		for (int i=0; i<=2; i++)
		{
			js.executeScript("window.scrollBy(500,0)");
			Thread.sleep(2000);
		}	
	}
}
