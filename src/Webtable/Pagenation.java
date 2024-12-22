package Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagenation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(10000);
		//Reading all the data from pageniation table by using pageno count 
		List<WebElement> mylist =driver.findElements(By.xpath("//ul[@class='pagination']//li"));
		 System.out.println( "totalsize of page is "+mylist.size());
		
		for(int i=1;i<=mylist.size();i++) 
		{
			if (i>1)
			{
		    	driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+i+"']")).click();
			}
			
			int  rows= driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
				
				 System.out.println("ID"+"\t"+"Name"+"\t"+"Price"+"\t"+"Select");
				for (int r=1; r<=rows;r++)
					
				{
					String s1=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]")).getText();
					 String s2= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
					String s3=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				     driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td//input[@type='checkbox']")).click();
				   boolean b = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td//input[@type='checkbox']")).isSelected();
				     System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+b);
			
				}
			
			
			
		  
		}
		
		//if pagenation page no is availble then we have to catch it first by using  string and after that 
		//Apply substring (start end with fixed content in""+1 and -1 to catch the total no of page
		//s.substring (s.indexof("("+1),s.indexof("pages"-1))
		
		driver.quit();
		
		
		
		
	}

}
