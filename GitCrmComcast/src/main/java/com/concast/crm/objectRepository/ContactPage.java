package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author pranesh
 * contains contact page elements
 */
public class ContactPage {
@FindBy(xpath = "//img[@title='Create Contact...']")
private WebElement contactbtn;

public ContactPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getContactbtn() {
	return contactbtn;
}
}
