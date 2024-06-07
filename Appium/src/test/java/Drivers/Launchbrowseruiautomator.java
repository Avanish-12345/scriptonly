package Drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Launchbrowseruiautomator 
{
	//this script is not running for launching browser
	@Test
public void uiAutomator() throws MalformedURLException, URISyntaxException
{
	UiAutomator2Options options=new UiAutomator2Options();
	options.setPlatformName("Android");
	options.setDeviceName("vivo 1902");
	options.setAutomationName("uiAutomator2");
	options.setCapability("browserName","chrome");
	options.ignoreHiddenApiPolicyError();
	options.autoGrantPermissions();
	options.autoWebview();
	options.noReset();
	URL u=new URI("http://localhost:4723").toURL();
	AndroidDriver driver=new AndroidDriver(u,options);
	driver.get("https://www.wikipedia.org/");
	System.out.println(driver.getTitle());
	
	
	
	
}
}
