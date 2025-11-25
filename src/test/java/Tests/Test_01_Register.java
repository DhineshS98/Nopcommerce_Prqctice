package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.Genericmethods;
import Pages.Register;

public class Test_01_Register extends Basepage{
	
	//public WebDriver driver;
	
	@Test
	void testregisterpage() throws InterruptedException
	{
		Register r=new Register(driver);
		r.registermethod();
		String expected="Your registration completed";
		Assert.assertEquals("Your registration completed",expected);
		
	}
	
	@Test(enabled=false)
	void login()
	{
		Boolean isdisplayed=driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		Assert.assertTrue(isdisplayed,"Logout button is not visible");
		
	}
	

}
