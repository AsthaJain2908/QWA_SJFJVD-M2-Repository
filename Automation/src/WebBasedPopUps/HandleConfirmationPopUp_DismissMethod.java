package WebBasedPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopUp_DismissMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		driver.findElement(By.id("buttonAlert5")).click();
		
		// Handle Confirmation popup using dismiss()
		Alert alt = driver.switchTo().alert();	
		//alt.accept(); if we want to click on OK		
		Thread.sleep(2000);
		// Click on Cancel
		alt.dismiss();

	}

}
