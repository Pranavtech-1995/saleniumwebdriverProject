package Screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://testautomationpractice.blogspot.com/");
	     
	    
	     
	     TakesScreenshot ts =(TakesScreenshot) driver; 
	       
	     //Full Page screenshot 
	     
	     File sources=ts.getScreenshotAs(OutputType.FILE);
	    //File Targets= new File ("C:\\Users\\Lenovo\\eclipse-workspace\\saleniumwebdriverProject\\Screenshot\\fullpage3.png");
	     File Targets= new File (System.getProperty("user.dir")+"\\Screenshot\\fullpage5.png");
	      sources.renameTo(Targets);
	      
	      
	      //Webelement screenshot //particular section screenshot
	        WebElement tabs= driver.findElement(By.xpath("//*[@id='HTML1']"));
	        File Source=tabs.getScreenshotAs(OutputType.FILE);
	        
	        File Target = new File(System.getProperty("user.dir")+"\\Screenshot\\WebElements1.png");
	        
	        Source.renameTo(Target);
	        
	        //Particular WebElement screenshot
	         WebElement name=driver.findElement(By.xpath("//*[@id='name']"));
	         name.sendKeys("Takescreenshot");
	         File source1=name.getScreenshotAs(OutputType.FILE);
	         File target1 =new File (System.getProperty("user.dir")+"\\Screenshot\\name1.png");
	         source1.renameTo(target1);
	        
	      
	       
	       driver.quit();
	
	
	
	
	
	}

}
