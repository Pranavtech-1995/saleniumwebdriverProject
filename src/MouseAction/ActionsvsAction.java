package MouseAction;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsvsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	
	     WebElement Rightclick =driver.findElement(By.xpath("//*[text()='right click me']"));
	     
	     
	        Actions act= new Actions(driver);
	        
	       Action click=act.contextClick(Rightclick).build();//creating an action//later we will performig it 
	        
	       click.perform();// completion of action
	       
	       WebElement select =driver.findElement(By.xpath("//*[text()='Copy']"));
	       select.click();
	       
	       Alert alert=driver.switchTo().alert();
	        System.out.println(alert.getText());
	       alert.accept();
	       
	       //Actions//class to handle the mouse action
	       //action //it is an interface used to store created action
	     //Build// is used to create an action
	       //perform -will automatically create an action and complete it too 
	       //so if we want to use it in simulatenously you can use alone perform method 
	driver.quit();	
	}

}
