package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Selenium_utilitils;


public class TimeTracker {
	@FindBy(xpath="//a[text()='Enter Time-Track']")public WebElement clickEnter_time_track_button;
	@FindBy(xpath="//button[text()='+']")public WebElement clickonplusbutton;
	@FindBy(xpath="//button[text()='Add New']")public WebElement addcustomertimetrack;
	@FindBy(xpath="(//div[contains(@class,'dropdownButton')])[5]")public WebElement clickDropDownButton;
	@FindBy(xpath="//div[text()='- New Customer -']") public WebElement clickonNewCust;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")public WebElement enterCustName;
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")public WebElement enterprojectname;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")public WebElement enterTaskName;
	@FindBy(xpath="(//input[@placeholder='not needed'])[1]")public WebElement enterestimateTime;
	@FindBy(xpath="//button[text()='set deadline']")public WebElement clickondeadline;
	@FindBy(id="ext-gen96")public WebElement clickOnDate;
	@FindBy(xpath="//div[text()='Create Tasks']")public WebElement createATask;
	
	
	

	public void TimeTRack(String custname,String projectName, String Taskname,String estiTime) {
		Selenium_utilitils.ClickElement(clickEnter_time_track_button);
		Selenium_utilitils.ClickElement(clickonplusbutton);
		Selenium_utilitils.ClickElement(addcustomertimetrack);
		Selenium_utilitils.ClickElement(clickDropDownButton);
		Selenium_utilitils.ClickElement(clickonNewCust);
		Selenium_utilitils.Entervalue(enterCustName, custname);
		Selenium_utilitils.Entervalue(enterprojectname, projectName);
		Selenium_utilitils.Entervalue(enterTaskName, Taskname);
		Selenium_utilitils.Entervalue(enterestimateTime, estiTime);
		Selenium_utilitils.ClickElement(clickondeadline);
		Selenium_utilitils.ClickElement(clickOnDate);
		Selenium_utilitils.ClickElement(createATask);
		
		

	}

}
