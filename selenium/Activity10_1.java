package SeleniumProj;

//import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
		Actions actions = new Actions(driver);

		driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page is : " +driver.getTitle());
        
        WebElement Cube = driver.findElement(By.id("wrapD3Cube"));
        actions.click(Cube);
        
        WebElement CubeValue = driver.findElement(By.className("active"));
        System.out.println("The CubeValue is : " +CubeValue.getText());
        
        actions.doubleClick(Cube).perform();
        CubeValue = driver.findElement(By.className("active"));
        System.out.println("The double click is : " +CubeValue.getText());
        
        actions.contextClick(Cube).perform();
        CubeValue = driver.findElement(By.className("active"));
        System.out.println("The right click is : " +CubeValue.getText());
        
       driver.close();

	}

}
