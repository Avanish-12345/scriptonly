package GitAgoda;

import java.sql.Driver;
import java.time.Duration;
import java.time.LocalDateTime;

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
	Actions action=new Actions(driver);
	WebElement poplinks=driver.findElement(By.xpath("//button[text()='No thanks']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOf(poplinks));
	poplinks.click();
	WebElement selecttextfield=driver.findElement(By.xpath("//input[@aria-label='Enter a destination or property']"));
	selecttextfield.click();
	Thread.sleep(4000);
	WebElement selectbanglore=driver.findElement(By.xpath("//p[text()='Bangalore']"));
	action.moveToElement(selectbanglore).pause(4000).click(selectbanglore).build().perform();
	WebElement previousmonthclick=driver.findElement(By.xpath("//button[@aria-label='Previous Month']"));
	action.click(previousmonthclick).pause(2000).build().perform();
	LocalDateTime time=LocalDateTime.now();
	int day=time.getDayOfMonth();
	int year=time.getYear();
	String frommonth=time.getMonth().toString().toLowerCase();
	frommonth=(frommonth.substring(0,1)).toUpperCase()+frommonth.substring(1,frommonth.length());
	System.out.println(day+" "+frommonth+" "+year);
    int day2=time.plusDays(1).getDayOfMonth();
    System.out.println(day2+" "+frommonth+" "+year);
	WebElement fromday=driver.findElement(By.xpath("//div[text()='"+frommonth+" "+year+"']/..//span[text()="+day+"]"));
	action.click(fromday).pause(2000).build().perform();
	WebElement toDay=driver.findElement(By.xpath("//div[text()='"+frommonth+" "+year+"']/..//span[text()="+day2+"]"));
	action.click(toDay).pause(2000).build().perform();
	
	
	
	
}
}
