package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.sel	enium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1_ExplicitTypecasting_ScreenshotofWebPage {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.apple.com/iphone/");
		
		//Explicit Typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//to use getScreenshot ()
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Create a new file and store it in one Folder
		File dest = new File("./screenshot/iphone.png");
		
		// copy from src to dest
		Files.copy(src, dest);
	}
}
