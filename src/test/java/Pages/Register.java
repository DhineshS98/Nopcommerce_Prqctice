package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register{
	
	private WebDriver driver;

	//public WebDriver driver;
	public Register(WebDriver driver) {
		this.driver=driver;
	}
	
	private By rgsbutton=By.xpath("//a[text()='Register']");
	private By Malecheckbox=By.xpath("//input[@value='M']");
	private By firstname=By.id("FirstName");
	private By lastname=By.id("LastName");
	private By Email =By.id("Email");
	private By password=By.id("Password");
	private By conpassword=By.id("ConfirmPassword");
	private By Register = By.xpath("(//button[@type='submit'])[2]");
	
	public void registermethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rgsbutton));
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(Malecheckbox).click();
		driver.findElement(firstname).sendKeys("Dhinesh");
		driver.findElement(lastname).sendKeys("S");
		driver.findElement(password).sendKeys("Dhinesh1234555");
		driver.findElement(conpassword).sendKeys("Dhinesh1234555");
		driver.findElement(Register).click();
	}

}
