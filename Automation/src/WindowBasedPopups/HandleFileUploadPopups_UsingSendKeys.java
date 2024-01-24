package WindowBasedPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopups_UsingSendKeys {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://demoapps.qspiders.com/fileUpload?sublist=0");

		// to click on popup Dropdown
		d.findElement(By.xpath("//section[text()='Popups']")).click();
		
		d.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		d.findElement(By.id("fileInput")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\DependantIndependent.pdf");
		
	}

}
