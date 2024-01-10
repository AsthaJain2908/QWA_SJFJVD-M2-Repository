package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectByValue {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		
		//Identify Dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		//Create Object for select class
		Select s = new Select(dropdown);
		
		// Use SelectByValue Method
		s.selectByValue("India");
		s.selectByValue("United States Of America");
		Thread.sleep(3000);
		
		// Use DeselectByValue Method
		s.deselectByValue("India");
		s.deselectByValue("United States Of America");		
	}

}
