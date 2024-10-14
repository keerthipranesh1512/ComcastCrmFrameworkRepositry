 package Prac;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("manager");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys("pooo");
	driver.findElement(By.xpath("//img[@alt='Select']")).click();

	
	Set<String> child=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(child);
	int count=al.size();
	for(int i=0;i<count;i++)
	{
		String win=al.get(i);
		WebDriver ctr=driver.switchTo().window(win);
		 String actUrl=driver.getCurrentUrl();
		 if(actUrl.contains("Popup&popuptype"))
		 {
			 ctr.close();
		 }

			Set<String> parent=driver.getWindowHandles();
			ArrayList<String> al1=new ArrayList<String>(parent);
			int count1=al1.size();
			for(int j=0;j<count1;j++)
			{
				String wins=al1.get(j);
				WebDriver ptr=driver.switchTo().window(wins);
				 String acUrl=driver.getCurrentUrl();
				 if(acUrl.contains("module=Accounts"))
				 {
					 ptr.close();
				 }
	}
}
}}
