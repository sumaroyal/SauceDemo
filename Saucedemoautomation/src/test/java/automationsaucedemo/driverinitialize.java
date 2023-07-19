package automationsaucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class driverinitialize {
	public static WebDriver driver;
  @BeforeTest
  public void webdriverinitialize() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
  }
  
  public static WebDriver getdriver()
  {
	  return driver;
  }
  

}
