package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoGetTitleandURL {

		public static void main(String[] args) {
			
			// to launch the browser
			WebDriver d = new ChromeDriver();
			
			// to maximize the browser
			d.manage().window().maximize();
			
			// to launch the Web Application
			d.get("https://www.zomato.com/");
			
			// to fetch the title
			String title = d.getTitle();
			System.out.println("The title of Current Web Page of Zomato :"+title);
			
			String url = d.getCurrentUrl();
			System.out.println("The Current Url of Zomato :"+url);
			
			d.close();		
		}

	}