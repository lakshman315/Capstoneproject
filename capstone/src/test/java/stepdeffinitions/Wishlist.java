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

public class Wishlist 
{
	WebDriver driver;
	@Given("user opens nopCommerce site")
	public void user_opens_nop_commerce_site() 
	{
		driver = new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@When("user search for Adobe Photoshop in home page")
	public void user_search_for_adobe_photoshop_in_home_page() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search_for_adobe_photo();
		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
//		Thread.sleep(2000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)"); 
	   
	}

	@And("user added product to wishlist")
	public void user_added_product_to_wishlist() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.addToWishlist();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Add to wishlist']")).click();
	}

	@Then("product should be in wishlist")
	public void product_should_be_in_wishlist()
	{
	   System.out.println("product shown in wishlist");
	}




}
