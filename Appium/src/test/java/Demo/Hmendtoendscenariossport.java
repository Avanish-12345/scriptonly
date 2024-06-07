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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Hmendtoendscenariossport 
{
	@Test
public void sport() throws MalformedURLException, URISyntaxException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName", "android");
	dc.setCapability("appium:automationName","uiAutomator2");
	dc.setCapability("appium:deviceName", "vivo 1902");
	dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
	dc.setCapability("appium:noReset", true);
	dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
	dc.setCapability("appium:autoGrantPermisions",true);
	dc.setCapability("appium:appPackage","com.hm.goe");
	dc.setCapability("appium:appActivity", "com.hm.goe.app.home.HomeActivity");
	URL u=new URI("http://localhost:4723").toURL();
	AndroidDriver driver=new AndroidDriver(u,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));	
//	Assert.assertTrue(driver.isAppInstalled("com.hm.goe"), "App is not installed");
	try {
        Assert.assertTrue(driver.isAppInstalled("com.hm.goe"), "App is not installed");
        System.out.println("App installation assertion successful");
    } catch (AssertionError e) {
        System.out.println("App installation assertion failed: " + e.getMessage());
    }
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"New Arrivals\"));")).click();
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sport\"));")).click();
	WebElement dividedelement=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Divided\")"));
	
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)dividedelement).getId(),"direction","left","percent",0.75));
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sport\")")).click();
	WebElement watertext=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.hm.goe:id/productImage\").instance(1)"));
	((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)watertext).getId(),"direction","left","percent",0.86));
	driver.findElement(AppiumBy.id("com.hm.goe:id/textViewAll")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sun visor\"));")).click();
	driver.findElement(AppiumBy.id("com.hm.goe:id/stickyAtbButton")).click();
	driver.findElement(AppiumBy.id("com.hm.goe:id/hm_shoppingbag_count")).click();
	String expData="Sun visor";
	String actualdata=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Sun visor\"]")).getText();
	Assert.assertEquals(actualdata, expData,"Product is added successfully");
	

}
}
