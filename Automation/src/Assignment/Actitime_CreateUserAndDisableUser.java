package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitime_CreateUserAndDisableUser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("http://127.0.0.1/login.do");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		d.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[contains(@class, 'content users')]")).click();
		
		d.findElement(By.xpath("//input[@value='Create New User']")).click();
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("T");
		 
		d.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("1");
		
		d.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("1");
		
		// Dropdown select as Access=Disabled
		
		WebElement obj = d.findElement(By.xpath("//select[@name='active']"));
		
		Select s = new Select(obj);
		s.selectByVisibleText("disabled");
		
		d.findElement(By.name("firstName")).sendKeys("Doremo");
		
		d.findElement(By.name("lastName")).sendKeys("Dor");
		
		d.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		
		d.findElement(By.xpath("//input[@id='overtimeTrackingLevel_ReadOnly']")).click();
		
		d.findElement(By.xpath("//input[@id='releaseDateId']")).sendKeys("Jan 09, 2025");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='   Create User   ']")).click();		
		
		// Print Text of Username
		WebElement username = d.findElement(By.xpath("//a[text()='Dor, Doremo (T)']"));
		
		String text = username.getText();
		
		System.out.println(text);
	}

}
