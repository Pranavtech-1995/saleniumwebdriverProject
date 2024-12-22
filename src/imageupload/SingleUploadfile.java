package imageupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleUploadfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	  
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		   driver.get("https://testautomationpractice.blogspot.com/");
		   
		 WebElement Upload =driver.findElement(By.xpath("//*[@id='singleFileInput']"));
		 
		 String Filepath1 ="C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (1).png";
		 String Filepath2 ="C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (2).png";
		 
		 Upload.sendKeys(Filepath1);
		 //Upload.sendKeys(Filepath2);
		 WebElement click= driver.findElement(By.xpath("//*[@type='submit']"));
		 click.click();
		 String  filename=driver.findElement(By.xpath("//* [@id='singleFileStatus']")).getText();
		 
		 if (filename.equals("Single file selected: Screenshot (1).png, Size: 127778 bytes, Type: image/png"))
		 {
			 System.out.println(filename+" uploaded sucessfully");
			 
		 }
		 else {
			 
			 System.out.println("unable to upload");
		 }
		 
		 Thread.sleep(10000);
		 Upload.sendKeys(Filepath2);
		 click.click();
		 Thread.sleep(10000);
		 
		 String  filename2=driver.findElement(By.xpath("//* [@id='singleFileStatus']")).getText();
		 if (filename2.equals("Single file selected: Screenshot (2).png, Size: 197373 bytes, Type: image/png"))
		 {
			 System.out.println(filename2+" uploaded sucessfully");
			 
		 }
		 else {
			 
			 System.out.println("unable to upload");
		 }
		 
		 
		 
		 
		
		  driver.quit(); 
	
	
	}

}
