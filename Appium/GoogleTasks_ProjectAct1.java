package appium_Project;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class GoogleTasks_ProjectAct1 {
	 AppiumDriver<MobileElement> driver = null;	
	    WebDriverWait wait;
		
	    @BeforeTest
		
	    public void setup() throws MalformedURLException	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 30");
		caps.setCapability("platformName", "Android");
     caps.setCapability("appPackage", "com.google.android.apps.tasks");
     caps.setCapability("appActivity", ".ui.TaskListsActivity");
     caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 20);
		}
  @Test
  public void f() {
	  String Task[] = {"Complete Activity with Google Tasks",
			  "Complete Activity with Google Keep",
			  "Complete the second Activity Google Keep"};
	  int i;
	  for(i=0; i<3; i++) 
	  {
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
	  driver.findElementByAccessibilityId("Create new task").click();
	   MobileElement task1=driver.findElementById("add_task_title");
	  task1.sendKeys(Task[i]);
	  driver.findElementById("add_task_done").click();
	  }
	  	  
	  List<MobileElement> tasksAdded=driver.findElementsById("task_name");
	 
	  System.out.println(tasksAdded);
	 	  
	 for (i=0; i<3; i++) {
	  String taskAdd= tasksAdded.get(i).getText(); 
	  Assert.assertEquals(Task[Task.length-1-i], taskAdd);
	  }	 
	  
	 
  } 
}
