package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		    WebElement desktop=driver.findElement(By.xpath("//*[text()='Point Me']"));
		     WebElement Laptop=driver.findElement(By.xpath("//*[text()='Mobiles']"));
		     WebElement Software=driver.findElement(By.xpath("//*[text()='Laptops']"));
		      
		     
		     
		     //Mouse Hover
		     Actions a= new Actions(driver);
		     Thread.sleep(5000);
		     a.moveToElement(desktop).moveToElement(Laptop).moveToElement(Software).click().perform();
		    // a.moveToElement(desktop).moveToElement(Laptop).build().perform();
		    
		   //Double.click
		     
		     WebElement CopyText = driver.findElement(By.xpath("//*[text()='Copy Text']"));
		     WebElement field2=driver.findElement(By.id("field2"));
		     String s ="Hello World!";
		     
		      a.doubleClick(CopyText).perform();
		      if (s.equals("Hello World!") )
		      {
		    	  System.out.println("Text copied");
		      }
		      else 
		      {
		    	  System.out.println("failed to copy");
		      }
		      
		      System.out.println(field2.getAttribute("value"));
		      
		      //Drag&Drop
		    WebElement  source=driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		    WebElement  target=driver.findElement(By.xpath("//*[text()='Drop here']"));
		    
		    a.dragAndDrop(source, target).perform();
		    
		    System.out.println("Again back to main source");
		    a.dragAndDrop(target,source).build().perform();
		    
		    //Right click//contextclick
		    Thread.sleep(5000);
		    a.contextClick(target).perform();
		     
	
	        driver.quit();
	
	}

}
