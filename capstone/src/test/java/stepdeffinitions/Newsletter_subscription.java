package stepdeffinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newsletter_subscription 
{
	WebDriver driver;
	@Given("userr open nopCommerce site")
	public void userr_open_nop_commerce_site() 
	{
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");	    
	}

	@When("userr enter my email for newsletter")
	public void userr_enter_my_email_for_newsletter()
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.enterEmail();
		
//		driver.findElement(By.id("newsletter-email")).sendKeys("Lakshman@test.com");
	}

	@When("userr click subscribe")
	public void userr_click_subscribe() 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.clickSubscribe();
		
//		 driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

	@Then("userr should see newsletter subscription confirmation")
	public void userr_should_see_newsletter_subscription_confirmation() 
	{
	    System.out.println("subscription confirmed");
	}
}
