package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Paytm_ScrollFlightClickandBook_ViewFairTakeScreesnshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://paytm.com/");
		
		Thread.sleep(2000);
		
		// Scroll Till Flight Tickets & Click on Flight Tickets
		WebElement scrollTill = d.findElement(By.xpath("(//div[@class='_2EGQY'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		js.executeScript("arguments[0].scrollIntoView(false)", scrollTill);
		
		scrollTill.click();
		
		//Enter From 
		d.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("text-box")).sendKeys("Pune");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Pune Airport']")).click();
		
		//Enter To Destination 
		d.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("text-box")).sendKeys("Goa");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Goa Mopa, Goa, India']")).click();
		Thread.sleep(2000);
		
		// departure Date 24
		d.findElement(By.xpath("//span[text()='Departure Date']")).click();
		d.findElement(By.xpath("(//div[text()='24'])[1]")).click();
		
		// Enter Traveller Details = 3
		d.findElement(By.id("travellerClass")).click();
		
		for(int i=0;i<2;i++)
		{
			d.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
			Thread.sleep(2000);
		}
		// Click on Search Flight
		d.findElement(By.id("flightSearch")).click();
						
		// Print List of all the flights using FindElements
		 List<WebElement> allFlights = d.findElements(By.xpath("//div[@class='_5Cbbf']"));
		 
		 for(WebElement FlightsList:allFlights)
		 {
			 System.out.println(FlightsList.getText());
			 System.out.println("--------------------------------------");
		 }
		 
		 Thread.sleep(2000);
		//Take Screenshot of one Flight using Explicit Typcasting after Clicking on View Fair and scrolling 
		 d.findElement(By.xpath("(//span[text()='View Fare'])[1]")).click();
			 
		 js.executeScript("window.scrollBy(0,500)");		
		 
		 TakesScreenshot ts = (TakesScreenshot)d;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File des = new File("./screenshot/flight.png");
		 Files.copy(src, des);	 
	}

}
