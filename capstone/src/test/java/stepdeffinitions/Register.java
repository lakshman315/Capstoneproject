package stepdeffinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register 
{
	 WebDriver driver;
	 @Given("User is on nopCommerce homepage")
	 public void user_is_on_nop_commerce_homepage()
	 {
		 driver = new ChromeDriver();
		 //driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
	 }

	 @When("User clicks on register link")
	 public void user_clicks_on_register_link() 
	 {
		 //driver.findElement(By.linkText("Register")).click();
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.register_link();
	 }

	 @When("User enters required registration details")
	 public void user_enters_required_registration_details() throws InterruptedException
	 {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.register_details();
		 
		 
//		 driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.id("FirstName")).sendKeys("Lakshman");
//		  Thread.sleep(2000);
//	      driver.findElement(By.id("LastName")).sendKeys("Vangapandu");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("Email")).sendKeys("Lakshman2@gmail.com");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("Password")).sendKeys("Lakshman.2134");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("ConfirmPassword")).sendKeys("Lakshman.2134");
	     
	 }

	 @When("User submits the registration form")
	 public void user_submits_the_registration_form() 
	 {
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.register_submit();
		 //driver.findElement(By.id("register-button")).click();
	 }

	 @Then("User should see registration confirmation")
	 public void user_should_see_registration_confirmation() 
	 {
		 System.out.println("User can see registration comfirmation");
	 }



}
