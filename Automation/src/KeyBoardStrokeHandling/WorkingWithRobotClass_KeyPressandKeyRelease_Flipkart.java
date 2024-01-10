package KeyBoardStrokeHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRobotClass_KeyPressandKeyRelease_Flipkart {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://www.flipkart.com/");
		
		//Create an Object for Robot Class
		Robot r = new Robot();
		
		// Pressing the keys Ctrl+shift+i
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		
		//releasing the keys Ctrl+shift+i
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);
		
	}

}
