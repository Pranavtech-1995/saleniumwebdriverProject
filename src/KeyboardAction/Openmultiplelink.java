package KeyboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openmultiplelink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//direct moving our driver to next tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//direct switching of driver to next window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		 WebElement tab2=driver.findElement(By.xpath("//*[@class=' lazyloaded']"));
		 System.out.println(tab2.isDisplayed());
		
		driver.close();
	
	}

}
