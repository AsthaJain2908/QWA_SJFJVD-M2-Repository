package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartForEachLoopDisplayeAllIponeNameWithPrice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		//d.findElement(By.xpath("//span[text()='✕']")).click();
		
		d.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone14",Keys.ENTER);
		
		// For Loop
		List<WebElement> allIphone = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> IphonePrice = d.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for (int i=0;i<allIphone.size();i++)
		{
			String iphone = allIphone.get(i).getText();
			for (int j=i;j<=i;j++)
			{
				String price = IphonePrice.get(j).getText();
				System.out.println(iphone +" : " + price);
			}	
		}
		
		// For Each loop
		//List<WebElement> allIphone = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		//for (WebElement name : allIphone) // for each Loop
		//{
			//String iphoneName = name.getText();
			//String IphonePrice = d.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			//System.out.println(iphoneName +" : " + IphonePrice);
		//}
	}
}
