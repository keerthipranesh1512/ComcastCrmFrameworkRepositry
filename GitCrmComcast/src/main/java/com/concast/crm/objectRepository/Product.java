package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	@FindBy(linkText = "Contacts")
	private WebElement contact;
	@FindBy(linkText = "Productions")
	private WebElement product;
	public Product(WebDriver driver)
	{
	
		PageFactory.initElements(driver,this);
	}
}
