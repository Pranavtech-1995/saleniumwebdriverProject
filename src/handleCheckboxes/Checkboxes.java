package handleCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
     driver.get("https://testautomationpractice.blogspot.com/");
     
     //Selecting single  element 
     driver.findElement(By.xpath("//*[@class='form-check-input' and @id='sunday']")).click();
	
	//selecting all element 
    List<WebElement> mylist=driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
	System.out.println(mylist.size());
	
	
	for (int i=0;i<=mylist.size()-1;i++)
	{
	      mylist.get(i).click();
	}
	 
	//unselecting 3 element for bottom
	
	for (int i=4;i<=mylist.size()-1;i++)
	{
	    if (mylist.get(i).isSelected())
	    {
		    
	    	mylist.get(i).click();
	    }
	}
	    
	    for ( WebElement x:mylist)
	    {
	    	if (x.isSelected()) {
	    	   x.click();
	    	  System.out.println( x.getText());
	    	
	    	}
	    }
	driver.close();
	
	}
	
	
	
	}


