package SVGELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	     
	     driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	     driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	     driver.findElement(By.xpath("//*[text()=' Login ']")).click();
	
	     driver.findElement(By.xpath("//*[@href='/web/index.php/time/viewTimeModule']")).click();
	     System.out.println(driver.findElement(By.xpath("//*[@href='/web/index.php/time/viewTimeModule']")).getText());
	     driver.findElement(By.xpath("//*[@href='/web/index.php/performance/viewPerformanceModule']")).click();
	      
	     Thread.sleep(2000);
	     
	
	      driver.quit();
	
	
	
	
	
	
	}

}
