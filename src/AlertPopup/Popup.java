package AlertPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//syntax for basic auth
		//http://username:password@url)
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.quit();
		
	}

}
