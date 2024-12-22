package AlertPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alerts {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//single alert//only accept condition is available
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//confirmation alert //two option avilable
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//confirmation with text//through Explicit method
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		
		 Alert s1=wait.until(ExpectedConditions.alertIsPresent());
		 s1.sendKeys("welcome");
		
		System.out.println(s1.getText());
		s1.accept();
		//confirmation with text
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
	    driver.switchTo().alert().sendKeys("best");
	    driver.switchTo().alert().accept();//for cancel
	    
	    
		
		driver.quit();
		
		

	}

}
