package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Hmassignment 
{
	@Test
public void Handm() throws MalformedURLException, URISyntaxException
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
		String text=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Rs. 799.00']")).getText();
		System.out.println(text);
		String parts []=text.split("\\D+");
		int value=Integer.parseInt(parts[1]);
		System.out.println(value);
		driver.findElement(AppiumBy.accessibilityId("Your Shopping Bag")).click();
		
		

		
}
}
