package PracticePom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestWithoutPom {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement ele1=driver.findElement(By.name("user_name"));
	ele1.sendKeys("admin");
	WebElement ele2=driver.findElement(By.name("user_password"));
	ele2.sendKeys("manager");
	WebElement ele3=driver.findElement(By.id("submitButton"));
	ele3.click();
	driver.navigate().refresh();
	ele1.sendKeys("admin");
	ele2.sendKeys("manager");
	ele3.click();
}
}
