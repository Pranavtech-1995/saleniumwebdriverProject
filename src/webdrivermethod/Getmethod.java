package webdrivermethod;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		//get browser//open the url on the browser
		
		driver.get("https://reports.crownit.in/");
		
		//get current url //return url of the pages 
		
		System.out.println(driver.getCurrentUrl());
		
		//get Title //return title of the page
		
		System.out.println("Title is : "+driver.getTitle());
		
		//windowhandles_id //return id of the single browser window 
		
		System.out.println(driver.getWindowHandle());
		
		//get page source  //return source of the page
		
		System.out.println(driver.getPageSource());
		
	
		driver.findElement(By.xpath("//*[text()='Login with Google']")).click();
	
         Set<String> window_ids=driver.getWindowHandles();
         System.out.println(window_ids);
		  
		  
		
		
		
		
		
		
		driver.close();
		
	
		
		
	}

}
