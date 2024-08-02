package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InvalidLoginIntoActitime_Annotations extends BaseTest{

	// We can also extends BaseTest by doing enabled=false for valid login and creating new Before method  

	@Test // @BeforeMethod(enabled=false) for executing Invalid 
	public void invalidLogin( ) throws EncryptedDocumentException, IOException
	{
		Flib lib  = new Flib();
		
		int c = lib.getRowCount(ExcelPath, InvalidSheetName);
		System.out.println(c);
		
		for (int i = 1;i<=c;i++)
		{
			String username = lib.getDataFromExcelSheet(ExcelPath, InvalidSheetName, i, 0);
			String password = lib.getDataFromExcelSheet(ExcelPath, InvalidSheetName, i, 1);
			
			WebElement username1 = driver.findElement(By.name("username"));
			username1.sendKeys(username);
			WebElement password1 = driver.findElement(By.name("pwd"));
			password1.sendKeys(password);
		
			username1.clear();
			password1.clear();
		}
	}		
}
