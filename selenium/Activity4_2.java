package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of the page is : "+ driver.getTitle());

		WebElement firstName= driver.findElement(By.xpath("//input[@id='firstName']")); 
		firstName.sendKeys("Dheeraj");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Wagdre");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dheeraj.wagdre@gmail.com");
	    driver.findElement(By.xpath("//input[@id='number']")).sendKeys("7204398949");
	    driver.findElement(By.xpath("//textarea")).sendKeys("This is mt test message");
	    
		WebElement submit= driver.findElement(By.xpath("//input[contains(@class, 'green')]")); 
		submit.click();
		
		//driver.close();
		
		
	}

}
