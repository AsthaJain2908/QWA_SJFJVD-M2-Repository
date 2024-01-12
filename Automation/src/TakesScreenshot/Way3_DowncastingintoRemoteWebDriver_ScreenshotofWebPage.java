package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3_DowncastingintoRemoteWebDriver_ScreenshotofWebPage {

		public static void main(String[] args) throws IOException {
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			driver.get("https://www.bluestone.com/");
			
			driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
			
			 WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
			 
			 Actions a = new Actions(driver);
			 
			 a.moveToElement(coins).perform();
			 
			 driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
			
			 RemoteWebDriver rwd = (RemoteWebDriver) driver;
			
			 //to use getScreenshot ()
			 File src = rwd.getScreenshotAs(OutputType.FILE);
			
			 //Create a new file and store it in one Folder
			 File dest = new File("./screenshot/coinbydesign.png");
			
			 // copy from src to dest
			 Files.copy(src, dest);
	}
}
