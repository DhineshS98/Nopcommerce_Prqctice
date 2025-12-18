package Tests;
import org.testng.annotations.Listeners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.Genericmethods;
import Pages.Register;
@Listeners(listeners.MyListeners.class)
public class Test_01_Register extends Basepage{
		
	@Test(priority=1)	
	void testregisterpage() throws InterruptedException, IOException
	{
		logger.info("Starting TC_01 Testregister");
		Register r=new Register(driver, p);
		String actual="Your registration completed";
		Assert.assertEquals(actual,r.registermethod());
		
	}
	
	@Test(priority=2)
	void login()
	{
		logger.info("Starting TC_01 Login");
		Boolean isdisplayed=driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		Assert.assertTrue(isdisplayed);
		
	}
	

}
