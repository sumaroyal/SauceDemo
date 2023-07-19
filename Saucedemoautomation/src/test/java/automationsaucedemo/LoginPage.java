package automationsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends driverinitialize{
	
	@Test
	public void login() throws InterruptedException {
	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		Thread.sleep(2000);
		

	}

}
