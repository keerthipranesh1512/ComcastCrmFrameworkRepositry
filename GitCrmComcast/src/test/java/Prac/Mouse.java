package Prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("manager");
	driver.findElement(By.id("submitButton")).click();
	
	WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	WebElement ele1=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	//Actions act1=new Actions(driver);
	act.click(ele1).perform();
}
}
