package Drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Pressandroidenumkey 
{
	@Test
	public void androidEnumKey() throws MalformedURLException, URISyntaxException, InterruptedException
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
	driver.pressKey(new KeyEvent(AndroidKey.SEARCH));
	Thread.sleep(4000);
	driver.hideKeyboard();
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
	driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.VOLUME_MUTE));
	//driver.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_DOWN));
	//driver.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_UP));
	driver.pressKey(new KeyEvent(AndroidKey.CALCULATOR));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
}
}