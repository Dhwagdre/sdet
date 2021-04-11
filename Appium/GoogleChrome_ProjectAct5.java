package appium_Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleChrome_ProjectAct5 {
	AppiumDriver<MobileElement> driver = null;	
	WebDriverWait wait;

	@BeforeTest

	public void setup() throws MalformedURLException, InterruptedException	{
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
	Thread.sleep(2000);
	
	}
	
	@Test
	public void Testcase_valid() throws InterruptedException {
 
	      Thread.sleep(1000);
	      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"username\")")).sendKeys("admin");
	      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"password\")")).sendKeys("password");
	      //driver.findElement(By.partialLinkText("Log in")).click();
	      driver.findElement(By.xpath("//android.view.View[4]/android.view.View/android.view.View/android.widget.Button")).click();
	      
	      MobileElement T1=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")"));
	      Assert.assertEquals("Welcome Back, admin", T1.getText());
	}
	
	@Test
	public void Testcase_Invalid() throws InterruptedException {
		   
		 driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Login Form\"))"));
	     //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"Login Form\")"));
		  driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login Form Please sign in.\"]/android.view.View[1]/android.widget.TextView")).click();
		 Thread.sleep(1000);
	    
	      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"username\")")).sendKeys("admin");
	      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"password\")")).sendKeys("passwords");
	      driver.findElement(By.xpath("//android.view.View[3]/android.view.View/android.view.View/android.widget.Button")).click();
	      Thread.sleep(200);
	      MobileElement T1=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")"));
	      Assert.assertEquals("Invalid Credentials", T1.getText());
	}	
	@AfterTest
	public void tearDown() {
	    //driver.quit();
	}
	
	}

