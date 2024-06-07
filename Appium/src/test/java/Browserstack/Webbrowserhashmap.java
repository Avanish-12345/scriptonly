package Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Webbrowserhashmap
{
	public static final String username="avanishdubey_7sDq3n";
	public static final String accessKey="ai2kxYA6dfXn22y4rdah";
	public static final String url="http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void webBrowsertesting() throws MalformedURLException, URISyntaxException
	//working
	{
		ChromeOptions browseroptions=new ChromeOptions();
		browseroptions.setPlatformName("Windows 11");
		browseroptions.setBrowserVersion("latest");
		HashMap<String, Object> sauceOptionsoptions=new HashMap<String, Object>();
		sauceOptionsoptions.put("username",username);
		sauceOptionsoptions.put("accessKey",accessKey);
		sauceOptionsoptions.put("build","selenium-build-GME35");
		sauceOptionsoptions.put("name","<get title of the webpage");
		browseroptions.setCapability("sauce:options", sauceOptionsoptions);
		RemoteWebDriver driver=new RemoteWebDriver(new URI(url).toURL(),browseroptions);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
}
