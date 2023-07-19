package automationsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class addtocarttesting extends driverinitialize{
	
  @Test
  public  void addtocart() throws InterruptedException {
	  driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement openproduct=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		openproduct.click();
		System.out.println("Product is clicked");
		Thread.sleep(2000);
		WebElement addtocartbutton=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocartbutton.click();
		System.out.println("Add to cart button is clicked");
		Thread.sleep(2000);
		
		
		
		

	}

}
