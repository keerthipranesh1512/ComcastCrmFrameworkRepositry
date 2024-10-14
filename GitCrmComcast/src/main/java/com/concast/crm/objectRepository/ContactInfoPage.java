package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author pranesh
 * contains contact info page elements
 */
public class ContactInfoPage {
	WebDriver driver = null;
	@FindBy(id = "mouseArea_Last Name")
	private WebElement actlastname;

	@FindBy(id = "dtlview_Support Start Date")
	private WebElement actstart;

	@FindBy(id = "mouseArea_Support End Date")
	private WebElement actend;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement actcontact;

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement actorgname;

	public ContactInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getActlastname() {
		return actlastname;
	}

	public WebElement getActstart() {
		return actstart;
	}

	public WebElement getActend() {
		return actend;
	}

	public WebElement getActcontact() {
		return actcontact;
	}

	public WebElement getActorgname() {
		return actorgname;
	}
}
