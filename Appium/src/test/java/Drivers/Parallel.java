package Drivers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Parallel 
{
	@Parameters("deviceName,UDID,port")
	@Test
public void demo() throws MalformedURLException, URISyntaxException
{
		File f=new File("C:\\Users\\avani\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		service.start();
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
		
}
}
