package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/index.html");
		
		Thread.sleep(10000);
		
		 List <WebElement >no= driver.findElements(By.xpath("//*[@id='moremoney']//preceding-sibling::li"));
         System.out.println("Preceding-sibling size is"+no.size());
         List <WebElement >no1= driver.findElements(By.xpath("//*[@id='moremoney']//preceding-sibling::*"));
         System.out.println("Preceding-sibling * size is"+no1.size());
         List <WebElement >no3= driver.findElements(By.xpath("//*[@id='moremoney']//following-sibling::li"));
         System.out.println("Following-sibling size is"+no3.size());
         List <WebElement >no4= driver.findElements(By.xpath("//*[@id='moremoney']//following-sibling::*"));
         System.out.println("Following-sibling * size is"+no4.size());
         List <WebElement >no5= driver.findElements(By.xpath("//*[@id='moremoney']//following::*"));
         System.out.println("Following* size is"+no5.size());
         List <WebElement >no6= driver.findElements(By.xpath("//*[@id='moremoney']//preceding::*"));
         System.out.println("Preceding* size is"+no6.size());
         List <WebElement >no7= driver.findElements(By.xpath("//*[@id='moremoney']//parent::li"));
         System.out.println("Parent size is"+no7.size());
         List <WebElement >no8= driver.findElements(By.xpath("//*[@id='moremoney']//parent::*"));
         System.out.println("Parent* size is"+no8.size());
         List <WebElement >no9= driver.findElements(By.xpath("//*[@id='moremoney']//child::li"));
         System.out.println("Child size is"+no9.size());
         List <WebElement >no10= driver.findElements(By.xpath("//*[@id='moremoney']//child::*"));
         System.out.println("Child* size is"+no10.size());
         List <WebElement >no11= driver.findElements(By.xpath("//*[@id='moremoney']//ancestor::*"));
         System.out.println("Ancestor* size is"+no11.size());
         List <WebElement >no12= driver.findElements(By.xpath("//*[@id='moremoney']//ancestor::li"));
         System.out.println("Ancestor size is"+no12.size());
         List <WebElement >no13= driver.findElements(By.xpath("//*[@id='moremoney']//descendant::*"));
         System.out.println("descendant size is"+no13.size());
         List <WebElement >no14= driver.findElements(By.xpath("//*[@id='moremoney']//descendant::*"));
         System.out.println("descendant* size is"+no14.size());
         
         //using xpath with index
         Thread.sleep(10000);
        System.out.println( driver.findElement(By.xpath("//*[@id='moremoney']/ul/li[3]")).getText());
         
         driver.findElement(By.xpath("//*[@id='moremoney']/ul/li[last()]")).click();
         
         driver.close();
	
	}

}
