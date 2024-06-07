package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class doubleClick 
{
	@Test
public void clicks() throws MalformedURLException, URISyntaxException
{
	String path="C:\\Users\\avani\\Downloads\\com.davemorrissey.labs.subscaleview.sample.apk";
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName", "android");
	dc.setCapability("appium:automationName","uiAutomator2");
	dc.setCapability("appium:deviceName", "vivo 1902");
	dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
	dc.setCapability("appium:noReset", true);
	dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
	dc.setCapability("appium:autoGrantPermisions",true);
	dc.setCapability("app", path);
	URL u=new URI("http://localhost:4723").toURL();
	//AndroidDriver driver=new AndroidDriver(u,dc);
	AppiumDriver driver = new AppiumDriver(u,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
	driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	WebElement element=driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	((JavascriptExecutor)driver).executeScript("mobile:doubleClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
	
}
}
