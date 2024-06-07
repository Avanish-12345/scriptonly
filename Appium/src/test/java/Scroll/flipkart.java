package Scroll;

import java.awt.RenderingHints.Key;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class flipkart 
{
	@Test
public void gettext() throws MalformedURLException, URISyntaxException, InterruptedException
{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("appium:automationName","uiAutomator2");
		dc.setCapability("appium:deviceName", "vivo 1902");
		dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
		dc.setCapability("appium:noReset", true);
		dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
		dc.setCapability("appium:autoGrantPermisions",true);
		dc.setCapability("browserName", "chrome");
		URL u=new URI("http://localhost:4723").toURL();
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		driver.get("https://www.flipkart.com/");
		String phoneText="";
		String priceText="";
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[text()='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone15"
				+Keys.ENTER);
		//ArrayList<String> list= new ArrayList<String>();
		List<WebElement> phonesName = driver.findElements(By.xpath("//div[@class='css-1rynq56 r-8akbws r-krxsd3 r-dnmrzs r-1udbk01']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='css-1rynq56 r-8akbws r-krxsd3 r-dnmrzs r-1udbk01']/../..//div[contains(text(),'₹')]"));
		for (WebElement eachName : phonesName) {
			
			 
			for (WebElement eachPrice : price) {
				phoneText = eachName.getText();
				 priceText = eachPrice.getText();
				 System.out.println(phoneText+" "+priceText);
				 
			}
			
			
		}
		
		TreeMap<String, String> map= new TreeMap<String, String>();
		for (int i = 0; i < phoneText.length(); i++) {
			map.put(phoneText,priceText );
		}
		System.out.println(map);
		
		
		
}
}
