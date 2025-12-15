package Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Pages.Basepage;
import Pages.Register;

public class TC_02_Login extends Basepage{

	@Test
	void Testlogin() throws InterruptedException, IOException
	{
		logger.info("Starting tc_02 testlogin");
		Register re=new Register(driver);
		re.login();
		Thread.sleep(3000);
		
	}
}
