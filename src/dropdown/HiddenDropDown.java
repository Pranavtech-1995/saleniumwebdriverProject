package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	     
	     driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	     driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	     driver.findElement(By.xpath("//*[text()=' Login ']")).click();
	     //driver.findElement(By.xpath("//*[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")).click();
	     driver.findElement(By.xpath("//*[text()='PIM']")).click();
	     //driver.findElement(By.xpath("//*[text()=' Add ']")).click();
	     
	     //Selecting single element 
	     driver.findElement(By.xpath("//*[@class='oxd-select-text--after']")).click();
	     //driver.findElement(By.xpath("//*[text()='Freelance']")).click();
	     
	     // selecting Multiple //pending
	     List <WebElement>s=driver.findElements(By.xpath("//*[@role='option']//span"));
	     System.out.println(s.size());
	     
	     for(int i=0;i<=s.size()-1;i++) 
	     {
	    	 System.out.println(s.get(i).getText());
	     }
	     
	     
	     for(WebElement x:s)
	     {
	    	if (x.getText().equals("Full-Time Contract") )
	    	{ 
	    		System.out.println(x.isSelected());
	    		System.out.println( x.getText());
	    		x.click();
	    		
	    		break;
	    	}
	     }
	     
	     
	     driver.quit();
	     
	     //some eleme
	
	}

}
