package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.utils.FileUtil;

public class Genericmethods extends Basepage {
	
	
	
	/*@BeforeMethod
	void launchapplication()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	void teardown()
	{
		driver.close();
	}
	
	public void totakescreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\Dhinesh\\eclipse-workspace\\Screenshot_Nopcommerce");
		FileUtils.copyDirectory(src, destination);
		
	}*/
	

}