package com.selenium;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTime {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Browser Name");
		Integer browser = sc.nextInt();
		
		if (browser.equals(1))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals(2))
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equals(3))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Invalid Browser");;
		}
		
	}

}
