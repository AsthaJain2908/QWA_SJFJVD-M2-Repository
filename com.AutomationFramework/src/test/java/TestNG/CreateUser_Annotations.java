package TestNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateUser_Annotations extends BaseTest{

	@Test
	public void createUser()
	{
		Random r = new Random(10);
		int n = r.nextInt();
		driver.findElement(By.xpath("//a[@class='content users']")).click();	
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("TE");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kings"+n);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Walley");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}	
}
