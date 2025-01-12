package Prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\pranesh\\Desktop\\Practice\\Data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String Browser = pro.getProperty("browser");
		String Url = pro.getProperty("url");
		String Username = pro.getProperty("username");
		String Pass = pro.getProperty("password");

		Random ran = new Random();
		int rano = ran.nextInt(500);

		FileInputStream fis1 = new FileInputStream("C:\\Users\\pranesh\\Desktop\\Practice\\prac.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("pra");
		Row rw = sh.getRow(1);
		Cell cel = rw.getCell(0);
		String orgname = cel.getStringCellValue() + rano;

		WebDriver driver = null;
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(Pass);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.name("button")).click();
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		act.moveToElement(ele).perform();	
		
		WebElement signoutLnk = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signoutLnk.click();
		
		System.out.println("logged out successfully !!!");
	
		driver.quit();
		WebElement ele1=driver.findElement(By.className("crmbutton small edit"));
		//act.scrollToElement(ele1).perform();

	}
		
}
