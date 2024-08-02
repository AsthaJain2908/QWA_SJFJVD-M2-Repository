package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PracticeAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Connecting to the Server", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Connecting to the Server");
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("Close the Browser");
	}

}
