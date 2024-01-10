package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrokingWithSetPositionMethod {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		// OR d.manage().window().setPosition(new Point(400, 200));  Create Object inside method
		
		Point p  = new Point(400, 200);
		d.manage().window().setPosition(p);
	}

}
