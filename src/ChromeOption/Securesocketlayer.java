package ChromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Securesocketlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	       ChromeOptions o= new ChromeOptions();
	       
	       o.setAcceptInsecureCerts(true);
	       o.addArguments("--headless=new");
		   
		   
		   WebDriver driver = new ChromeDriver (o); 
	       
	       driver.get("https://expired.badssl.com/");
	       
	        String title=driver.getTitle();
	        
	        
	        
	        if (title.equals("expired.badssl.com")) {
	        	System.out.println("site is secure");
	        }
	        
	        if (title.equals("Privacy error"))
	        {
	        	System.out.println("site is not secure");
	        }
	        
	      
	      
	       
	
	
	
	
	
	}

}
