package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product {
	WebDriver driver;
	@FindBy(linkText = "Organizations")
	private WebElement org;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;
}
