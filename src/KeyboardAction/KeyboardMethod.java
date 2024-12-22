package KeyboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		
		WebElement Text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		Text1.clear();
		Text1.sendKeys("Welcome");
		WebElement Text2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		Actions act =new Actions(driver);
		 
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		System.out.println(Text2.getText());
		driver.findElement(By.xpath("//button[@id='compareButton']")).click();
		driver.quit();
		
	
	}

}
