package Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Mobileweb
{
	public static final String username="avanishdubey_7sDq3n";
	public static final String accessKey="ai2kxYA6dfXn22y4rdah";
	public static final String url="http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
public void mobileWeb() throws MalformedURLException, URISyntaxException
{
		//not working
	MutableCapabilities dc=new MutableCapabilities();
	dc.setCapability("deviceName","Google Pixel 7");
	dc.setCapability("browserName","Chrome");
	dc.setCapability("platformName","Android");
	dc.setCapability("platformVersion","13");
	dc.setCapability("build","1.0.8");
	dc.setCapability("name","MobileWeb");
	WebDriver driver=new RemoteWebDriver(new URI(url).toURL(),dc);
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
}
}
