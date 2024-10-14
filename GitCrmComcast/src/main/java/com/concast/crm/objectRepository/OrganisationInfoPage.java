package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author pranesh
 * contains organizationInfo page elements
 */
public class OrganisationInfoPage {

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement orginfo;

	@FindBy(className = "dvtCellInfo")
	private WebElement orgname;

	@FindBy(id = "dtlview_Industry")
	private WebElement actind;
	@FindBy(id = "dtlview_Type")
	private WebElement acttype;

	@FindBy(id = "mouseArea_Phone")
	private WebElement actph;

	public OrganisationInfoPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getActph() {
		return actph;
	}

	public WebElement getActind() {
		return actind;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getActtype() {
		return acttype;
	}

	public WebElement getOrginfo() {
		return orginfo;
	}

}
