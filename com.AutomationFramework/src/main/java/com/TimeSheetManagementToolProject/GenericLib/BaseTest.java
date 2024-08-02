package com.TimeSheetManagementToolProject.GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Flib implements IAutoConstant {

	// Global Non Static Variable
	public WebDriver driver;
	
	// Global Static Variable Created to access with the name of Class name as reference
	public static WebDriver sdriver;
	
	// for creating Object as Global Variable 
	public Flib lib;
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException
	{
		lib = new Flib();
		String url = lib.getDataFromPropertyFile(PROPPATH, URLKEY);
		String browser = lib.getDataFromPropertyFile(PROPPATH, BROWSERKEY);
		
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
	}
}
