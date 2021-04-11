package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement checkchangeContent= driver.findElement(By.xpath("//button[contains(@class,'violet')]"));
        checkchangeContent.click();
        
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        WebElement textelement= driver.findElement(By.id("ajax-content"));
        System.out.println("text of the page is : " +textelement.getText());
        
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        WebElement newtext= driver.findElement(By.id("ajax-content"));
        System.out.println("new text of the page is : " +newtext.getText());
        
        driver.close();
	}
}
