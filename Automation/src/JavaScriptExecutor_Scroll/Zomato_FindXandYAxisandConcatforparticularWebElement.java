package JavaScriptExecutor_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_FindXandYAxisandConcatforparticularWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scrolling Till Particular Web Element with getRect Method
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		WebElement zomato = d.findElement(By.xpath("//label[text()='Email']"));
		
		Rectangle rect = zomato.getRect();
		
		int x = rect.getX();
		
		int y = rect.getY();
		
		//System.out.println("X Axis: "+x);
		//System.out.println("Y Axis: " + y);
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
