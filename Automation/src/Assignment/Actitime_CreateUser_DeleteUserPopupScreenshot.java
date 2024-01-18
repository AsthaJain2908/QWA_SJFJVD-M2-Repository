package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Actitime_CreateUser_DeleteUserPopupScreenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver d =  new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("http://127.0.0.1/login.do;jsessionid=25k3ishngn0q5");
		
		//d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("TE");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("TE");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("TE");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Alpha");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bet");
		Thread.sleep(2000);
		
		// to remove space we can also use contains by attribute xpath
		d.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Thread.sleep(2000); 
		
		d.findElement(By.xpath("//a[text()='bet, Alpha (TE)']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Thread.sleep(2000);
		
		// For taking screenshot we have to handle the popup so this is for understanding = getting UnhandledAlertException
		TakesScreenshot ts = (TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/DeleteUserPopup.png");
		Files.copy(src, des);
		
	}

}
