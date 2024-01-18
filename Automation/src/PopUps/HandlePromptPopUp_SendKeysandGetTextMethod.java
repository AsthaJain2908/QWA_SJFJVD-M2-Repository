package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePromptPopUp_SendKeysandGetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		driver.findElement(By.id("buttonAlert1")).click();
		
		// Handle Prompt using sendkeys() & to Print Popup getText()
		Alert alt = driver.switchTo().alert();	
			
		Thread.sleep(2000);
		// Pass value inside the textfield inside prompt popup
		alt.sendKeys("yes");
		Thread.sleep(2000);
		
		// to print the text of the Popup
		System.out.println(alt.getText());
		
		// click on Ok
		alt.accept();
	}
}
