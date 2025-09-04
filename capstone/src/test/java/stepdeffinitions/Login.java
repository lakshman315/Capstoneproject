package stepdeffinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver;
	@Given("User should open nopcommerce home page")
	public void user_should_open_nopcommerce_home_page() 
	{
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	     
	}

	@When("User  click on login")
	public void user_click_on_login() throws InterruptedException
	{
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.login_click();
		  // driver.findElement(By.linkText("Log in")).click();
	}

	@When("the user enters their email and password")
	public void the_user_enters_their_email_and_password() throws InterruptedException 
	{
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.enterDetails();
		 
//		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Lakshman2@gmail.com");
//		Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Lakshman.2134");
//        Thread.sleep(2000);

	}

	@When("user should click on submit button")
	public void user_should_click_on_submit_button() throws InterruptedException
	{
		 Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		 nc.login_submit();
		 //driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
			
	}

	@Then("User get logged in")
	public void user_get_logged_in() 
	{
	    System.out.println("user get logged in");
	}




}
