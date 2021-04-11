package appium_Project;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class GoogleKeep_ProjectAct3 {	 
AppiumDriver<MobileElement> driver = null;	
WebDriverWait wait;

@BeforeTest

public void setup() throws MalformedURLException	{
DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("deviceName", "Pixel 4 API 30");
caps.setCapability("platformName", "Android");
caps.setCapability("appPackage", "com.google.android.keep");
caps.setCapability("appActivity", ".activities.BrowseActivity");
caps.setCapability("noReset", true);

// Instantiate Appium Driver
URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
driver = new AndroidDriver<MobileElement>(appServer, caps);
wait = new WebDriverWait(driver, 20);
}
@Test
public void f() {
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
	  driver.findElementByAccessibilityId("New text note").click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
	  driver.findElementById("editable_title").sendKeys("My Reminder Note");
	  driver.findElementById("edit_note_text").sendKeys("My Reminder Description");
	  driver.findElementById("menu_switch_to_list_view").click();
	  
	  driver.findElementByXPath("//android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]").click();
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	 
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	  
	driver.findElementByXPath("//android.widget.LinearLayout/android.widget.TextView[2]").click();
	    
	  
	  MobileElement Titlle=driver.findElementById("index_note_title");
	  Assert.assertEquals("My Reminder Note", Titlle.getText() );
	  
	  MobileElement Desc=driver.findElementById("index_note_text_description");
	  Assert.assertEquals("My Reminder Description", Desc.getText() );
	  
}
@AfterTest

public void tearDown() {
	
    //driver.quit();
	
}
}
