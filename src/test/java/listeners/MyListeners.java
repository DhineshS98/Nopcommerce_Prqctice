package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Pages.Basepage;
import Utils.ScreenshotUtil;

public class MyListeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = ((Basepage) result.getInstance()).driver;
        ScreenshotUtil.takeScreenshot(driver, result.getName() + "_PASSED");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((Basepage) result.getInstance()).driver;
        ScreenshotUtil.takeScreenshot(driver, result.getName() + "_FAILED");
    }
}
