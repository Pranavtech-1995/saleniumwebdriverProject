package imageupload;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleUploadfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	  
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		   driver.get("https://testautomationpractice.blogspot.com/");
		   
		 WebElement Upload =driver.findElement(By.xpath("//*[@id='multipleFilesInput']"));
		 System.out.println(Upload.getText());
		 
		 String Filepath1 ="C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (1).png";
		 String Filepath2 ="C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (2).png";
		 WebElement click= driver.findElement(By.xpath("//*[text()='Upload Multiple Files']"));
		 
		 //Upload.sendKeys(Filepath1);
		 //click.click();
		// Thread.sleep(5000);
		// Upload.sendKeys(Filepath2);
		 click.click();
		 
		 Upload.sendKeys(Filepath1+"\n"+Filepath2+"\n"+Filepath1);
		 click.click();
		 String filename=driver.findElement(By.xpath("//* [@id='multipleFilesStatus']")).getText();
		 
		 
		System.out.println(filename);
		    
		           String  s[]  =filename.split("/");
		          System.out.println("Total no upload file is "+(s.length-1));
		          int total=s.length-1;
		          if (total==2) {
		        	  System.out.println(total+" file upload succesfully");
		          }
		          else {
		        	  System.out.println("invalid format");
		          }
		          
		      if(filename.contains("Screenshot"))
		      {
		    	  System.out.println("File is matching");
		      }
		      else 
		      {
		    	  System.out.println("invalid file");
		      }
		 
		
		 
		 
		 
		
		  driver.quit(); 
	
	
	}

}
