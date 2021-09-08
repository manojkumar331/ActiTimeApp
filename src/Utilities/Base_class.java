package Utilities;
/*
 * baseclass consstits of code which is used to performe Operations like Launching the broswer,Login logout operation,clearing the cookies
 * and clsing the broswer
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.HomePage;
import Pages.LoginPage;


public class Base_class {
	public static WebDriver driver;
	@Parameters("broswer")
	@BeforeClass
	public void BeforeConfiguation(String broswer)
	{
		if(broswer.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (broswer.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SOFTWARES\\geckodriver-v0.29.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if (broswer.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "path");
			driver=new InternetExplorerDriver();
			
		}
		else if (broswer.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "path");
			driver=new EdgeDriver();
			
		}
		else {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		Reporter.log("broswer is launched");
		driver.get(Constants.URL);
		Reporter.log("Url is pssing is over");
	}

	@AfterClass
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		Reporter.log("all cookies are cleared");
		driver.quit();
		Reporter.log("Broswer is closed");
	}
	@BeforeMethod
	public void login()
	{
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.logintoApp();
		Reporter.log("login operation is success");
	}
	@AfterMethod
	public void logout()
	{
			HomePage hp=PageFactory.initElements(driver,HomePage.class);
			hp.LogoutApp();
			Reporter.log("logout operation is success");
	}
		
		
}	

