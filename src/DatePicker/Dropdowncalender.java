package DatePicker;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



           





public class Dropdowncalender {
	 static  Month convertmonth (String month) {
	
	HashMap <String,Month> monthmap= new HashMap<String ,Month>();
	
	monthmap.put("January", Month.JANUARY);
	monthmap.put("December", Month.DECEMBER);
	monthmap.put("November ", Month.NOVEMBER);
	monthmap.put("October ", Month.OCTOBER);
	monthmap.put("September ", Month.SEPTEMBER);
	monthmap.put("August", Month.AUGUST);
	monthmap.put("July ", Month.JULY);
	monthmap.put("June", Month.JUNE);
	monthmap.put("May", Month.MAY);
	monthmap.put("April", Month.APRIL);
	monthmap.put("March", Month.MARCH);
	monthmap.put("February", Month.FEBRUARY);
	
	         Month v =monthmap.get(month);
	 
	         if (v==null) 
	         {
	        	 System.out.println("Invalid month");
	         }
	         return v;
	
	
}
	

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mui.com/x/react-date-pickers/date-picker/");
		
		
		String date="18";
		String Month ="June";
		String Year="2040";
		//select year 
         driver.findElement(By.xpath("//*[@data-testid='CalendarIcon']")).click();
         driver.findElement(By.xpath("//*[@data-testid='ArrowDropDownIcon']")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[text()='"+Year+"']")).click();
         //select month
	     while(true) {
	    	 
	    	 String Currentmonth=driver.findElement(By.xpath("//*[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']//div[@style='opacity: 1; transition: opacity 225ms cubic-bezier(0.4, 0, 0.2, 1);']")).getText();
	         System.out.println(Currentmonth);
	         String[] s=Currentmonth.split(" ");
	                  String st =s[0];
	        Month result =convertmonth(st);
	        System.out.println(result);
	        Month result2=convertmonth(Month);
	        
	        int result3=result2.compareTo(result);
	        
	       
	        if (result3>0)
	        {
	        	driver.findElement(By.xpath("//*[@data-testid='ArrowRightIcon']")).click();
	        }
	        else if(result3<0)
	        {
	        	driver.findElement(By.xpath("//*[@data-testid='ArrowLeftIcon']")).click();
	        }
	        else 
	        {
	           break ;
	        }
	       
	         
	}
	     
	    List <WebElement>data =driver.findElements(By.xpath("//*[@class='MuiDayCalendar-monthContainer css-i6bazn']//div//button"));
	    	 
	      for ( int i=0;i<=data.size();i++) 
	      {
	    	  if (data.get(i).getText().equals(date)) 
	    	  {
	    		  data.get(i).click();
	    		  System.out.println(data.get(i).getText());
	    		  break;
	    	  }
	      }
	}

}
