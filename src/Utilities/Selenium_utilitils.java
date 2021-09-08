package Utilities;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




/*
 * this class consists of re_usable methods 
 */

public class Selenium_utilitils {
	public static String FetchTitle(WebElement wb,String text)
	{
		return text=Base_class.driver.getTitle();
	}
	public static String FetchPageInfo(WebElement wb,String text)
	{
		return text=Base_class.driver.getPageSource();
	}
	public static String FetchCurrentURL(WebElement wb,String text)
	{
		return text=Base_class.driver.getCurrentUrl();
	}
	
	public static void Entervalue(WebElement wb,String value) {
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}

	}
	public static void ClickElement(WebElement wb) {
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
			}
        }
	public static String GetTextFromUI(WebElement wb) {
		return wb.getText();

	}
	public static String GetAttributeInfo(WebElement wb) {
		return wb.getAttribute(null);

	}
	public static String GetCssValueInfo(WebElement wb) {
		return wb.getCssValue(null);

	}
	public static Point GetLoc(WebElement wb) {
		return wb.getLocation();

	}
	public static org.openqa.selenium.Dimension GetSize(WebElement wb) {
		return wb.getSize();
	}
	public static Rectangle GetRect(WebElement wb) {
		return wb.getRect();
	}
	public static void Navigateback()
	{
		Base_class.driver.navigate().back();
	}
	public static void Navigateforward()
	{
		Base_class.driver.navigate().forward();
	}
	public static void PageRefresh()
	{
		Base_class.driver.navigate().refresh();
	}
	public static void  selectvaluefromdropdown(WebElement wb,int Index) {
		Select s=new Select(wb);
    s.selectByIndex(Index);
	}
	public static void  selectvaluefromdropdown(WebElement wb,String text) {
		Select s=new Select(wb);
    s.selectByVisibleText(text);
	}
	public static void  mousehoveroperation(WebElement wb) {
		Actions s=new Actions(Base_class.driver);
    s.moveToElement(wb).perform();
	}
	public static void  PressEnter() {
		Actions s=new Actions(Base_class.driver);
	    s.sendKeys(Keys.ENTER).perform();
	}
	public static void  PressTab() {
		Actions s=new Actions(Base_class.driver);
	    s.sendKeys(Keys.TAB).perform();
	}
	public static void waitforpageload(int i)
	{
		Base_class.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	public static void waitforElmentVisibility(WebElement elements,int seconds)
	{
		WebDriverWait wait =new WebDriverWait(Base_class.driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(elements));
	}
	public static void waitforElmentVisibilityAndEntervalue(WebElement elements,int seconds,String text)
	{
		WebDriverWait wait =new WebDriverWait(Base_class.driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(elements)).sendKeys(text);
	}
	public static void waitforElmentVisibilityAndClick(WebElement elements,int seconds)
	{
		WebDriverWait wait =new WebDriverWait(Base_class.driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(elements)).click();
	}
	public static void waitforElmentTobeclickable(WebElement elements,int seconds)
	{
		WebDriverWait wait =new WebDriverWait(Base_class.driver,seconds);
		wait.until(ExpectedConditions.elementToBeClickable(elements));
	}
	public void SitchtoFrame(int index)
	{
		Base_class.driver.switchTo().frame(index);	
		}
	public void SitchtoFrame(String name)
	{
		Base_class.driver.switchTo().frame(name);	
		}public void SitchtoFrame(WebElement wb)
		{
			Base_class.driver.switchTo().frame(wb);	
			}
		public void SitchtoDefaultcontent()
		{
			Base_class.driver.switchTo().defaultContent();	
			}
	public static void Acceptalert()
	{
		Alert alt=Base_class.driver.switchTo().alert();
		alt.accept();
	}
	public static void Dismissalert()
	{
		Alert alt=Base_class.driver.switchTo().alert();
		alt.dismiss();
	}
	public static String GetTextalertmsg()
	{
		Alert alt=Base_class.driver.switchTo().alert();
		String text= alt.getText();
		return text;
	}
//public static
 
}
