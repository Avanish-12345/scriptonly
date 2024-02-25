package GitAgoda;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class agodaFirstSection 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.agoda.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.titleIs("Agoda Official Site | Free Cancellation & Booking Deals | Over 2 Million Hotels"));
	Actions action=new Actions(driver);
	WebElement poplinks=driver.findElement(By.xpath("//button[text()='No thanks']"));
	poplinks.click();
	WebElement selecttextfield=driver.findElement(By.xpath("//input[@aria-label='Enter a destination or property']"));
	selecttextfield.click();
	Thread.sleep(4000);
	WebElement selectbanglore=driver.findElement(By.xpath("//div[contains(@class,'a7c88-box a7c88-text-inherit a7c88-fill-inherit')]//p[text()='Bangalore']"));
	//action.moveToElement(selectbanglore).pause(4000).click().build().perform();
	action.click(selectbanglore).pause(4000).build().perform();
	
}
}
