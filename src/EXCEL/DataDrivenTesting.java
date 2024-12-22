package EXCEL;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	
	
	   WebDriver driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	
	
	  WebElement principal=driver.findElement(By.name("principal"));
	  WebElement interest= driver.findElement(By.name("interest"));
	  WebElement tenure=driver.findElement(By.name("tenure"));
	  WebElement tenurePeriod=driver.findElement(By.name("tenurePeriod"));
	  WebElement frequency=driver.findElement(By.name("frequency"));
	  WebElement calculate=driver.findElement(By.xpath("//*[@class='CTR PT15']"));
	  WebElement clear= driver.findElement(By.xpath("//*[@onclick='javascript:reset_fdcalcfrm();']"));
	  WebElement ActualValue = driver.findElement(By.xpath("//*[@id='resp_matval']"));
	    
	  String file= System.getProperty("user.dir")+"\\TestData\\pran.xlsx";
	
	   int rowcount= ExcelUtility.getrowcount(file,"sheet1");
	    
	    
	    for (int r=1;r<=rowcount;r++)
	    	
	    {
	    	String prin=ExcelUtility.getcelldata(file, "Sheet1", r, 0);
	    	String intr =ExcelUtility.getcelldata(file, "Sheet1", r, 1);
	    	String tenur=ExcelUtility.getcelldata(file, "Sheet1", r, 2);
	    	String tenurePer= ExcelUtility.getcelldata(file, "Sheet1", r, 3);
	    	String frequ = ExcelUtility.getcelldata(file, "Sheet1", r, 4);
	    	String Exceptedvalue= ExcelUtility.getcelldata(file, "Sheet1", r, 5);
	    	//String ActualValue =ExcelUtility.getcelldata(file, "Sheet1", r, 6);
	    	
	    	principal.sendKeys(prin);
	    	interest.sendKeys(intr);
	    	tenure.sendKeys(tenur);
	    	Select s= new Select (tenurePeriod);
	    	s.selectByVisibleText(tenurePer);
	    	Select s1= new Select(frequency);
	    	s1.selectByVisibleText(frequ);
	    	    	
	    	Thread.sleep(10000);
	    	//driver.switchTo().alert().dismiss()	;
	         calculate.click();
	    	Thread.sleep(20000);
	    	String act=ActualValue.getText();
	    	
	    	if (Double.parseDouble(act)==Double.parseDouble(Exceptedvalue))
	    	{
	    		ExcelUtility.setcelldata(file, "Sheet1", r, 6, act);
	    		ExcelUtility.setcelldata(file, "Sheet1", r, 7, "Passed");
	    		ExcelUtility.fillGreencolour(file, "Sheet1", r, 7);
	    		
	    	}
	    	
	    	else 
	    	{
	    		ExcelUtility.setcelldata(file, "Sheet1", r, 6, act);
	    		ExcelUtility.setcelldata(file, "Sheet1", r, 7, "failed");
	    		ExcelUtility.fillRedColour(file, "Sheet1", r, 7);
	    		
	    	}
	    	
	    	clear.click();
	    	
	    }
	  
	
	
	
	
	
	
	
	
	
	driver.quit();
	
	
	}

}
