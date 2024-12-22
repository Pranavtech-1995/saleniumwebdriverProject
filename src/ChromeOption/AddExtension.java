package ChromeOption;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	         ChromeOptions o = new ChromeOptions();
	        // o.addArguments("headless=new");
	        // o.addArguments("--incognito");
	         o.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	         o.setAcceptInsecureCerts(true);
	         
	         //String Selector ="C:\\Users\\Lenovo\\SelectorsHub.crx";
	        String ublock ="C:\\Users\\Lenovo\\uBlock-Origin-Lite.crx";
	         File importfile= new File(ublock);
	         o.addExtensions(importfile);
	
	          WebDriver driver = new ChromeDriver(o);
	          
	          
	          driver.get("https://text-compare.com/");
	          
	          System.out.println(driver.getTitle());
	
	          driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
