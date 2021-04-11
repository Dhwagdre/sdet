package SeleniumProj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is : " +driver.getTitle());
        
        
        WebElement Prompt = driver.findElement(By.id("prompt"));
        Prompt.click();
        
        Alert PromptAlert = driver.switchTo().alert();
         PromptAlert.sendKeys("Yes, you are!");
         
         PromptAlert.accept();
         
         driver.close();
        

	}

}
