package SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println(" number of columns: " +cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println(" number of rows: " +rows.size());
		
		List<WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdrow) {
        	
            System.out.println("Cell Value: " + cellValue.getText());
	
        }

        WebElement rowcol2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Cell2_2 Value: " + rowcol2_2.getText());
	
        driver.close();
        
	}

}
