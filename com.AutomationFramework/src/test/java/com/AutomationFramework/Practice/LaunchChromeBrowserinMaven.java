package com.AutomationFramework.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowserinMaven {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.close();
		
	}

}
