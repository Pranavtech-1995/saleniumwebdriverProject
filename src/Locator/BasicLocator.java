package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Welecome to the automation of builder");
		
		WebDriver driver = new ChromeDriver();
		
		
		       driver.get("https://reports.crownit.in/");
		
	           driver.manage().window().maximize();
	           
	         //By linktext 
	   	    
	  	     /*WebElement link_text =driver.findElement(By.linkText("Login with Google"));
	  	   boolean display= link_text.isDisplayed();
	  	   System.out.println(display);
	  	   if(display==true) 
	  	   {
	  	   link_text.click();
	  	   }*/
	  	   
	  	    //By Partial TEXT 
		    
	   	    
	 	     WebElement Plink_text =driver.findElement(By.partialLinkText("Google"));
	 	      boolean displays= Plink_text.isEnabled();
	 	       System.out.println(displays);
	 	   if(displays==true) 
	 	   {
	 	   Plink_text.click();
	 	   }
	  	   
          //By tag 
	       
	       Thread.sleep(1000);
	    
	    List<WebElement> tag=driver.findElements(By.tagName("h2"));
	    System.out.println(tag.size());
	    String Login = tag.get(1).getText();
	    System.out.println(Login);
	  	     
	  	     
	 
	    
	      
	     //By name 
	   
	    WebElement email =driver.findElement(By.name("inemail"));
	    email.sendKeys("Pranav.Prakash@ipsos.com");
	    
	    //By name 
	    WebElement Password=driver.findElement(By.name("inpassword"));
	    Password.sendKeys("Test@123");
	    
	    // inner text
	    //WebElement Login =driver.findElement(By.xpath("//Button[text()='Login']"));
	    //Login.click();
	    
	    // only for group of element we have to use locator as  classname and tagname 
	    // By class 
	    driver.findElement(By.className("active")).click();
	    
	    
	       List <WebElement> UI=driver.findElements(By.className("form_group"));
	       System.out.println(UI.size()); 
	      
	     
	    
	    
	    driver.close();
	    driver.quit();
	    
	    
	   
		
	}

	}
