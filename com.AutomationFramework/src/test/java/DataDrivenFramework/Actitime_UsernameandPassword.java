package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_UsernameandPassword {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("http://127.0.0.1/login.do;jsessionid=12aasb0iof929");
		
		Flib c = new Flib();
		int row_count = c.getRowCount("./src/test/resources/TestData.xlsx", "Invalid");
		System.out.println(row_count);
		
		for(int i =1; i<=row_count;i++)
		{
			String username = c.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Invalid", i, 0);
			String password = c.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Invalid", i, 1);
			
			WebElement username1 = d.findElement(By.name("username"));
			username1.sendKeys(username);
			
			WebElement password1 = d.findElement(By.name("pwd"));
			password1.sendKeys(password);
			
			username1.clear();
			password1.clear();
		}
	}
}
