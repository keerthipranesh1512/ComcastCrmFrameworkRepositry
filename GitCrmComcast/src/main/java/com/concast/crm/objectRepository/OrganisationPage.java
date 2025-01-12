package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author pranesh
 * contains organizations page elements
 */
public class OrganisationPage {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement orgbtn;
	
	@FindBy(name = "search_text")
	private WebElement searchedt;
	@FindBy(name = "search_field")
	private WebElement drop;
	
	@FindBy(name = "submit")
	private WebElement searchbtn;
	
	public  OrganisationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrgbtn() {
		return orgbtn;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getSearchedt() {
		return searchedt;
	}
	public WebElement getDrop() {
		return drop;
	}

}
