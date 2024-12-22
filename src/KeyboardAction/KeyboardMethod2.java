package KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMethod2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Find the elements
        WebElement textField1 = driver.findElement(By.id("name"));
        WebElement textField2 = driver.findElement(By.id("email"));
        
        
               WebElement enter=driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']"));
               WebElement search=driver.findElement(By.xpath("//*[@class='wikipedia-search-button']"));
        
               Actions actions = new Actions(driver);
               //passing value using keyboard
                 actions.keyDown(enter,Keys.SHIFT).sendKeys("Hello").keyUp(Keys.SHIFT).perform();
                 //click action using keyboard by direct entering 
                 actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
                // click action using keyboard
                 actions.keyDown(Keys.CONTROL).click(search).keyUp(Keys.CONTROL).perform();
        

        // Clear and send initial text to textField1
        textField1.clear();
        textField1.sendKeys("Hello World");

        // Perform Ctrl + A, Ctrl + C, and Ctrl + V using Actions
        

        // Perform Ctrl + A (Select All in textField1)
        actions.keyDown(textField1, Keys.CONTROL).sendKeys("a").click(textField1).keyUp(Keys.CONTROL).perform();

        // Perform Ctrl + C (Copy text in textField1)
        actions.keyDown(textField1, Keys.CONTROL).sendKeys("c").click(textField1).keyUp(Keys.CONTROL).perform();

        // Perform Ctrl + V (Paste text into textField2)
        actions.keyDown(textField2, Keys.CONTROL).sendKeys("v").click(textField2).keyUp(Keys.CONTROL).perform();

        // Verify the pasted text (optional)
        //System.out.println("Text in second field: " + textField2.getAttribute("value"));

        // Close the driver
        driver.quit();
    }
}
