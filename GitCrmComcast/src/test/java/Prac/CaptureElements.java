package Prac;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureElements {
	public static void main(String[] args) throws Exception
	{
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opts);
		driver.get("https://www.flipkart.com");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/**to enter the element in search tab**/
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("bottle");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.className("EwE-Fa")).click();

		/*List<WebElement> eel=driver.findElements(By.xpath("//img"));
		int count=eel.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement ee=eel.get(i);
			String text=ee.getText();
			System.out.println(text);
		}*/
	
		Actions act=new Actions(driver);
		WebElement drop=driver.findElement(By.xpath("//div[@class='bpjkJb']/span[5]"));
		act.moveToElement(drop).perform();
		act.click(drop).perform();
		
		WebElement toys=driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		toys.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'KAVANA Remote Control Rechargable 360° Twisting Stunt C...')]")).click();

		Set<String> child=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(child);
		int coun=al.size();
		WebDriver ctr=driver;
		for(int i=0;i<coun;i++)
		{
			String win=al.get(i);
		 ctr=driver.switchTo().window(win);
		
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1700)");
		

		
	//	driver.navigate().forward();
//		ctr.close();
		//driver.switchTo().window(al.get(0));
		Thread.sleep(20000);
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement buyNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Buy Now')]")));
        buyNowButton.click();
        ////button[text()='Add to cart']
		//driver.quit();
		/*WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
		act.moveToElement(cart).perform();
		cart.click();
		driver.findElement(By.className("fk-modal-visible")).click();
		
		WebElement log=driver.findElement(By.xpath("//a[text()='Login']"));
		act.moveToElement(log).perform();
		WebElement dop=driver.findElement(By.xpath("//div[contains(@class,'tP+nZg _2E9UgX')]"));
		act.click(dop).perform();*/
	}
}