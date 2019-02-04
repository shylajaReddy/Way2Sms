package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class SendSms extends TestBase
{


@FindBy(name="toMobile")
public WebElement phno;

@FindBy(name="message")
public WebElement mesg;

@FindBy(id="sendButton")
public WebElement send_btn;


//operations
public SendSms()
{
PageFactory.initElements(driver, this);
}

public void fillPno(String x)
{

	phno.sendKeys(x);
}

public void message(String x)
{
mesg.sendKeys(x);	
}
public void sendMsg()
{
send_btn.click();	
}



}



