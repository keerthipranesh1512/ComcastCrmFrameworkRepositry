package Prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test8 {
@Test(dataProvider = "getData")
public void de(String brandname,String Product)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	String x="//span[text()='"+Product+"']/../../../../div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]";
	String price=driver.findElement(By.xpath(x)).getText();
	System.out.println(price);
}

@DataProvider
public Object[][] getData()
{
	Object[][] ob=new Object[3][2];
	ob[0][0]="iphone";
	ob[0][1]="Apple iPhone 15 (128 GB) - Black";
	ob[1][0]="iphone";
	ob[1][1]="Apple iPhone 13 (128GB) - Midnight";
	ob[2][0]="iphone";
	ob[2][1]="Apple iPhone 13 (128GB) - Blue";
	return ob;
}
}
