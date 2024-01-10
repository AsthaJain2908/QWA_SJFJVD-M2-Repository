package WebdriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchMethod {
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the Web Application
		driver.get("https://www.google.com/");
		
		//switch the control to active element
		driver.switchTo().activeElement().sendKeys("Poha", Keys.ENTER);
	}

}
