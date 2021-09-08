package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Constants;
import Utilities.Selenium_utilitils;

public class LoginPage {
	                         
	@FindBy(xpath="//input[@name='username']")
	public WebElement usernameTxtbox;
	@FindBy(xpath="//input[@name='pwd']")
	public WebElement userpasswordTxtbox;
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginButton;
	public void logintoApp() {
		Selenium_utilitils.Entervalue(usernameTxtbox, Constants.USERNAME);
		Selenium_utilitils.Entervalue(userpasswordTxtbox, Constants.PASSWORD);
		Selenium_utilitils.ClickElement(loginButton);
		
	}
	

}
