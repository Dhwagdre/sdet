package Act1;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Activity3_1 {
	 AppiumDriver<MobileElement> driver = null;	
	    WebDriverWait wait;
		
	    @BeforeTest
		
	    public void setup() throws MalformedURLException	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 30");
		caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.messaging");
        caps.setCapability("appActivity", ".ui.conversationlist.ConversationListActivity");
        caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);
		}
	    @Test
	    public void smsTest() {
        // Locate the button to write a new message and click it
	        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Create New Message\")")).click();
	        // Enter the number to send message to
	        String contactBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/auto_complete_contact\")";
	        // Enter your own phone number
	        driver.findElement(MobileBy.AndroidUIAutomator(contactBoxLocator)).sendKeys("123512345");
        // Focus on the message text box
	        String messageBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/hint_message\")";
	        driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();
	        // Type in a message
	        messageBoxLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/sms_edit_text\")";
	        MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
	        composeMessageInput.sendKeys("Hello from Appium");
	       // Send the message
	        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send SMS\")")).click();
	        // Wait for message to show
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("message_text_view")));
	        // Assertion
	        String messageLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/message_text_view\")";
	        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
	        Assert.assertEquals(sentMessageText, "Hello from Appium");
	    }
	    @AfterClass
		
	    public void afterClass() {
	        driver.quit();
		
	    }
		
	}	    