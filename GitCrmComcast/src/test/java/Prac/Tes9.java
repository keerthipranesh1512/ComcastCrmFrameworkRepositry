package Prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes9 {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	//drtdyh;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
	
	driver.close();
	
}
}
