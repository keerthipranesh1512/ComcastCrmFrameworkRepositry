package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.concast.crm.webdriverutility.WebdriverUtility;

/**
 * @author pranesh
 * contains home page elements and business libraries like quit
 */
public class HomePage{
	WebDriver driver;
	@FindBy(linkText = "Organizations")
	private WebElement org;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy(linkText = "Contacts")
	private WebElement contact;
	
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrg() {
		return org;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getContact() {
		return contact;
	}
	/**
	 * logout of the app
	 */
	public void quit()
	{
		/*WebdriverUtility wlib=new WebdriverUtility();
		wlib.mouseMoveOnElement(driver, logout);*/
		Actions act=new Actions(driver);
		act.moveToElement(logout).perform();
		signout.click();
	}
}
