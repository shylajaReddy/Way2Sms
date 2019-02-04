package Pages;



//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.TestBase;
public class LoginPage extends TestBase 
{
	

	@FindBy(how = How.NAME, using= "mobileNo")
	public WebElement mbno;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(xpath=("(//button[contains(text(),'Login')])[1]"))
	public WebElement login;
	
	
	//operations
	
	
	public LoginPage()
	{
		
		
		PageFactory.initElements(driver, TestBase.class);
	
		
	}
	
	
	public  void fillmbno(String y)
	{
		mbno.sendKeys(y);
	}
	public void pwd(String x)
	{
		pwd.sendKeys(x);
	}
public void click()
{
login.click();	
}

}
