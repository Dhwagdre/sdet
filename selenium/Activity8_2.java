package SeleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		System.out.println(" number of columns: " +cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println(" number of rows: " +rows.size());
		
		WebElement rowcol2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell2_2 Value: " + rowcol2_2.getText());
        
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
        
        WebElement Urowcol2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("After sorting, Cell2_2 Value: " + Urowcol2_2.getText());
        
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Footer Value: " + footer.getText());
        
        driver.close();

	}
}
