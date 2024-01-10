package com.selenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {

	static WebDriver driver;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name");
		
		String browser = sc.next();
		
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
		else 
		{
			System.out.println("Invalid Browser");
		}
	}
}
