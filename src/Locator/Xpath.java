package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver =new ChromeDriver();
		
		//Absolute -it is from top to bottom path by using tag & / 
		//realtive - jumping direct into last one by using tag &  //
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.get("https://demo.opencart.com/");
		
	//Xpath by id //tagname[@id='value']
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("Tshirt");
	//Xpath by name //tagname[@name='value']//*[@name='value']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("shirt");
		
	//Xpath by class//tagname[@attribute='value']
		driver.findElement(By.xpath("//*[@aria-label='Search store']")).sendKeys("Desktop");
		
	//Xpath with multiple attribute //*[@attribute='value'][@attribute='value']
		driver.findElement(By.xpath("//*[@name='q'][@placeholder='Search store']")).sendKeys("yahoo");
	//Xpath with and operator  //*[@attribute='value'and attribute='value']
		
		driver.findElement(By.xpath("//*[@name='q'and@placeholder='Search store']")).sendKeys("next");
	//Xpath with or operator 
		driver.findElement(By.xpath("//*[@name='q'or @placeholder='Search store']")).sendKeys("electronics");

		
	// Xpath with inner text (//*[text()='innertext')
		System.out.println(driver.findElement(By.xpath("//*[text()='Log in']")).isDisplayed());
		
		//Xpath with contains with inner text (//*[contains(text(),'value']
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).getText());
		
		
		//Xpath with contains with other attribute//*[contains(@attribute='value')]
		System.out.println(driver.findElement(By.xpath("//*[contains(@class,'button-1 search-box-button')]")).getText());
		//Xpath with contains with start with
		System.out.println(driver.findElement(By.xpath("//*[starts-with(@class,'button-1 search-box-button')]")).getText());
		
		// chained Xpath
		driver.findElement(By.xpath("//*[@id='small-search-box-form']/button ")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
