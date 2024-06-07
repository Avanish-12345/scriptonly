package Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class webBrowser 
{
	public static final String username="avanishdubey_7sDq3n";
	public static final String accessKey="ai2kxYA6dfXn22y4rdah";
	public static final String url="http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void webbrowser() throws MalformedURLException, URISyntaxException
	{
		//not working
		DesiredCapabilities dc=new DesiredCapabilities();	
		dc.setCapability("os", "windows");
		dc.setCapability("os_version", "11");
		dc.setCapability("browser", "chrome");
		dc.setCapability("browser_version", "117");
		dc.setCapability("name", "browser");
		WebDriver driver=new RemoteWebDriver(new URI(url).toURL(),dc);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}


}
