package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register{
	
	private WebDriver driver;
	private Properties p;
	public Register(WebDriver driver,Properties p) throws IOException {
		this.driver=driver;
		this.p=p;
	//Method to load test data
	/*FileInputStream fis=new FileInputStream("C:\\Users\\Dhinesh\\eclipse-workspace\\Nopcommerce\\src\\test\\resources\\Payload.properties");
	p=new Properties();
	p.load(fis);*/
	}
				
	private By login=By.xpath("//a[text()='Log in']");
	private By rgsbutton=By.xpath("//a[text()='Register']");
	private By Malecheckbox=By.xpath("//input[@value='M']");
	private By firstname=By.id("FirstName");
	private By lastname=By.id("LastName");
	private By Email =By.id("Email");
	private By password=By.id("Password");
	private By conpassword=By.id("ConfirmPassword");
	private By Register = By.xpath("(//input[@type='submit'])[2]");
	private By logout = By.xpath("//a[text()='Log out']");
	
	
	
	    	
	public String registermethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rgsbutton));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(Malecheckbox).click();
		driver.findElement(firstname).sendKeys(p.getProperty("firstname"));
		driver.findElement(lastname).sendKeys(p.getProperty("lastname"));
		driver.findElement(Email).sendKeys(p.getProperty("Email"));
		driver.findElement(password).sendKeys(p.getProperty("password"));
		driver.findElement(conpassword).sendKeys(p.getProperty("conpassword"));
		driver.findElement(Register).click();
		String expected=driver.findElement(By.xpath("//div[normalize-space(text())='Your registration completed']")).getText();
		return expected;
	}
	
	public String login() throws IOException
	{
		driver.findElement(login).click();
		driver.findElement(Email).sendKeys(p.getProperty("Email"));
		driver.findElement(password).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String username =driver.findElement(By.xpath("//a[contains(text(),'dhinesh12326@gmail.com')]")).getText();
		return username;
	}

}
