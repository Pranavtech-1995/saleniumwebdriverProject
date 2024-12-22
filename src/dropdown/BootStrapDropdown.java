package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	     driver.findElement(By.xpath("//*[@class='multiselect dropdown-toggle btn btn-default']")).click();
	
	//select single option
	     
	     driver.findElement(By.xpath("//input[@value='Python']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='Python']")).isSelected());
	    
		
		List <WebElement> select=driver.findElements(By.xpath("//*[@class='checkbox']"));
	   System.out.println(select.size());
	   
	   //seleting multiple element or all elememt or particulalry element with condition
	   
	   
	    
	    for (WebElement x:select) {
	    
	    
	    if (x.getText().equals("jQuery")|| x.getText().equals("Bootstrap"))
	      
	    {
	    	x.click();
	    	System.out.println(x.getText());
	    }
	    }
	    
	    driver.quit();
	    
	    
}

}
