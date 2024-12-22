package BrokenLinks;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	        WebDriver driver =new ChromeDriver();
	        
	        
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	         List <WebElement>mylist=driver.findElements(By.xpath("//a"));
	         System.out.println(mylist.size());
	         
	         int brokenlinkcount =0;
	         for ( WebElement x:mylist)
	         {
	        	
	        	
	        	
	        	try {
	        		
	        	String link =x.getAttribute("href");
	        	if (link==null||link.isEmpty())
	        	{
	        		System.out.println("Not possible to check");
	        	}
	        	
	        	URL url =new URL (link);
	        	   HttpsURLConnection  conn =(HttpsURLConnection) url.openConnection();
	        	   conn.connect();
	        	   
	        	   if (conn.getResponseCode()>=400)
	        	   {
	        		   
	        		   System.out.println("Link is broken");
	        		   brokenlinkcount++;
	        	   }
	        	   
	        	   else
	        	   {
	        		   
	        		   System.out.println("Link is ok");
	        	   }
	        	   
	         
	        	}
	        	
	        	catch(Exception e)
	        	{
	        		System.out.println(e.getMessage());
	        		
	        	}
	        	}
	         
	         System.out.println("No of broken is "+brokenlinkcount);
	         System.out.println("No of ok link is"+ (mylist.size()-brokenlinkcount));
	         
	         }
	        
	
	}


