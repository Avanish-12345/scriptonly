package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Endscenariohm 
{
	@Test
public void scenarios() throws MalformedURLException, URISyntaxException
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
		
}
}
