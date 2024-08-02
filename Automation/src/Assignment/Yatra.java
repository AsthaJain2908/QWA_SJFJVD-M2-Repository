package Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Yatra {
		public static void main(String[] args) throws InterruptedException, IOException {
	
			// Handle Notification Popup
			ChromeOptions opt = new ChromeOptions();

			opt.addArguments("--disable-notifications");

			WebDriver d = new ChromeDriver(opt);

			d.manage().window().maximize();

			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			d.get("https://www.yatra.com/");
			Thread.sleep(2000);

			//click on hotel
			d.findElement(By.id("booking_engine_hotels")).click();
			Thread.sleep(2000);
	
			// Select Desitination
			d.findElement(By.xpath("//input[@name='BE_hotel_destination']")).click();
			Thread.sleep(2000);
	
			//Enter Pune
			d.findElement(By.xpath("//div[@class='viewport']/descendant::li[5]")).click();
			Thread.sleep(2000);
	
			// Click on Checkin and enter Date
			d.findElement(By.xpath("//input[@name='hotel_checkin_date']")).click();
	
			d.findElement(By.id("25/01/2024")).click();
			Thread.sleep(2000);
	
			// Check Out Date
			d.findElement(By.id("29/01/2024")).click();
			Thread.sleep(2000);
	
			// Click on Traveller and Hotel
			d.findElement(By.xpath("//label[text()='Traveller and Hotel']")).click();
			Thread.sleep(2000);
	
			// Enter Details of Adults
			for (int i =0; i<=3; i++)
			{
				d.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
				Thread.sleep(2000);
			}
	
			//for Child also we can use for loop if we want more than one child 	
			d.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[2]")).click();
			//for (int i =0; i<=1; i++)
			//{
				//d.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
				//Thread.sleep(2000);
			//}
			// Age Dropdown
			WebElement dropdown = d.findElement(By.xpath("//select[@class='ageselect']"));
	
			Select s = new Select(dropdown);
			Thread.sleep(2000);
			s.selectByValue("4");
	
			// click on search hotel button
			Thread.sleep(2000);
			d.findElement(By.id("BE_hotel_htsearch_btn")).click();
			
			// Take Screenshot
			//WebElement w = d.findElement(By.xpath("ng-click=\"goToDetails(hotel, $index, 'Choose Room')"));
			
			//File src = w.getScreenshotAs(OutputType.FILE);
			
			//File dest = new File("./screenshot/ChooseRoom.png");
			
			//Files.copy(src, dest);	
	}
}