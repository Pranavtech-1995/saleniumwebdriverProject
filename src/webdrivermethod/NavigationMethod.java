package webdrivermethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://reports.crownit.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		URL url= new URL("https://www.orangehrm.com/en/solutions/compensation/payroll-connector");
		driver.navigate().to(url);
		//navigate.to method accept url in the form of string as well as object but get method ccaept only in the form of string
		
		driver.close();	
	}

}
