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

public class Zoominzoomout
{
	@Test
public void zoomInAndZoomout() throws MalformedURLException, URISyntaxException, InterruptedException
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
	driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/eventHandling")).click();
	WebElement element=driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"percent",0.74));
}
}
