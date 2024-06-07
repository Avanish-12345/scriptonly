package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Swipegesture 
{
	@Test
public void swipe() throws MalformedURLException, URISyntaxException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName", "android");
	dc.setCapability("appium:automationName","uiAutomator2");
	dc.setCapability("appium:deviceName", "vivo 1902");
	dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
	dc.setCapability("appium:noReset", true);
	dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
	dc.setCapability("appium:autoGrantPermisions",true);
	dc.setCapability("appium:appPackage","io.appium.android.apis");
	dc.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
	URL u=new URI("http://localhost:4723").toURL();
	AndroidDriver driver=new AndroidDriver(u,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	//((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("left",548,"top",100,"width",377,"height",100,"direction","left","percent",0.75));
	((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"direction","left","percent",0.75));
	
	
}
}
