package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.Basepage;
import Utils.ScreenshotUtil;

public class MyListeners implements ITestListener {
	
			
	@Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = ((Basepage) result.getInstance()).driver;
        ScreenshotUtil.takeScreenshot(driver, result.getName() + "_PASSED");
        Basepage.test=Basepage.extent.createTest(result.getName());
        Basepage.test.log(Status.PASS,"PASSED testcase is :"+result.getName());
        
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((Basepage) result.getInstance()).driver;
        ScreenshotUtil.takeScreenshot(driver, result.getName() + "_FAILED");
        Basepage.test=Basepage.extent.createTest(result.getName());
        Basepage.test.log(Status.FAIL,"FAILED testcase is :"+result.getName());
        
    }
   
}


