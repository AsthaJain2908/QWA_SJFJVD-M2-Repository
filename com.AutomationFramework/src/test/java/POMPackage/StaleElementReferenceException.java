package POMPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do");
		
		// identify the username text field
		LoginPage page = new LoginPage(driver);
		WebElement username = page.getUsernameTextfield();
		Thread.sleep(3000);
		
		// refresh the webpage
		driver.navigate().refresh();
		
		// pass the value inside username text field
		username.sendKeys("admin");

	}

}
