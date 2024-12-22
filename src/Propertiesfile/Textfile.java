package Propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	
	       // WebDriver driver= new ChromeDriver();
	        
	        
	        FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\test.properties");
	       
	        Properties p= new Properties();
	        p.load(fi);
	        //getting key and value 
	        p.entrySet();
	        System.out.println(p.entrySet());
	        //get value
	        String s=p.getProperty("appurl");
	        System.out.println(s);
	        //URL url =new URL(s);
	        
	        WebDriver driver= new ChromeDriver();
	        driver.get(s);
	        System.out.println(s);
	        //getting key 
	        Set<Object>s1= p.keySet();
	        System.out.println(s1);
	         Set<String> s2 = p.stringPropertyNames();
	         System.out.println(s2);
	         //reading all the value               
	         Collection<Object> s3=p.values();
	         System.out.println(s3);
	        
	        
	        
	        
	        
	        
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
