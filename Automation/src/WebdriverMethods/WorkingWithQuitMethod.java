package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuitMethod {
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the Web Application
		driver.get("http://omayo.blogspot.com/");
		
		// to click on new Popup window
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		// to quit the parent and child window
		driver.quit();
	}
}
