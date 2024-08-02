package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Call the Non Static Method of Launching the Browser / creating Object for BaseTest Class for calling NSM
		BaseTest test = new BaseTest();
		test.setup();
		
		// for Entering Username and Password
		Flib lib = new Flib();
		String username = lib.getDataFromProperty(PropPath, "Username");
		String password = lib.getDataFromProperty(PropPath, "Password");
		
		// Calling Non Static Varibale with the help of Object reference variable for entering Username, Password and Click on Login Button
		test.driver.findElement(By.name("username")).sendKeys(username);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		test.driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		test.tearDown();
	}

}
