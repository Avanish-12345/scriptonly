package Drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class appinstall
{
	@Test
public void appinstall() throws MalformedURLException, URISyntaxException
{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("appium:automationName","uiAutomator2");
		dc.setCapability("appium:deviceName", "vivo 1902");
		dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
		dc.setCapability("appium:noReset", true);
		dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
		dc.setCapability("appium:autoGrantPermisions",true);
		//dc.setCapability("unlockType","pin");
		//dc.setCapability("unlockKey", "2580");
		URL u=new URI("http://localhost:4723").toURL();
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		//driver.installApp("C:\\Users\\avani\\Downloads\\General-Store.apk");
		if(driver.isAppInstalled("com.androidsample.generalstore"))
		{
			System.out.println("App is installed");
		}
		else
		{
			System.out.println("app is not installed");
		}
		//driver.removeApp("com.androidsample.generalstore");//uninstall the app
		System.out.println(driver.queryAppState("com.androidsample.generalstore"));
		driver.activateApp("com.androidsample.generalstore");//launch the app
		System.out.println(driver.queryAppState("com.androidsample.generalstore"));
		driver.runAppInBackground(Duration.ofSeconds(10));//to run the app in background
		System.out.println(driver.queryAppState("com.androidsample.generalstore"));//check whether the app is running in background or foreground
		
		
		
		
}
}
