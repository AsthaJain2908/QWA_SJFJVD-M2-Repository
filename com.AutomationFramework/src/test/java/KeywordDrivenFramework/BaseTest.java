package KeywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	
	// Runtime Polymorphism
	
	WebDriver driver; // Global Variable
	
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
	
	// Method to Close the Browser
	public void tearDown()
	{
		driver.quit();
	}
	
}
