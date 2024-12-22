package webdrivermethod;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitMehod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
		WebDriver driver= new ChromeDriver();
		
		//implicit wait - it will wait until element will be loaded if it is available then it will not go for max time
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//it will wait until 5 second will not over even element is to be  found 
		//no such element acception
		//Thread.sleep(5000);
	    driver.get("https://reports.crownit.in/");
		 
		//Explicit wait
	    //condition based wait condition 
	    //complex in nature
	    //it will also wait for max time until condition meet
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	 WebElement buttoncheck =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
	  WebElement visibilty=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));                     
		 System.out.println(buttoncheck.isEnabled());
		 visibilty.click();
		 
		 //Fluent
		 //extra feature is just like a polling/checking element after each iteration
		 
		 Wait<WebDriver> fwait =new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(20))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		 
		 WebElement foo = fwait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//button[text()='Login']"));
		     }
		     });
		 
		 foo.click();
		 foo.getText();
		 
		 driver.close();
		 
	}

}
