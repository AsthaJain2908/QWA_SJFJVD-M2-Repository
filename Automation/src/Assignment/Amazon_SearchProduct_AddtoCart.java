package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchProduct_AddtoCart {
	
    public static void main(String[] args) {
		
    	WebDriver d = new ChromeDriver();
    	
    	d.manage().window().maximize();
    	
    	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	d.get("https://www.amazon.in/");
    	
    	d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys",Keys.ENTER);
    	
    	d.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
    	
    	Set<String> all_id = d.getWindowHandles();
    	
    	for (String id:all_id)
    	{
    		d.switchTo().window(id);
    		if (d.getCurrentUrl().equals("https://www.amazon.in/Galactic-Wonders-6-Feet-Numbers-Astronauts/dp/B0CG24PL7P/ref=sr_1_1_sspa?crid=35XL32YJ0PZKH&keywords=toys&qid=1706174961&sprefix=toys%2Caps%2C226&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"))
    		{
    			break;   	
    		}
    	}
    	// Scroll till Add to Cart
     	JavascriptExecutor js = (JavascriptExecutor) d;
    	js.executeScript("window.scrollBy(0,500)");
    	d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
	}
}
