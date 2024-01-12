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

import com.google.common.io.Files;

public class ScreenshotofParticularWebElement {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		 
		Actions a = new Actions(driver);
		 
		a.moveToElement(coins).perform();
		 
		//d.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		a.doubleClick(driver.findElement(By.xpath("//span[text()='Coins by Design']"))).perform();
		
		WebElement gold = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		
		File src = gold.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/coinsbydesign50gmcoin.png");
		
		Files.copy(src, dest);
	}
}
