package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
	
		
		
		List <WebElement> mylist=driver.findElements(By.xpath("//div//ul//li//a"));
		System.out.println(mylist.size());
		
		
	     
		int CountBrokenlink = 0;
		
		
		for (int i =0;i<=mylist.size()-1;i++)
			
		{
			 try{
				 String link=mylist.get(i).getAttribute("href");
				 
				 
				 if (link.isEmpty()|| link==null) 
				 {
					System.out.println("Not possible to check");
					continue;
				 }
			 
			 URL url= new URL (link);
			  HttpURLConnection con= (HttpURLConnection) url.openConnection();
			 con.connect();
			 
			 if (con.getResponseCode()>=400)
			 {
				 System.out.println("Broken link");
				 CountBrokenlink++;
			 }
			 else
			 {
				 System.out.println("Not a broken link");
			 }
			 }
			 
			 catch(Exception e)
			 {
				 
			 }
			 
		}
		
	        System.out.println(CountBrokenlink);
	        System.out.println(mylist.size()-CountBrokenlink);
	}}


