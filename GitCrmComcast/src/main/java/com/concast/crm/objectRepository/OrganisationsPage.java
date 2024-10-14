package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author pranesh
 * contains organization page elements and business lib
 */
public class OrganisationsPage {
@FindBy(name = "search_text")
private WebElement search;
@FindBy(name = "search")
private WebElement btn;
public OrganisationsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public WebElement getSearch() {
	return search;
}
public WebElement getBtn() {
	return btn;
}
/**
 * enter the org name using name
 * @param name
 */
public void enterOrg(String name)
{
	search.sendKeys(name);
	btn.click();
}
}
