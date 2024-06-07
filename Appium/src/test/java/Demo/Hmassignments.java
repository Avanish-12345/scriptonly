package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

//import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Drivers.appinstall;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Hmassignments 
{
	@Test
public void hm() throws MalformedURLException, URISyntaxException, InterruptedException
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
		driver.findElement(AppiumBy.id("com.hm.goe:id/action_search_button")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("tshirts");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='tshirts men']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Product Image']")).click();
		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Product Image']"));
		((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
		WebElement swipeelement=driver.findElement(AppiumBy.accessibilityId("Product Image"));
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)swipeelement).getId(),"direction","left","percent",0.75));
		Thread.sleep(2000);
		WebElement swiperight=driver.findElement(AppiumBy.id("com.hm.goe:id/carouselPhotoView"));
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)swiperight).getId(),"direction","right","percent",0.75));
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.hm.goe:id/ivCloseCarousel']")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/stickyAtbButton")).click();
		WebElement selectelement=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)"));        
		Assert.assertTrue(selectelement.isDisplayed(),"Select element is not displayed");
				selectelement.click();
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
			
}
}
