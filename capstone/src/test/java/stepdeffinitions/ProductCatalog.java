package stepdeffinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCatalog
{
	WebDriver driver;
	@Given("user open nopCommerce website")
	public void user_open_nop_commerce_website()
	{
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	@When("user navigates to category")
	public void user_navigates_to_category( ) 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.navigateToCategory();
		
//		driver.findElement(By.linkText("Computers")).click();
	}

	@When("user clicks on")
	public void user_clicks_on() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.clickO();
		
//		driver.findElement(By.linkText("Desktops")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Build your own computer")).click();
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)"); 
	}

	@Then("user should see the product details page")
	public void user_should_see_the_product_details_page() 
	{
	    System.out.println("user can see");
	}




}
