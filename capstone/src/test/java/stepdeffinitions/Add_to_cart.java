package stepdeffinitions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_to_cart 
{
	WebDriver driver;
	@Given("user on nopCommerce site")
	public void user_on_nop_commerce_site() 
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("user searched for Adobe Photoshop")
	public void user_searched_for_adobe_photoshop() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search_adobe();
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
//		Thread.sleep(2000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@And("user added product to cart")
	public void user_added_product_to_cart() 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addProductToCart();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)"); 
//		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
	}

	@Then("product should be in cart")
	public void product_should_be_in_cart()
	{
	    System.out.println("product shown in cart");
	}




}
