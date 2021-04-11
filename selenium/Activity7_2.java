package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page is : " +driver.getTitle());

        WebElement username= driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement Password= driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmpassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input[@type='password']"));
    	
        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        
        username.sendKeys("Dheerajwag");
        Password.sendKeys("Dheeraj@1234");
        confirmpassword.sendKeys("Dheeraj@1234");
        email.sendKeys("dheerajwag92@gmail.com");
        
        driver.findElement(By.xpath("//button[@onclick='signUp()']")).click();
        
        WebElement loginMessage= driver.findElement(By.id("action-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(loginMessage));
        System.out.println(loginMessage.getText());
        
        driver.close();
	}

}
