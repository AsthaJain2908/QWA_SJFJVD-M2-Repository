package JavaScriptExecutor_Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithExecuteScriptMethod_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(-500,0)"); for 1 time Scroll Left
		
		//for 2 time Scroll Left
		for (int i = 0; i<=2; i++)
		{
			js.executeScript("window.scrollBy(-500,0)");
			Thread.sleep(2000);
		}

	}

}
