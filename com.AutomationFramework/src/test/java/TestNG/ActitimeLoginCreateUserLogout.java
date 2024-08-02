package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActitimeLoginCreateUserLogout {
	
WebDriver driver;
	
	@Test(priority = 1)
	public void login( )
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=d2nlquebtdqj"); // Actitime
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
	
	@Test (priority = 2)
	public void createUser()
	{
		driver.findElement(By.xpath("//a[@class='content users']")).click();	
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Soft");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ware");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}
	
	@Test (dependsOnMethods = "login", priority = 3)
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();	
	}
}
