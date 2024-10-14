package Prac;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static void main(String[] args) throws Exception
	{
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opts);
		driver.get("https://www.flipkart.com");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		/**to enter the element in search tab**/
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("bottle");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.className("EwE-Fa")).click();
	
		/**to find the element**/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("(//a[contains(text(),'pexpo Sports and Hiking Stainless Steel Water Bottle, C...')])[1]")).click();
		
		Set<String> child=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(child);
		int count=al.size();
	
		for(int i=0;i<count;i++)
		{
			String win=al.get(i);
			driver.switchTo().window(win);
		
		}
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,300)");
		
	
		/** Adding to car**/
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']"))).click();
	//WebElement ele=driver.findElement(By.xpath("//button[text()='Add to cart']"));
	//js.executeScript("arguments[0].scrollIntoView();",ele);
	//ele.click();
		/**how to close the child window**/
		/**to switch back to parent**/
	driver.switchTo().window(al.get(0));
		
	}

}

