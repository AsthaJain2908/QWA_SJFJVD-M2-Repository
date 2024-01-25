package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_ClickonLinkedinfbtwitteryoutube_WindowTabsHandle {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Click on Linkedin, facebook, Twitter, Youtube
		
		d.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		
		d.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		
		d.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
				
		d.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		
		Set<String> all_Id = d.getWindowHandles();
		
		for(String id:all_Id)
		{
			d.switchTo().window(id);
			// We can use getTitle() and getCurrentUrl()
			if (d.getTitle().equals("OrangeHRM | LinkedIn"))
			//if (d.getCurrentUrl().equals("https://www.linkedin.com/company/orangehrm?original_referer=https%3A%2F%2Fopensource-demo.orangehrmlive.com%2F"))
			{
				System.out.println(d.getTitle());
				break;
			}
			else
			{
				d.close();	
			}
		}
	}
}
