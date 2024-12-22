package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
      WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://ui.vision/demo/webtest/frames/");
    //frame by webelement
   
     WebElement frame1= driver.findElement(By.xpath( "//frame[@src='frame_1.html']"));
    driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("welcome");
    
    
    //for coming out of frame
    driver.switchTo().defaultContent();
    
    //Frame 2
    
      WebElement Frame2= driver.findElement(By.xpath("//*[@src='frame_2.html']"));
      driver.switchTo().frame(Frame2);
      driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("test");
    
      driver.switchTo().defaultContent();
      //
      //Frame 3
      WebElement Frame3=driver.findElement(By.xpath("//*[@src='frame_3.html']"));
      driver.switchTo().frame(Frame3);
     driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("testing");
      
      
     //Nested Frame Testing
     
     //switch to frame using index bcz name and id of frame is available if it available then use that one 
     driver.switchTo().frame(0);
     
      // WebElement  NestedFrame=driver.findElement(By.xpath("//*[@class='lrKTG']"));
      
      // driver.switchTo().frame(NestedFrame);
       driver.findElement(By.xpath("//*[@class='AB7Lab Id5V1']")).click();
       
       
    
	
	}

}
