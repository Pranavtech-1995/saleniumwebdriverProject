package Webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total no of row
		      int rows= driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
		      System.out.println(rows);//7
		//find total no of column 
		      int column= driver.findElements(By.xpath("//*[@name='BookTable']//th")).size();
		      System.out.println(column);//4
		      
		//getting data of element from table by using row and column
		      System.out.println(driver.findElement(By.xpath("//*[@name='BookTable']//tr[3]//td[2]")).getText());
	
	
	//getting all data 
		      Thread.sleep(10000);
		      
		      System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		      
		      for (int r=2;r<=rows;r++) {
		    	   
		    	  for (int c=1;c<=column;c++) {
		    		  
		    		  String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		    	      System.out.print(value+"\t");
		    	  }
		    	  
		    	  System.out.println();
		    	  
		      }
		      
		 //Printing book name whose author is mukesh
		      
		      for (int r=2;r<=rows;r++)
		    	  
		        { 
		    	  String s=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		    	   if(s.equals("Mukesh"))
		    	   {
		    		  String bookname=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		    	   
		    		  System.out.println(bookname +" by mukesh");
		    		  break;//it will break not go for further 
		    	   }}
		  //find total price of all the books
		    	   int total=0;
		    	   for (int r1=2; r1<rows;r1++)
		    	   {
		    		   String price =driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r1+"]//td[4]")).getText();
		    	       total =total+Integer.parseInt(price);
		    	   }
		    	  
		    	  System.out.println("sum of price is "+total);
		    	  
		      
	
	
	driver.quit();
	
	}

}
