package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp
{
	@Test
public void demo() throws MalformedURLException, URISyntaxException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability("platformName", "android");
dc.setCapability("appium:automationName","uiAutomator2");
dc.setCapability("appium:deviceName", "vivo 1902");
dc.setCapability("appium:UDID","LNJV7DSCGAS8LFBU");
dc.setCapability("appium:noReset", true);
dc.setCapability("appium:ignoreHiddenApiPolicyError",true);
dc.setCapability("appium:autoGrantPermisions",true);

dc.setCapability("appium:appPackage", "com.android.bbkcalculator");
dc.setCapability("appium:appActivity","com.android.bbkcalculator.Calculator");
//dc.setCapability("appium:appPackage","io.appium.android.apis");
//dc.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");

URL u=new URI("http://localhost:4723").toURL();
AndroidDriver driver=new AndroidDriver(u,dc);
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/clear")).click();

//WebElement firstdigit=driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/digit7"));
//firstdigit.click();
//String d=firstdigit.getText();
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/plus")).click();
//WebElement seconddigit=driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/digit8"));
//seconddigit.click();
//String e=seconddigit.getText();
//WebElement result=driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/result_text"));
//System.out.println("sum of "+d+"and" +e+"=" +result.getText());
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/clear")).click();
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/digit4")).click();
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/minus")).click();
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/digit1")).click();
//WebElement totalminus=driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/result_text"));
//System.out.println("minus=" +totalminus.getText());
//driver.findElement(AppiumBy.id("com.android.bbkcalculator:id/clear")).click();
//driver.indElement(AppiumBy.accessibilityId("Accessibility")).click();
//driver.findElement(AppiumBy.accessibilityId("Text")).click();
driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Views']")).click();



}
}
