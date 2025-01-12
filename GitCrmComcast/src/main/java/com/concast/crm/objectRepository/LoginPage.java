package com.concast.crm.objectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author pranesh
 * 
 * Contains Login Page elements & business lib like login()
 */

public class LoginPage {
	WebDriver driver;
	@FindBy(name="user_name")
	private WebElement untf;
	@FindBy(name="user_password")
	private WebElement pwd;
	@FindBy(id="submitButton")
	private WebElement btn;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntf() {
		return untf;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getBtn() {
		return btn;
	}
	/**
	 *login to application using username,pass arguments
	 * @param username
	 * @param pass
	 */
	public void App(String username,String pass)
	{
		untf.sendKeys(username);
		pwd.sendKeys(pass);
		btn.click();
	}

}
