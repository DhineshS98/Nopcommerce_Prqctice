package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	
	    public static ExtentReports extent;
	    public static ExtentHtmlReporter htmlReporter;
	    public static ExtentTest test;
	    protected Properties p;
	
	public WebDriver driver;
	public static Logger logger=LogManager.getLogger(Basepage.class);
	@BeforeClass
	public void launchapplication()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logger.info("Launching chrome browser");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	@BeforeSuite
    public void setUpExtent() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Dhinesh\\eclipse-workspace\\Nopcommerce\\src\\test\\resources\\Payload.properties");
		p=new Properties();
		p.load(fis);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        htmlReporter = new ExtentHtmlReporter("reports/extentReport_" + timestamp + ".html");
        htmlReporter.config().setDocumentTitle("Demowebshop");
        htmlReporter.config().setReportName("BasicTests");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void tearDownExtent() {
        extent.flush();
    }
    
}


