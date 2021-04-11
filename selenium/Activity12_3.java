package SeleniumProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    	Actions action = new Actions(driver);
   		
		driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
    	
        action.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
    	
        String tooltipText = button.getAttribute("data-tooltip");
	
        System.out.println("Tooltip text: " + tooltipText);
        button.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("password");
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
        String message = driver.findElement(By.id("action-confirmation")).getText();
    	System.out.println(message);
    	driver.close();
	}

}
