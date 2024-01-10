package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone14",Keys.ENTER);
		
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(WebElement iphone:allIphone)
		{
			System.out.println(iphone.getText());
		}
	}

}
