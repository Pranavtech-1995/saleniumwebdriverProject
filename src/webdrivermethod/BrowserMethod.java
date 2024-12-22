package webdrivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://reports.crownit.in");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).isEnabled();
		 //By name 
		   
	    WebElement email =driver.findElement(By.name("inemail"));
	    email.sendKeys("Pranav.Prakash@ipsos.com");
	    
	    //By name 
	    WebElement Password=driver.findElement(By.name("inpassword"));
	    Password.sendKeys("Test@123");
	    
	    driver.findElement(By.xpath("//button[text()='Login']")).isEnabled();
         driver.findElement(By.xpath("//button[text()='Login']")).click();
         
         Thread.sleep(10000);
	   
         driver.findElement(By.xpath("//*[text ()='Dashboard']")).getText();
		driver.findElement(By.xpath("//*[text ()='Dashboard']")).click();
		
		driver.close();//this command close only one on which locator is avilable
		driver.quit();// this will close all browser

	}

}
