package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	         WebDriver driver = new ChromeDriver ();
	         
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         driver.get("https://testautomationpractice.blogspot.com/");
	         
	        WebElement select =driver.findElement(By.xpath("//select[@id='country']"));
	         
	         Select s= new Select (select);
	        
	         // s.selectByIndex(4);
	          
	          //s.selectByValue("germany");
	          
	         // s.selectByVisibleText("Australia");
	          
	         s.selectByContainsVisibleText("Ind");
	        //  driver.quit();
	         
	         //
	         //capture the option 
	          List <WebElement> option=s.getOptions();
	          System.out.println(option.size());
	          
	          for (int i=0; i<=option.size()-1;i++) 
	          {
	         
	          if (option.get(i).getText().equals("China"))
	          {
	          
	        	  s.selectByIndex(i);
	        	  System.out.println(option.get(i).getText());
	          }
	          
	          }
	          
	          //by using enhanced for loop
	          for ( WebElement opt:option)
	          {
	        	  System.out.println(opt.getText());
	          }
	          
	          driver.quit();
	
	
	}

}
