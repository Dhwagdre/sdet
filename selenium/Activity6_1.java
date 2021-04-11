package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,20);
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleCheckBox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckBox.click();
        
        wait.until(ExpectedConditions.invisibilityOf(checkBox));
        
        toggleCheckBox.click();
      
        wait.until(ExpectedConditions.visibilityOf(checkBox));
        
        checkBox.click();
        driver.close();        
			}
}
