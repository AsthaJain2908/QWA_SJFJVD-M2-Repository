package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ShoppersStackScenario {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		d.get("https://www.shoppersstack.com/");
		//Click on Login Button
		d.findElement(By.id("loginBtn")).click();
		//Enter Email Id and Password and click on Login Button
		d.findElement(By.xpath("//input[@name='Email']")).sendKeys("astha.jain9381@gmail.com");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("Manager@123");
		d.findElement(By.xpath("//span[text()='Login']")).click();
		
		Actions act = new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//a[@id='men']"))).perform();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@name='cart']")).click();
		
		d.findElement(By.xpath("//button[text()='Remove from cart']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Yes']")).click();
		
		// Take ScreenShot of Your Cart is Empty = Explicit Typecasting
		TakesScreenshot ts = (TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/YourCartisEmpty.png");
		Files.copy(src, dest);
		
		// Print = get Text Your cart is empty!
		WebElement text = d.findElement(By.xpath("//h2[text()='Your cart is empty!']"));
		System.out.println(text.getText());
		
		d.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//li[text()='Logout']")).click();	
		Thread.sleep(2000);
		d.quit();
	}
}
