package stepDef;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.SendSms;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.TestBase;

public class StepDefinition extends TestBase 

{

	public LoginPage lp=new LoginPage();;
	SendSms sms=new SendSms();
	//WebDriverWait w=new WebDriverWait(driver, 20);
	
	@Given("^Launch site using chrome$")
	public void launch_site_using_chrome() 
	{
	TestBase.initialization();   // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^user name is \"(.*)\"$")
	public void user_name_is(String x)  
	{
		//w.until(ExpectedConditions.visibilityOf(lp.mbno));
	    // Write code here that turns the phrase above into concrete actions
	 lp.fillmbno(x);
	}

	@When("^pwd is \"([^\"]*)\"$")
	public void pwd_is(String y) 
	{
	    // Write code here that turns the phrase above into concrete actions
	//w.until(ExpectedConditions.visibilityOfElementLocated(lp.pwd));
		lp.pwd(y);
	}

	@When("^click login$")
	public void click_login()  {
	    // Write code here that turns the phrase above into concrete actions
	   lp.click();
	}

	@Then("^validate output for criteria \"([^\"]*)\"$")
	public void validate_output_for_criteria(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^close site$")
	public void close_site()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
