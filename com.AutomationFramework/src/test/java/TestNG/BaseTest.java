package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant{
	
	// Runtime Polymorphism
	
	static WebDriver driver; // Global Variable
	
	@BeforeClass
	public void setup() throws IOException
	{
		// Creating Object of Flib class to access Non Static Method (getDataFromProperty) of Flib Class 
		Flib lib = new Flib();
		String browser = lib.getDataFromProperty(PropPath, "Browser");
		String url = lib.getDataFromProperty(PropPath, "Url");
		
		if (browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		// Maximize a Browser
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeSeconds));
		
		// Launching Web Application
		driver.get(url);
	}
	@BeforeMethod(enabled=false) // @BeforeMethod(enabled=false) for executing Invalid 
	public void login( ) throws EncryptedDocumentException, IOException
	{
		Flib fb  = new Flib();
		String username = fb.getDataFromExcelSheet(ExcelPath, SheetName, 1, 0);
		String password = fb.getDataFromExcelSheet(ExcelPath, SheetName, 1, 1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
	}
	
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();	
	}
	
	@AfterClass
	// Method to Close the Browser
	public void tearDown()
	{
		driver.quit();
	}
}
