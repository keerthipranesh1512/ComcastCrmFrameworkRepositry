package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author pranesh
 * contains create new organization page elements and business utility
 */
public class CreateNewOrganisationPage {
	

	@FindBy(name = "accountname")
	private WebElement name;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement btn;

	@FindBy(name = "industry")
	private WebElement ind;

	@FindBy(name = "accounttype")
	private WebElement type;
	
	@FindBy(name = "phone")
	private WebElement phone;
	
	public CreateNewOrganisationPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getName() {
		return name;
	}
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getPhone() {
		return phone;
	}
	/**
	 * enter the org name using org argument
	 * @param org
	 */
	public void enterOrgName(String org) {
		name.sendKeys(org);
		btn.click();
	}
	
	/**
	 *  enter the org name using org,industry arguments
	 * @param org
	 * @param industry
	 */
	public void enterOrgName(String org,String industry)
	{
	Select s=new Select(ind);
	name.sendKeys(org);
	s.selectByVisibleText(industry);
	btn.click();
	}
	/**
	 *  enter the phone using oname,ph arguments
	 * @param oname
	 * @param ph
	 */
	public void enterPhone(String oname,String ph)
	{
		name.sendKeys(oname);
		phone.sendKeys(ph);
		btn.click();
	}
}
