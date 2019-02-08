package packproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{
	 WebDriver driver;
  @Test
  public void f() 
  {
	        String expected= "Google";
	 
            String actual= driver.getTitle();
            Assert.assertEquals(actual, expected);
            
	  
  }
  @BeforeMethod
  public void f1() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
  }
  @AfterMethod
  public void f2() 
  {
	  driver.close();
  }
}

