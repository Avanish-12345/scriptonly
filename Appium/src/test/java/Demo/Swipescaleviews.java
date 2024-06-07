package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Swipescaleviews 
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
		dc.setCapability("appium:appPackage","com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appium:appActivity", "com.davemorrissey.labs.subscaleview.sample.MainActivity");
		URL u=new URI("http://localhost:4723").toURL();
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/viewPagerGalleries")).click();
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("left",37,"top",100,"width",723,"height",100,"direction","right","percent",0.75));
		
}
}
