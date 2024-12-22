package ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
	     WebDriver driver= new ChromeDriver();
	     
	     
	     driver.get("https://practice.expandtesting.com/shadowdom");
	     
	     SearchContext Shadow =driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
	     Thread.sleep(2000);
	     Shadow.findElement(By.cssSelector("#my-btn")).click();
	     
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     
	     driver.get("https://books-pwakit.appspot.com/");
	     
	     SearchContext shadow= driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	     
	     shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
	     
	     //shadow host - declare css for shadowdom
	     //shadow root- derive root through shadow host css and save it  
	     //shadow element -drive shadoelement through save shadow root that has been derived through shadow host .
	     
	     
	     
	     
	
	
	
	
	
	
	}

}
