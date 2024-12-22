package ChromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	         
		     ChromeOptions o= new ChromeOptions();
		     o.addArguments("--headless=new");
		     
		     WebDriver driver = new ChromeDriver(o);
	
	         driver.manage().window().maximize();
	         
	         driver.get("https://testautomationpractice.blogspot.com/");
	         System.out.println(driver.getTitle());
	
	
	
	
	
	}

}
