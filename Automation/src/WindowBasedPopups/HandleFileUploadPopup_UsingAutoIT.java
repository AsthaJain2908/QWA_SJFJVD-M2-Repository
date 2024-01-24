package WindowBasedPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup_UsingAutoIT {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	d.get("https://demoapps.qspiders.com/fileUpload?sublist=0");

	// to click on popup Dropdown, Click on File Uploads
	d.findElement(By.xpath("//section[text()='Popups']")).click();
	
	d.findElement(By.xpath("//section[text()='File Uploads']")).click();
	
	// to click on Custom Button
	d.findElement(By.xpath("//a[text()='Custom Button']")).click();
	
	Thread.sleep(2000);
	
	d.findElement(By.xpath("//div[text()='Upload File']")).click();
	 
	Runtime.getRuntime().exec("./AutoIT/FileUpload.exe");
	}

}
