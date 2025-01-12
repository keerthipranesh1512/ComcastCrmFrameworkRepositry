package Prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws AWTException
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("manager");
	driver.findElement(By.id("submitButton")).click();
	
	
	WebElement ele=driver.findElement(By.id("qccombo"));
	Select s=new Select(ele);
	s.getFirstSelectedOption();
	//s.selectByVisibleText("New Contact");
	//s.selectByValue("Contacts");
	//s.selectByIndex(1);
	/*List<WebElement> opts=s.getOptions();
	int count=opts.size();
for(int i=0;i<count;i++)
{
	WebElement opt=opts.get(i);
	String text=opt.getText();
	System.out.println(text);
}*/
	
	
}
}
