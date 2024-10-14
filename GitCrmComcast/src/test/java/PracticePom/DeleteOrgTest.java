package PracticePom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.concast.crm.fileutility.ExcelUtility;
import com.concast.crm.fileutility.FileUtility;
import com.concast.crm.objectRepository.CreateNewOrganisationPage;
import com.concast.crm.objectRepository.HomePage;
import com.concast.crm.objectRepository.LoginPage;
import com.concast.crm.objectRepository.OrganisationInfoPage;
import com.concast.crm.objectRepository.OrganisationPage;
import com.concast.crm.webdriverutility.JavaUtility;
import com.concast.crm.webdriverutility.WebdriverUtility;

public class DeleteOrgTest {
	public static void main(String[] args) throws Exception
	{
	FileUtility flib=new FileUtility();
	ExcelUtility elib=new ExcelUtility();
	JavaUtility jlib=new JavaUtility();
WebdriverUtility wlib=new WebdriverUtility();

	String Browser=flib.readDataFromProperties("browser");
	String Url=flib.readDataFromProperties("url");
	String Username=flib.readDataFromProperties("username");
	String Pass=flib.readDataFromProperties("password");

	String orgname=elib.readDataFromExcel("org", 10, 2)+jlib.getRandomno();
//	String indus=elib.readDataFromExcel("org", 1, 3)+jlib.getRandomno();
	WebDriver driver=null;

	if(Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(Url);
	LoginPage lp=new LoginPage(driver);
	 //LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	//lp.getUntf().sendKeys("admin");
	//lp.getPwd().sendKeys("manager");
	//lp.getBtn().click();

	lp.App("admin", "manager");

	HomePage hp=new HomePage(driver);
	hp.getOrg().click();

	OrganisationPage og=new OrganisationPage(driver);
	og.getOrgbtn().click();

	CreateNewOrganisationPage cp=new CreateNewOrganisationPage(driver);
	cp.enterOrgName(orgname);
	cp.getBtn().click();


	OrganisationInfoPage or=new OrganisationInfoPage(driver);

	String act=or.getOrginfo().getText();
	if(act.contains(orgname))
	{
		System.out.println(orgname + "testcase is pass");
	}else
	{
		System.out.println(orgname + "testcase is fail");	
	}
	
	hp.getOrg().click();//go back again to org link
og.getSearchedt().sendKeys(orgname);
wlib.select(og.getDrop(), "Organization Name");
og.getSearchbtn().click();

driver.findElement(By.xpath("//a[text()='"+orgname+"']/../../td[8]/a[text()='del']")).click();
	hp.quit();;
	}

}
