package MouseAction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderwithmouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List <WebElement> mylist=driver.findElements(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
	      WebElement leftslider =mylist.get(1);
	      WebElement Rightslider=mylist.get(0);
	     
	      //System.out.println(leftslider.getText());
	      
	      System.out.println("Before moving"+leftslider.getLocation());
	      System.out.println("Before moving"+Rightslider.getLocation());
	      
	      Actions act = new Actions(driver);
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", leftslider);
	        js.executeScript("arguments[0].scrollIntoView(true);", Rightslider);
	      Thread.sleep(10000);
	      
	      act.dragAndDropBy(leftslider,-5, 1968).perform();
	      act.dragAndDropBy(Rightslider,20, 1968).build().perform();
	     
	      System.out.println("After moving"+leftslider.getLocation());
	      System.out.println("After moving"+Rightslider.getLocation());
	      
	
	
	
	
	}

}
