package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_FetchUsernameandPassword {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Fetch Username & Password from Fdfe class
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("http://127.0.0.1/login.do;jsessionid=12aasb0iof929");
		
		Flib f = new Flib();
		String username = f.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Valid", 1, 0);
		//System.out.println(username);
		
		String password = f.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Valid", 1, 1);
		//System.out.println(password);
		
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("pwd")).sendKeys(password);
		d.findElement(By.id("loginButton")).click();		
	}
}
