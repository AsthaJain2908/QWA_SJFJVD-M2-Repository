package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_InspectUsingRobotClass_ActionsContextClick_ForLoop {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
        d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.google.com/");
		
		// create Object for Actions Class & contextClick (right click option)
		Actions act = new Actions(d);
		act.contextClick().perform();
		
		// create Object for Robot Class
		Robot r = new Robot();
		
		for(int i = 0; i<10; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_ENTER);		
	}

}
