package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://demowebshop.tricentis.com/");
		
		//to click on the link
		obj.findElement(By.partialLinkText("Reg")).click();

	}

}
