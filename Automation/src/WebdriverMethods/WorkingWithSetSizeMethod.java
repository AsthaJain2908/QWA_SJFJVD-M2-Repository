package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetSizeMethod {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(100, 200);
		driver.manage().window().setSize(d);
		
		// OR driver.manage().window().setSize(new Dimension(100, 200)); Create Object inside method
	}

}
