package Prac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup {
	public static void main(String[] args) throws Exception {
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
	
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");

		driver.navigate().to("https://amazon.in");
		// Alert pop=driver.switchTo().alert();
		// pop.accept();

		// String text=pop.getText();
		// System.out.println(text);
		// pop.accept();

		
//	WebDriverWait ew=new WebDriverWait(driver,Duration.ofSeconds(20));
		ew.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		driver.navigate().refresh();
		driver.navigate().back();
	}
}
