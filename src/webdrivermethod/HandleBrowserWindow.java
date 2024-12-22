package webdrivermethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://reports.crownit.in/");
	 WebDriverWait  wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	 WebElement f1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Login with Google']")));
	 f1.click();
	
      Set<String>s1 =driver.getWindowHandles();
      System.out.println(s1);
      
      List<String>s2= new ArrayList<String>(s1);
      
      System.out.println(s2.toString());
     String Parentid=s2.get(1);
     String Childid=s2.get(0);
      
      driver.switchTo().window(Childid);
      System.out.println(driver.getTitle());
      
      //driver.close();
      driver.switchTo().window(Parentid);
      System.out.println(driver.getTitle());
      //driver.close();
      
      //Approach -2
      
      for(String i:s1) 
      {
    	   String title=driver.switchTo().window(i).getTitle();
    	  if (title.equals("Sign in - Google Accounts")) {
    	  driver.switchTo().window(i);
    	  driver.close();
    	  }
      }
          
          
      
          
	
	
	
	
	
	}

}
