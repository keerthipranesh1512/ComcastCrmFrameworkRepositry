package com.concast.crm.webdriverutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author pranesh
 * contains webdriver methods 
 */
public class WebdriverUtility {
	/**
	 * to calculate implicit wait using driver argument
	 * @param driver
	 */
	  public void waitImp(WebDriver driver)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  }
	  /**
	   *  to calculate explicit wait using driver,element arguments
	   * @param driver
	   * @param element
	   */
	  public void waitExp(WebDriver driver,WebElement element)
	  {
		  WebDriverWait ew=new WebDriverWait(driver, Duration.ofSeconds(20));
		  ew.until(ExpectedConditions.visibilityOf(element));
	  }
	  /**
	   * to switch tab  using driver,pUrl arguments
	   * @param driver
	   * @param pUrl
	   */
	  public void switchToTab(WebDriver driver,String pUrl)
	  {
		 Set<String> set = driver.getWindowHandles();
		 Iterator<String> it=set.iterator();
		 while(it.hasNext())
		 {
			 String winid=it.next();
			 driver.switchTo().window(winid);
			 
			 String actUrl=driver.getCurrentUrl();
			 if(actUrl.contains("module=Accounts"))
			 {
				 break;
			 }
		 }
	  }
	  
	  /**
	   * to switch the frame using driver,index arguments
	   * @param driver
	   * @param index
	   */
	  public void switchToFrame(WebDriver driver,int index)
	  {
		  driver.switchTo().frame(index);
	  }
	  /**
	   * to switch the frame using driver,nameId arguments
	   * @param driver
	   * @param nameId
	   */
	  public void switchToFrame(WebDriver driver,String nameId)
	  {
		  driver.switchTo().frame(nameId);
	  }
/**
 * to switch the frame using driver,element arguments
 * @param driver
 * @param element
 */
	  public void switchToFrame(WebDriver driver,WebElement element)
	  {
		  driver.switchTo().frame(element);
	  }
	  /**
	   * to handle alert using driver argument
	   * @param driver
	   */
	  public void switchToAlert(WebDriver driver)
	  {
		  driver.switchTo().alert().accept();
	  }
	  /**
	   * to handle alert using driver argument
	   * @param driver
	   */
	  public void switchToAlertandCancel(WebDriver driver)
	  {
		  driver.switchTo().alert().dismiss();
	  }
	  /**
	   * to handle dropdown using element,text arguments
	   * @param element
	   * @param text
	   */
	  public void select(WebElement element,String text)
	  {
		  Select s=new Select(element);
		  s.selectByVisibleText(text); 
	  }
	  /**
	   * to handle dropdown using element,index arguments
	   * @param element
	   * @param index
	   */
	  public void select(WebElement element,int index)
	  {
		  Select s=new Select(element);
		  s.selectByIndex(index); 
	  }
	  /**
	   * to handle mouse actions using element,driver arguments
	   * @param driver
	   * @param element
	   */
	  public void mouseMoveOnElement(WebDriver driver,WebElement element)
	  {
		  Actions act=new Actions(driver);
		  act.moveToElement(element).perform();
	  }
	  /**
	   *  to handle double click using element,driver arguments
	   * @param driver
	   * @param element
	   */
	  public void doubleClick(WebDriver driver,WebElement element)
	  {
		  Actions act=new Actions(driver);
		  act.doubleClick(element).perform();
	  }
	  /**
	   * to handle link click using driver,link arguments
	   * @param driver
	   * @param link
	   */
	  public void linkClick(WebDriver driver,WebElement link)
	  {
		  Actions act=new Actions(driver);
		  act.contextClick(link).perform();
	  }
	  /**
	   * to handle drag and drop using element argument
	   * @param driver
	   * @param a
	   * @param b
	   */
	  public void dragAndDrop(WebDriver driver,WebElement a,WebElement b)
	  {
		  Actions act=new Actions(driver);
		  act.dragAndDrop(a, b).perform();
	  }
	  /**
	   * to handle dropdown using drop,text arguments
	   * @param drop
	   * @param text
	   */
	  public void dropdown(WebElement drop,String text)
	  {
		  Select s=new Select(drop);
		  s.selectByVisibleText(text);
	  }
	  /**
	   * to take screenshot of an element using driver argument
	   * @param driver
	   * @param element
	   * @throws IOException
	   */
public void screenShot(WebDriver driver,WebElement element) throws IOException
{
//	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=element.getScreenshotAs(OutputType.FILE);
	File perm=new File("./ScreenShot/Defect1.png");
	org.openqa.selenium.io.FileHandler.copy(temp, perm);
}
/**
 * to take the screenshot of page using driver argument
 * @param driver
 * @throws IOException
 */
public void screenShot1(WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./ScreenShot/Defect1.png");
	org.openqa.selenium.io.FileHandler.copy(temp, perm);
}
public void javaScriptExecuter(WebDriver driver)
{

}
}
