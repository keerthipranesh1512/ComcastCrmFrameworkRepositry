package com.concast.crm.webdriverutility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

/**
 * @author pranesh
 * contains utility object methods
 */
public class UtilityClassObject {
public static ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();
public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();//share the driver object also

public static ExtentTest getTest()
{
	return test.get();
}
public static void setTest(ExtentTest actTest)
{
	test.set(actTest);
}

public static WebDriver getDriver()
{
	return driver.get();
}
public static void setTest(WebDriver actDriver)
{
	driver.set(actDriver);
}

}
