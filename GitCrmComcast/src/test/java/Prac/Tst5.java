package Prac;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tst5 {
	@Test
	public void sampleTest() { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement ele = driver.findElement(By.xpath("//a[text()='Gift Ideas	']"));
		ew.until(ExpectedConditions.visibilityOf(ele)).click();
		driver.findElement(By.xpath("//span[text()='Kids']")).click();
		driver.findElement(By.xpath(
				"//div[contains(text(),'Oboe Silicone TV Remote Cover Compatible with Sony Bravia Smart Tv 2023 Voice Remote RMF-TX910')]"));
		driver.findElement(By.xpath("(//div[@class='_cDEzb_p13n-sc-css-line-clamp-2_EWgCb'])[1]")).click();

		Set<String> child = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(child);
		int count = al.size();
		for (int i = 0; i < count; i++) {
			String win = al.get(i);
			driver.switchTo().window(win);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains("https://www.amazon.in/Silicone-Compatible-RMF-TX910U-Protective")) {
				break;
			}
		}

	}
}
