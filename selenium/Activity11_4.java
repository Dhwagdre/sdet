package SeleniumProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);  
		
		driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page is : " +driver.getTitle());
        
        String PWindow = driver.getWindowHandle();
        System.out.println("Title of the window is : " + PWindow);
        
        
        WebElement Launcher = driver.findElement(By.id("launcher"));
        Launcher.click();
       
         wait.until(ExpectedConditions.numberOfWindowsToBe(2));
         Set<String> AllWindow = driver.getWindowHandles();
         System.out.println("Title of the Allwindow is : " + AllWindow);
         
         for (String handle : driver.getWindowHandles()) {
        		
             driver.switchTo().window(handle);
 	
         }
         System.out.println("Current window handle: " + driver.getWindowHandle());
         wait.until(ExpectedConditions.titleIs("Newtab"));
     	
         System.out.println("New Tab Title is: " + driver.getTitle());
        
         Thread.sleep(5000);
         
         WebElement newTabText = driver.findElement(By.cssSelector("div.content"));
         
     	 System.out.println("New tab heading is: " + newTabText.getText());
     	 
         driver.findElement(By.linkText("Open Another One!")).click();
     	 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
 	      
     	AllWindow = driver.getWindowHandles();
 	
         System.out.println("All window handles: " + AllWindow);
   
         //Loop through the handles set till we get to the newest handle
 	
         for (String handle : driver.getWindowHandles()) {
 	
             driver.switchTo().window(handle);
 	
         }
 	
         System.out.println("New tab handle: " + driver.getWindowHandle());
         wait.until(ExpectedConditions.titleIs("Newtab2"));
 	
        System.out.println("New Tab Title is: " + driver.getTitle());
 	
       String newTabText2 = driver.findElement(By.cssSelector("div.content")).getText();
 	
         System.out.println("New tab heading is: " + newTabText2);
 	
         driver.quit();
     	 
     	 
     	 
	}

}
