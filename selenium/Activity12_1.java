package SeleniumProj;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver= new FirefoxDriver();
	       		
			driver.get("https://www.training-support.net/selenium/iframes");
	        System.out.println("Title of the page is : " +driver.getTitle());
	        
	        driver.switchTo().frame(0);
	        
	        WebElement iframe= driver.findElement(By.className("content"));
	        System.out.println("Heading of the 1st iframe: " + iframe.getText());
	        
	        
	        WebElement Button1= driver.findElement(By.id("actionButton"));
	        System.out.println("Button1 Text: " + Button1.getText());
	        System.out.println("color of the button1: " + Button1.getCssValue("color"));
	        Button1.click();
	        
	        System.out.println("Button1 Text after click: " + Button1.getText());
	        System.out.println("color of the button1 after click: " + Button1.getCssValue("color"));
	        
	        //2nd frame
	       driver.switchTo().defaultContent(); 
           driver.switchTo().frame(1);
	        
	        WebElement iframe2= driver.findElement(By.cssSelector("div.content"));
	        System.out.println("Heading of the 2nd iframe: " + iframe2.getText());
	        
	      
	        //WebElement Button2= driver.findElement(By.id("actionButton"));
	    	
	        WebElement Button2 = driver.findElement(By.cssSelector("button"));
	        System.out.println("Button2 Text: " + Button2.getText());
	        System.out.println("color of the button2: " + Button2.getCssValue("color"));
	       // Thread.sleep(1000);
	       
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Button2);
	        Button2.click();
	        
	        System.out.println("Button2 Text after click: " + Button2.getText());
	        System.out.println("color of the button2 after click: " + Button2.getCssValue("color"));
	      
	        driver.switchTo().defaultContent(); 
	        //driver.close();
	        
	}

}
