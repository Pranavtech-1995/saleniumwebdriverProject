package ChromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		  ChromeOptions o = new ChromeOptions();
		  o.addArguments("--incognito");
		  o.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		  o.setAcceptInsecureCerts(true);
	      
		  WebDriver driver = new ChromeDriver(o);
		  
		  driver.get("https://testautomationpractice.blogspot.com/");
		  
		  driver.quit();
		  
	      
	      
	      
	      
	
	
	
	
	
	}

}
