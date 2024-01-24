package WindowBasedPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUploadResumeinRegister_UsingAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.naukri.com/");
		
		d.findElement(By.id("register_Layer")).click();
		
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("Scoob");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("Scooby.com");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Scooby00");
		
		d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543201");
		
		d.findElement(By.xpath("//div[@data-val='fresher']")).click();
		
		d.findElement(By.xpath("//input[@id='currentCity']")).click();
		
		d.findElement(By.xpath("//span[text()='Pune']")).click();
		
		d.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/Resume.exe");

		d.findElement(By.xpath("//button[text()='Register now']")).click();
	}
}
