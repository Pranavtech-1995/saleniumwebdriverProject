package JavaScriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement textField1 = driver.findElement(By.id("name"));
        WebElement textField2 = driver.findElement(By.id("email"));
        WebElement search=driver.findElement(By.xpath("//*[@class='wikipedia-search-button']"));
        
        JavascriptExecutor js =(JavascriptExecutor) driver;
        
        //Alternate of send action
        
        js.executeScript("arguments[0].setAttribute('value','john')", textField1);
        js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')",textField2);
        
        //Alternate of click action
       js.executeScript("arguments[0].click()",search );
       
      // driver.switchTo().newWindow(WindowType.TAB);
       //driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
       Thread.sleep(5000);
       
       //scroll down up to certain length
       js.executeScript("window.scrollBy(0,300)", "");
       System.out.println(js.executeScript("return window.pageYOffset;" ));
       
       //scroll down up to certain position//adding from last position
       js.executeScript("window.scrollBy(0,700)", "");
       System.out.println(js.executeScript("return window.pageYOffset;"));
       
       //scroll up to certain element 
        WebElement  last =driver.findElement(By.xpath("//*[text()='Blogger']"));
       js.executeScript("arguments[0].scrollIntoView(true);", last);
       System.out.println(js.executeScript("return window.pageYOffset;" ));
       
       //scroll up to certain element 
       List <WebElement> mylist=driver.findElements(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
   	
	      WebElement leftslider =mylist.get(1);
	      WebElement Rightslider=mylist.get(0);
	      
	      js.executeScript("arguments[0].scrollIntoView();",leftslider );
	     js.executeScript("arguments[0].scrollInto", Rightslider );
	      System.out.println(js.executeScript("return window.pageYOffset;"));
	      
	      
    //scroll till end by using method
	      
	      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	      System.out.println(js.executeScript("return window.pageYOffset;"));
	      
	     //scroll back to inital position
	      
	      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	      System.out.println(js.executeScript("return window.pageYOffset;" ));
	      Thread.sleep(5000);
	      //size of screen can be adjusted 
	      js.executeScript("document.body.style.zoom='50%'");
	      js.executeScript("document.body.style.zoom='80%'");
	      
	      Thread.sleep(10000);
        
        
        
        driver.quit();
	
	
	
	
	
	
	}

}
