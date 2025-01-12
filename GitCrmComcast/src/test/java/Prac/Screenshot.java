package Prac;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
@Test
public void demo(Method mtd) throws Exception {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	String test=mtd.getName();
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File src=edriver.getScreenshotAs(OutputType.FILE);
	File dst=new File("./Screenshot/"+test+".png");
		FileUtils.copyFile(src, dst);
		driver.quit();
}
}
