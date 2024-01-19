package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(opt);
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.yatra.com/");
		
	}

}
