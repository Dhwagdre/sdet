package appium_Project;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
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

public class GoogleChrome_ProjectAct4 {
	AppiumDriver<MobileElement> driver = null;	
	WebDriverWait wait;

	@BeforeTest

	public void setup() throws MalformedURLException	{
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Pixel 4 API 28");
	caps.setCapability("platformName", "Android");
	caps.setCapability("appPackage", "com.android.chrome");
	caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	caps.setCapability("noReset", true);

	// Instantiate Appium Driver
	URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver<MobileElement>(appServer, caps);
	wait = new WebDriverWait(driver, 20);
	
    driver.get("https://www.training-support.net/selenium");
	}
	@Test
	public void f() throws InterruptedException {
		   
		  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"To-Do List\"))"));
	      driver.findElement(By.xpath("//android.view.View[@content-desc=\"To-Do List Elements get added at run time\"]/android.view.View[1]/android.widget.TextView")).click();
	      Thread.sleep(1000);

	      String Task[] = {"Add tasks to list",
				  "Get number of tasks",
				  "Clear the list"};
		  int i;
		  for(i=0; i<3; i++) {
		
			 
			  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")));
			  driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]")).click();
		      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")).sendKeys(Task[i]);
	   	      driver.findElement(By.xpath("//android.view.View[3]/android.view.View[1]/android.widget.Button")).click();
	          Thread.sleep(500);
	   	      MobileElement T1=driver.findElement(By.xpath("//android.view.View[3]/android.view.View[2]/android.view.View"));
	   	                                                 
	          Assert.assertEquals(T1.getText(),Task[i]);
	          T1.click();
	         
		  }
   
	}
	@AfterTest

	public void tearDown() {
		
	    //driver.quit();
		

	}
	
	}


