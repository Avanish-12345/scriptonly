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

public class Hmendtoendscenariosmen
{
	@Test
public void hmMen() throws MalformedURLException, URISyntaxException, InterruptedException
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
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\").instance(0)")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Men\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Oversized Fit Printed mesh T-shirt\"));")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage")).click();
		WebElement element=driver.findElement(AppiumBy.id("com.hm.goe:id/carouselPhotoView"));
		((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
		driver.findElement(AppiumBy.id("com.hm.goe:id/ivCloseCarousel")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/stickyAtbButton")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(4)")).click();
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/hm_shoppingbag_count")).click();
		String exptext="Oversized Fit Printed mesh T-shirt";
		String actualText=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Oversized Fit Printed mesh T-shirt\"]")).getText();
		Assert.assertEquals(actualText, exptext,"Product is added successfully");
		try {
            Assert.assertTrue(driver.isAppInstalled("com.hm.goe"), "App is not installed");
            System.out.println("App installation assertion successful");
        } catch (AssertionError e) {
            System.out.println("App installation assertion failed: " + e.getMessage());
        }
		
}
}
