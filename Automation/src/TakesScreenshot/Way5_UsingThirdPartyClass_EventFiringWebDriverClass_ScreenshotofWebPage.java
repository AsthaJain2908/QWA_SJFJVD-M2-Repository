package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way5_UsingThirdPartyClass_EventFiringWebDriverClass_ScreenshotofWebPage {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/Google.png");
		
		Files.copy(src, dest);
	}
}
