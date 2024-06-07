package Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class demo
//mobile app
{
	public static final String username="avanishdubey_7sDq3n";
	public static final String accessKey="ai2kxYA6dfXn22y4rdah";
	public static final String url="http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
public void scriptbrowserstack() throws MalformedURLException, URISyntaxException
{
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability("os_version", "13.0");
	capabilities.setCapability("deviceName", "Samsung Galaxy S23");
	capabilities.setCapability("app", "bs://ab49f33689521fc6638dcac43a5045fe52c10340");
	capabilities.setCapability("project", "SDET55");
	capabilities.setCapability("build", "build 1.2.3");
	capabilities.setCapability("name", "demo");
	AndroidDriver driver=new AndroidDriver(new URI(url).toURL(),capabilities);
	
	
}
}
