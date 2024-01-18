package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws IOException {
	
		WebDriver d = new ChromeDriver();
	
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		d.get("https://www.bluestone.com/");
		
		d.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		WebElement coins = d.findElement(By.xpath("//a[@title='Coins']"));
		 
		Actions a = new Actions(d);
		 
		a.moveToElement(coins).perform();
		 
		//d.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		a.doubleClick(d.findElement(By.xpath("//span[text()='Coins by Design']"))).perform();	
		
		// Take Screenshot of Coin by design Page
		TakesScreenshot ts = (TakesScreenshot) d;
		
		File s = ts.getScreenshotAs(OutputType.FILE);	
		 
		File des = new File("./screenshot/coinsbydesign.png");
		 
		Files.copy(s, des);
	}	
}
