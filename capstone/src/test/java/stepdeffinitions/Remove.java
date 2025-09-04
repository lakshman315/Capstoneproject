package stepdeffinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remove 
{
	WebDriver driver;
	@Given("user goes to nopCommerce site")
	public void user_goes_to_nop_commerce_site() 
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@When("user searches for Adobe Photoshop")
	public void user_searches_for_adobe_photoshop() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search_adobe_photoshop();
		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
//		Thread.sleep(2000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	    

	@And("user added the product to cart")
	public void user_added_the_product_to_cart() 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.userAddToCart();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)"); 
//		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();	    
	}
	

	@And("user goes to cart")
	public void user_goes_to_cart() 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.goToCart();
//		driver.findElement(By.linkText("Shopping cart")).click();
	}

	@And("user remove the product")
	public void user_remove_the_product() 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.removeFromCart();
//		 WebElement ele=driver.findElement(By.xpath("//button[@class='remove-btn']"));
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click()",ele );
	}

	@Then("cart should be empty")
	public void cart_should_be_empty() 
	{
	    System.out.println("cart is empty");
	}




}
