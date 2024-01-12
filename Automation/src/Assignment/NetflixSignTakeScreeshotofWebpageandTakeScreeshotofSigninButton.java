package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetflixSignTakeScreeshotofWebpageandTakeScreeshotofSigninButton {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://www.netflix.com/in/");
		
		d.findElement(By.id("signIn")).click();
		
		d.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("astha.jain2908@gmail.com");
		
		d.findElement(By.xpath("//input[@id='id_password']")).sendKeys("astha123");
		
		// Take Screenshot of Signin Button
		WebElement signinButton = d.findElement(By.xpath("//button[text()='Sign In']"));
		
		File s = signinButton.getScreenshotAs(OutputType.FILE);
		
		File ds = new File("./screenshot/SigninButton.png");
		
		Files.copy(s, ds);
		
		// Click on Signin Button
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		// Screenshot of Signin WebPage
		TakesScreenshot t = (TakesScreenshot) d;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/SigninPage.png");
		
		Files.copy(src, dest);
	}
}
