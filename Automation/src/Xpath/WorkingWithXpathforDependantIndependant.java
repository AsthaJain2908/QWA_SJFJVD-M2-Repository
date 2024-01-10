package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathforDependantIndependant {
	
	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//span[text()='✕']")).click();
			
			driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone 14", Keys.ENTER); // IPhone14
			
			WebElement IphonePrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹57,999']"));
					
			System.out.println(IphonePrice.getText());		
	}

}
