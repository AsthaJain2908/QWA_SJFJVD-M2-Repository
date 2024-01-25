package windowsTab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleaNewTab_HandleaNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		// we can do t without Implicit Wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.selenium.dev/");
		
		// to launch a new Tab
		d.switchTo().newWindow(WindowType.TAB);
		
		// to launch a new Window
		d.switchTo().newWindow(WindowType.WINDOW);
	}

}
