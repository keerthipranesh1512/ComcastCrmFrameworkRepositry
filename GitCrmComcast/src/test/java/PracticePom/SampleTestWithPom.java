package PracticePom;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SampleTestWithPom {
	@FindBy(name="user_name")
	 WebElement un;

	@FindBy(name="user_password")
	 WebElement pwd;
	@FindBy(id="submitButton")
	WebElement btn;

	@Test
	public void Sample() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		SampleTestWithPom p=PageFactory.initElements(driver, SampleTestWithPom .class);
		
		
		p.un.sendKeys("admin");
		p.pwd.sendKeys("manager");
		p.btn.click();

		driver.navigate().refresh();
		p.un.sendKeys("admin");
		p.pwd.sendKeys("manager");
		p.btn.click();
	}

}
