package Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	private WebDriver driver;
	private Properties p;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By computer=By.xpath("(//a[contains(text(),'Computers')])[1]");
	private By desktops=By.xpath("(//a[normalize-space()='Desktops'])[1]");
	private By productlist=By.xpath("//h2[@class='product-title']");
	private By productprice=By.xpath("//span[@class='price actual-price']");
	private By addtocart=By.xpath("(//input[@value='Add to cart'])[1]");
	private By Successmessage=By.xpath("//p[@class='content']");
	
	
	
	public void verifydesktopdetails()
	{
		driver.findElement(computer).click();
		driver.findElement(desktops).click();
		List<WebElement> producttitle = driver.findElements(productlist);
		List<WebElement> pricelist = driver.findElements(productprice);
		for(WebElement title:producttitle )
		{
			String productname=title.getText();
			String productprize=title.getText();
			System.out.println(productname+"---->"+productprize);
		}
	}
	
	public void placedesktoporder()
	{
		driver.findElement(computer).click();
		driver.findElement(desktops).click();
		List<WebElement> producttitle = driver.findElements(productlist);
		for(WebElement title1:producttitle )
		{
			if((title1.getText()).equals(p.getProperty("Order")))
				title1.click();
			break;
		}
		driver.findElement(addtocart).click();
		String message=driver.findElement(Successmessage).getText();
		
	}
	
	
	

}
