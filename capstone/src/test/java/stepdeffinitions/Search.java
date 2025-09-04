package stepdeffinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search 
{
	WebDriver driver;
	@Given("user open nopCommerce site")
	public void user_open_nop_commerce_site()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@When("user search for MacBook")
	public void user_search_for_mac_book() throws InterruptedException
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.search();
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("MacBook");
//		Thread.sleep(2000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)"); 
	}

	@Then("user should see MacBook in results")
	public void user_should_see_mac_book_in_results() 
	{
	   System.out.println("user can see product");
	}



}
