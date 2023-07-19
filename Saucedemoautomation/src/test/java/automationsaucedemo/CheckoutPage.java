package automationsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutPage extends driverinitialize{
  @Test
  public void checkout() throws InterruptedException {
	  
	  WebElement cartbutton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']//span"));
		cartbutton.click();
		System.out.println("cart button is clicked");
		Thread.sleep(2000);
		WebElement checkoutbtn=driver.findElement(By.xpath("//button[@id='checkout']"));
		checkoutbtn.click();
		System.out.println("checkout button is clicked");
		Thread.sleep(2000);
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		Firstname.sendKeys("asbc");
		System.out.println("First name is entered");
		Thread.sleep(2000);
		WebElement Lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		Lastname.sendKeys("defg");
		System.out.println("lastname is entered");
		Thread.sleep(2000);
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("502319");
		System.out.println("Zipcode is entered");
		Thread.sleep(2000);
		
		WebElement continuebtn=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebtn.click();
		System.out.println("Continue button is clicked");
		Thread.sleep(2000);
		
		WebElement finishbtn=driver.findElement(By.xpath("//button[text()='Finish']"));
		finishbtn.click();
		System.out.println("Finish button is clicked on the checkout overview page");
		Thread.sleep(1500);
		
		WebElement ordersuccessmsg=driver.findElement(By.xpath("//div//h2[text()='Thank you for your order!']"));
		ordersuccessmsg.isDisplayed();
		System.out.println("Thank you for your order message is displayed");
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
  }
}
