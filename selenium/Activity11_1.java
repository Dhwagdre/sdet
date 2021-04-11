package SeleniumProj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver= new FirefoxDriver();
			
			driver.get("https://www.training-support.net/selenium/javascript-alerts");
	        System.out.println("Title of the page is : " +driver.getTitle());
	        
	        WebElement Simple = driver.findElement(By.id("simple"));
	        Simple.click();
	        
	        Alert SimpleAlert = driver.switchTo().alert();
	        System.out.println("Message of simple alert is : " +SimpleAlert.getText());
	        
	        SimpleAlert.accept();
	        driver.close();
	        


	}

}
