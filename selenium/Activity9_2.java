package SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		Select multiL = new Select(driver.findElement(By.id("multi-select")));
		

		  if(multiL.isMultiple()) {
			  
			  multiL.selectByVisibleText("Javascript");
		      System.out.println("the 1st option is:  "+ chosen.getText());
		      
		      multiL.selectByValue("node");
		      System.out.println("the 2nd option is:  "+ chosen.getText());
		      int i;
		      for(i=4;i<=6;i++) {
		    	  multiL.selectByIndex(i);
		      }
		    
		      System.out.println("the 4th,5th and 6th option is:  "+ chosen.getText());
		      
		      multiL.deselectByValue("node");
		      System.out.println("the selected options after deselect NodeJs:  "+ chosen.getText());
		      multiL.deselectByIndex(7);
		      System.out.println("the selected options after deselect 7th option:  "+ chosen.getText());
		
		      List<WebElement> selectedOptions= multiL.getAllSelectedOptions();
	            for(WebElement selectedOption : selectedOptions) {
	            	
	                System.out.println("Selected option: " + selectedOption.getText());
		
	            }
	            
		      multiL.deselectAll();
		      System.out.println(chosen.getText());
		
		
		  }

		driver.close();
	}

}
