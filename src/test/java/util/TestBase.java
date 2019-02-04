package util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
public static WebDriver driver;
public static  Properties pro;


public TestBase()
{

	try
	{
		
		pro=new Properties();
		FileInputStream fip=new FileInputStream("C:\\Users\\SR\\Desktop\\BDDPractice\\way2Sms\\src\\test\\resources\\Properties\\way2sms.properties");
		pro.load(fip);
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	
	
}

public static void initialization()
{
	String browsername=pro.getProperty("cdriver");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SR\\Desktop\\DemoClass\\installation folder\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.geckodriver.driver", "");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(pro.getProperty("url"));
	
}
}
