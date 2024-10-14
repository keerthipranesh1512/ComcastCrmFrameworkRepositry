package Prac;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.id("nav-search-submit-button")).click();

driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')])[1]")).click();
Set<String> windows = driver.getWindowHandles();
ArrayList<String> al = new ArrayList<>(windows);
int count=al.size();
for(int i=0;i<count;i++)
{
	String win=al.get(i);
	driver.switchTo().window(win);
}
//driver.switchTo().window(al.get(1));
driver.manage().window().maximize();
// Add the item to the cart
/*WebDriverWait ew=new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement ele=driver.findElement(By.name("submit.add-to-cart"));
ew.until(ExpectedConditions.visibilityOf(ele)).click();*/
List<WebElement> eele=driver.findElements(By.xpath("//*"));
int coun=eele.size();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,700)");
driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();

	}

}
