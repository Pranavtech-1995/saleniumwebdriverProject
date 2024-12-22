package webdrivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//is Enabled- this is used to check radio button and checkbox
		//is selected- this is also used to check radio button and checkbox properties
		//is displayed -this is used to check any elememt is visible or not 
		
		WebDriver driver= new ChromeDriver();
		//get browser//open the url on the browser
		
		driver.get("https://www.orangehrm.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.tagName("img")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@name='locale']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@name='locale']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@placeholder='Enter your email address here']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@placeholder='Enter your email address here']")).isSelected());
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
