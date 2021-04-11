package SeleniumProj;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;



public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver= new FirefoxDriver();
		
		Actions act = new Actions(driver);

		driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page is : " +driver.getTitle());
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));

        Action Act1=act.sendKeys("D").build();
        Act1.perform();
        System.out.println("Pressed key of the page is : " +pressedKey.getText());
        
        Action Act2=act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        Act2.perform();
        System.out.println("Pressed key of all page is : " +pressedKey.getText());
        
        
        //paste
       // String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        //System.out.println(data);
        
        driver.close();

	}

}
