package KeyBoardStrokeHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRobotClass_OrangeHrm {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		// Create an Object for Robot class press Keys and release keys
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL); //press ctrl
		r.keyPress(KeyEvent.VK_A);       // press A = ctrl+A
		r.keyRelease(KeyEvent.VK_CONTROL); // release ctrl
		r.keyRelease(KeyEvent.VK_A); // release A = ctrl+A
		
		r.keyPress(KeyEvent.VK_CONTROL); //press ctrl
		r.keyPress(KeyEvent.VK_C);		 // press C = ctrl+C
		r.keyRelease(KeyEvent.VK_CONTROL); // release ctrl
		r.keyRelease(KeyEvent.VK_C); // release C = ctrl+A
		
		r.keyPress(KeyEvent.VK_TAB); //press Tab
		r.keyRelease(KeyEvent.VK_TAB); // release Tab
		
		r.keyPress(KeyEvent.VK_CONTROL); //press ctrl
		r.keyPress(KeyEvent.VK_V);       // press V = ctrl+V
		r.keyRelease(KeyEvent.VK_CONTROL); // release = ctrl
		r.keyRelease(KeyEvent.VK_V);    // release V = ctrl+V		 
	}
}
