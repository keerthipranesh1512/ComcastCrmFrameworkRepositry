package Prac;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddToCart {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
	driver.findElement(By.id("nav-search-submit-button")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 1000)");

	driver.findElement(By.xpath("//span[contains(text(),'Skybags Casual Backpack 28L, 2 Main Compartments, ')]")).click();
	
	
	Set<String> child=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(child);
	int count=al.size();
	for(int i=0;i<count;i++)
	{
		String win=al.get(i);
		driver.switchTo().window(win);
	driver.findElement(By.id("buy-now-button")).click();}
	// ctr.close();}
	/* String actUrl=driver.getCurrentUrl();
		 if(actUrl.contains("Skybags-Brat-Black-Casual-Backpack"))
		 {
			 ctr.close();
			 
		 }
}
	/**switching back to parent**/
	/*Set<String> parent=driver.getWindowHandles();
	ArrayList<String> a=new ArrayList<String>(parent);
	int coun=a.size();
	for(int j=0;j<coun;j++)
	{
		String win=al.get(j);
		WebDriver ptr=driver.switchTo().window(win);
	driver.findElement(By.id("add-to-cart-button")).click();}
/*	 String actUrl=driver.getCurrentUrl();
		 if(actUrl.contains("Skybags-Brat-Black-Casual-Backpack"))
		 {
			 ctr.close();
			 
		 }
}*/
	
	
	/**navigate to cart page from home page**/
	driver.findElement(By.id("nav-cart-count")).click();
	//List<WebElement> ele=driver.findElements(By.xpath("//*"));
	//int count=ele.size();
	//System.out.println(count);
	/*for(int i=0;i<count;i++)
	{
		WebElement elems=ele.get(i);
		String text=elems.getText();
		System.out.println(text);
	}*/ 
	
}
}
