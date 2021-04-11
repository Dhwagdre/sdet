package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }
  
  @Test
  public void f1() {
	  System.out.println("The title of the page is : " +driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Target Practice");
  }

  @Test
  public void f2() {
      WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
  	  Assert.assertTrue(blackButton.isDisplayed());
	  Assert.assertEquals(blackButton.getText(), "black");
  }

  @Test(enabled=false)
  public void f3() {
	  System.out.println("Skipped The title of the page is : " +driver.getTitle());
		
  }
  @Test
  public void f4() {
	  throw new SkipException("Skipping test case3");   
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  

}
