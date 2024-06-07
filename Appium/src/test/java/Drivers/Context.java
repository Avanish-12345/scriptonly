package Drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Context 
{
	@Test
public void contextwork() throws MalformedURLException, URISyntaxException, InterruptedException
{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName","uiAutomator2");
		dc.setCapability("appium:deviceName", "vivo 1902");
		dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
		dc.setCapability("appium:noReset", true);
		dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
		dc.setCapability("appium:autoGrantPermisions",true);
		URL u=new URI("http://localhost:4723").toURL();
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		driver.activateApp("com.androidsample.generalstore");//launch the app
		//driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Avanish");
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		Set<String> cons = driver.getContextHandles();
		Thread.sleep(2000);
		System.out.println(cons.size());
		for(String con:cons)
		{
			System.out.println(con);
			driver.context("WEBVIEW_com.androidsample.generalstore");
			
		}
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("appium");
		
		
		
		
}
}
