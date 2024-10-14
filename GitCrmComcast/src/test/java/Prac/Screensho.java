package Prac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensho {
public static void main(String[] args) throws IOException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement section=driver.findElement(By.xpath("//img[@alt='Great Indian Festival']"));
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=section.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshot/defect2.png");
	FileHandler.copy(src, perm);
	
}
}
