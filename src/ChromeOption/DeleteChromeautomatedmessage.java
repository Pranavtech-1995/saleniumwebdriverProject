package ChromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteChromeautomatedmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ChromeOptions o= new ChromeOptions();
		o.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		o.addArguments("--headless=new");
		o.setAcceptInsecureCerts(true);
		
		 WebDriver driver = new ChromeDriver(o);
		
		 driver.get("https://expired.badssl.com/");
		 
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
