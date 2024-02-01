package Assignment;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class IRCTC_FillDetailsandtakeScreenshot {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--diable-notifications");
		
		WebDriver d = new ChromeDriver(opt);
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.irctc.co.in/nget/train-search");
		
		// Click on From Station = Pune and CLick on Pune Junction
		d.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Pune");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
		
		//Click on To Station = Mumbai and click on Mumbai Central
		d.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()=' MUMBAI CENTRAL - MMCT ']")).click();
		
		// Click on Date and select 26 Jan 2024
		d.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
				
		d.findElement(By.xpath("//a[text()='26']")).click();
		
		// Click on Class and select Sleeper
		d.findElement(By.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();

		d.findElement(By.xpath("(//span[text()='Sleeper (SL)'])[1]")).click();
		
		//click on Quota and select Ladies
		d.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		
		d.findElement(By.xpath("//span[text()='LADIES']")).click();
		
		//click on search Button
		d.findElement(By.xpath("//button[text()='Search']")).click();
		
		Thread.sleep(2000);
		//Take Screenshot
		TakesScreenshot ts = (TakesScreenshot) d;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/searchtrain.png");
		
		Files.copy(src, dest);		
	}
}
