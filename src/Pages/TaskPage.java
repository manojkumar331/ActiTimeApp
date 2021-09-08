package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Selenium_utilitils;

public class TaskPage {
	@FindBy(xpath="//div[text()='Add New']")public WebElement AddNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")public WebElement NewcustomerButton;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")public WebElement customernametextBox;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")public WebElement customerDesctextBox;
	@FindBy(xpath="//div[text()='Create Customer']")public WebElement createcustomerButton;
	
	public void CreateCustomer(String cusname,String cusDesc)
	{
		Selenium_utilitils.ClickElement(AddNewButton);
		Selenium_utilitils.ClickElement(NewcustomerButton);
		Selenium_utilitils.waitforElmentVisibility(customernametextBox, 10);
		Selenium_utilitils.Entervalue(customernametextBox, cusname);
		Selenium_utilitils.Entervalue(customerDesctextBox, cusDesc);
		Selenium_utilitils.ClickElement(createcustomerButton);
	}
	

}
