package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsQspidersFeedbook {
	
	public static void main(String[] args) throws InterruptedException {
		
		// to launch the browser
		WebDriver d = new ChromeDriver();
		
		// to maximize the browser
		d.manage().window().maximize();
		
		// to launch Web Application
		d.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		
		// to click on the Buttons in LHN
		d.findElement(By.className("poppins"));
		
		
		
	}

}
