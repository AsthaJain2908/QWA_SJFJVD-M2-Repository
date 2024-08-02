package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// Call the Non Static Method of Launching the Browser / creating Object for BaseTest Class for calling NSM
			BaseTest test = new BaseTest();
				
			test.setup();
				
			// for Entering Username and Password
			Flib lib = new Flib();
			String username1 = lib.getDataFromProperty(PropPath, "Username1");
			String password1 = lib.getDataFromProperty(PropPath, "Password1");
				
			// Calling Non Static Varibale with the help of Object reference variable for entering Username, Password and Click on Login Button
			test.driver.findElement(By.name("username")).sendKeys(username1);
			
			test.driver.findElement(By.name("pwd")).sendKeys(password1);
			test.driver.findElement(By.id("loginButton")).click();
				
			Thread.sleep(2000);
			test.tearDown();
	}
}
