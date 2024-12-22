package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("salenium");
	
	
	     List <WebElement> suggestionlist =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	
	     System.out.println(suggestionlist.size());
	     
	     for (int i=0;i<=suggestionlist.size()-1;i++) {
	     
	     System.out.println(suggestionlist.get(i).getText());
	     
	     
	     }
	     
	     for(WebElement x :suggestionlist) {
	    	 if(x.getText().equals("selenium testing")) 
	    	 {
	    		 System.out.println(x.getText());
	    		 x.click();
	    		 break;
	          }
	    	 }
	
	
	driver.quit();
	
	
	}

}
