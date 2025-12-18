package Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Pages.Basepage;
import Pages.Register;

public class TC_02_Login extends Basepage{

	@Test
	void verifyusername() throws InterruptedException, IOException
	{
		logger.info("Starting tc_02 testlogin");
		Register re=new Register(driver, p);
		String expected=p.getProperty("Email");
		Assert.assertEquals(re.login(),expected);
		Thread.sleep(3000);
		
		
	}
	
}
