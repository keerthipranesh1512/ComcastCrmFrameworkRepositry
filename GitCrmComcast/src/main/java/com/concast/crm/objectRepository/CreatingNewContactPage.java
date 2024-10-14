package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.concast.crm.webdriverutility.JavaUtility;
import com.concast.crm.webdriverutility.WebdriverUtility;

/**
 * @author pranesh
 * contains create new contact page elements and business utility
 */
public class CreatingNewContactPage {
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(name = "account_name")
	private WebElement org;
	@FindBy(name = "support_start_date")
	private WebElement startdate;
	@FindBy(name = "support_end_date")
	private WebElement enddate;
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement orgplus;

	@FindBy(name = "button")
	private WebElement btn;
	WebDriver driver;

	public CreatingNewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getOrgplus() {
		return orgplus;
	}

	public void enterLast(String name) {
		lastname.sendKeys(name);
		btn.click();

	}
	/**
	 * enter the lastname using name,days arguments
	 * @param name
	 * @param days
	 */

	public void enterLast(String name, int days) {
		JavaUtility jlib = new JavaUtility();
		jlib.getSysDate();
		jlib.endDate(days);
		lastname.sendKeys(name);
		btn.click();
	}
	/**
	 *  enter the org name using name argument
	 * @param name
	 */

	public void createorg(String name) {
		WebdriverUtility wlib = new WebdriverUtility();
		lastname.sendKeys(name);
		orgplus.click();
		wlib.switchToTab(driver, "module=Accounts");
	}
}
