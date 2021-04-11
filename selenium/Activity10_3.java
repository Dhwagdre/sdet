package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		Actions actions = new Actions(driver);

		driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title of the page is : " +driver.getTitle());
        WebElement Ball= driver.findElement(By.id("draggable"));
        WebElement Drop1= driver.findElement(By.id("droppable"));
        WebElement Drop2= driver.findElement(By.id("dropzone2"));        
        
        actions.dragAndDrop(Ball, Drop1).build().perform();        
        wait.until(ExpectedConditions.attributeToBeNotEmpty(Drop1, "background-color"));
    	System.out.println("ENTERED DROPZONE 1");
        
        actions.dragAndDrop(Ball, Drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(Drop2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");


        driver.close();
	}

}
