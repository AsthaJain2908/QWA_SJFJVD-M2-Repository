package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mock_Zomato_ScrollandClick {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.zomato.com/india");

		WebElement scrollTill = d.findElement(By.xpath("//img[@class='sc-elhb8j-1 ixsoFB']"));
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		js.executeScript("arguments[0].scrollIntoView(true)",scrollTill);
		
		d.findElement(By.xpath("//p[text()='Who We Are']")).click();
	}

}
