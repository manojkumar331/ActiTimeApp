package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Selenium_utilitils;

public class HomePage {
	@FindBy(xpath="//a[text()='Logout']")public WebElement logoutlink;
	@FindBy(xpath="//div[text()='Time-Track']")public WebElement Timetracktab;
	@FindBy(id="container_tasks")public WebElement taskstab;
	@FindBy(xpath="//div[text()='Reports']")public WebElement Reportstab;
	@FindBy(xpath="//div[text()='Users']")public WebElement Userstab;
	public void LogoutApp()
	{
		Selenium_utilitils.waitforpageload(10);
		Selenium_utilitils.ClickElement(logoutlink);
	}
	public void NaviagatetoReport()
	{
		
		Selenium_utilitils.ClickElement(Reportstab);
	}
	public void NaviagatetoTask()
	{
		
		Selenium_utilitils.ClickElement(taskstab);
	}
	public void Naviagatetousers()
	{
		
		Selenium_utilitils.ClickElement(Userstab);
	}
	public void Naviagatetotimetrack()
	{
		
		Selenium_utilitils.ClickElement(Timetracktab);
	}
	

}
