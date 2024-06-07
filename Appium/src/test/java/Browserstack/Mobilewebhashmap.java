package Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Mobilewebhashmap 
{
	public static final String username="avanishdubey_7sDq3n";
	public static final String accessKey="ai2kxYA6dfXn22y4rdah";
	public static final String url="http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
public void mobilebrowsertesting() throws MalformedURLException, URISyntaxException
{
		//working
	MutableCapabilities capabilities=new MutableCapabilities();
	HashMap<String, Object> browserstackoptions=new HashMap<String, Object>();
	browserstackoptions.put("browserName","chrome");
	browserstackoptions.put("deviceName","Google Pixel 6 Pro");
	browserstackoptions.put("realMobile","true");
	browserstackoptions.put("osVersion","13");
	capabilities.setCapability("bstack:options", browserstackoptions);
	WebDriver driver=new RemoteWebDriver(new URI(url).toURL(),capabilities);
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
}
}
