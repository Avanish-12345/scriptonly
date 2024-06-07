package Drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Driversmethod 
{
	@Test
public void methods() throws MalformedURLException, URISyntaxException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName", "android");
	dc.setCapability("appium:automationName","uiAutomator2");
	dc.setCapability("appium:deviceName", "vivo 1902");
	dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
	dc.setCapability("appium:noReset", true);
	dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
	dc.setCapability("appium:autoGrantPermisions",true);
	URL u=new URI("http://localhost:4723").toURL();
	AndroidDriver driver=new AndroidDriver(u,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
	/*if(driver.isDeviceLocked())
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}*/
	//driver.openNotifications();
	driver.activateApp("com.androidsample.generalstore");//launch the app
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
	Thread.sleep(4000);
	driver.hideKeyboard();
}
}
