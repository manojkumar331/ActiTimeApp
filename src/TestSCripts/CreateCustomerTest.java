package TestSCripts;

import java.io.IOException;

//import javax.swing.text.Utilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.TaskPage;
import Utilities.Base_class;
import Utilities.Excel_libraries;

/*
 * create a package called testScript store all testng classes inside teztngclass we need to create object forpage classes
 *  &we will write bussiness flow
 *Assert Statements can be added for validation purpose
 *Reporter.log Statements and be add for each statements in testng
 * extend the testng cls with BaseClass so that the precondition and postconditions also will get executed
 * 
 */
//@Listeners(Utilities.ScreenShot.class)

public class CreateCustomerTest extends Base_class {
  @Test
  public void f() throws EncryptedDocumentException, InvalidFormatException, IOException {
	  String cusname=Excel_libraries.FetchStringData("Book1", 1, 0);
	  String cusdesc=Excel_libraries.FetchStringData("Book1", 1, 1);
	  HomePage hp=PageFactory.initElements(driver, HomePage.class);
	  hp.NaviagatetoTask();
	  Reporter.log("Navigated to tasks Tab");
	  TaskPage tp=PageFactory.initElements(driver,TaskPage.class);
	  tp.CreateCustomer(cusname, cusdesc);
	  Reporter.log("Customer created succesfully");
	  
	  
  }
}
