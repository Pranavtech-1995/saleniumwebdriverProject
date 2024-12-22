package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//tagname is not mandatory//it is optional
		// by using class //.classname//tag.classname 
		System.out.println(driver.findElement(By.cssSelector(".ico-login")).getText());
		
		Thread.sleep(1000);
		//by using id //tagname#idvalue // 
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("desktop");
		
		//by using tag attribute //tag[attribute='value']
		System.out.println(driver.findElement(By.cssSelector("[placeholder='Search store']")).isEnabled());
		
		// by using class and attribute too //tagname.classname[attribute='value]
		
		System.out.println(driver.findElement(By.cssSelector(".search-box-text[aria-label='Search store']")).isSelected());
		driver.close();
		//
		
		

	}

}
