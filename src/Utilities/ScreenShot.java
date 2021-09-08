package Utilities;
/*
 * @listerns anotations is used to monitor the entire testscript and pass the result to the Screenshotclass
 */

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public  class ScreenShot implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		EventFiringWebDriver efw=new EventFiringWebDriver(Base_class.driver);
		File src=efw.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\admin\\eclipse-workspace\\Acti_Time_Frame_work\\ScreenShotFailed\\"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
			
		} catch (Exception e) {
			System.out.println("Screen shot  not copied");
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		EventFiringWebDriver efw=new EventFiringWebDriver(Base_class.driver);
		File src=efw.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\admin\\eclipse-workspace\\Acti_Time_Frame_work\\ScreenshotPass\\"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
			
		} catch (Exception e) {
			System.out.println("Screen shot  not copied");
		}
		
	}

}
