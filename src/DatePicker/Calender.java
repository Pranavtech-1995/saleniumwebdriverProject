package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	static //sending input through datepicker 
   String requireddate="10";
   static String requiremonth="December";
   static String requireyear="2035" ;
  //sending directly input 
   
    static void datepicker ( WebDriver driver,  String requireddate, String requiremonth, String requireyear) 
    {
    
    WebElement input=driver.findElement(By.xpath("//input[@id='datepicker']"));
    input.sendKeys("12/05/2024");
    
    
     
     input.click();
     
     //selecting date and month 
     while(true) 
     {
     String currentyear =driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
     String currentmonth= driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
      
     
     if (currentyear.equals(requireyear) && currentmonth.equals(requiremonth))
     {
  	   driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+requireddate+"']")).click();
  	   break;
     }
     else {
     driver.findElement(By.xpath("//*[@title='Next']")).click();
     }
     }}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker//");
		        
		driver.switchTo().frame(0);
		datepicker(driver, requireddate, requiremonth, requireyear);
		
		driver.close();
		
		
	       
	       
	           
	           
	}

}
