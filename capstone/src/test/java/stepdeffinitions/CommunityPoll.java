package stepdeffinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommunityPoll 
{
	WebDriver driver;
	WebDriverWait mywait;
	@Given("User is on the nopCommerce homepage")
	public void user_is_on_the_nop_commerce_homepage() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	    
	}

	@When("User selects an option in the community poll")
	public void user_selects_an_option_in_the_community_poll() throws InterruptedException 
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.selectCommunityPoll();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement ele=driver.findElement(By.xpath("//strong[text()='Community poll']"));
//		js.executeScript("arguments[0].scrollIntoView()", ele);
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//label[text()='Excellent']")).click();
	    
	}

	@And("User clicks on the vote button")
	public void user_clicks_on_the_button()
	{
		Nopcommercepageclass nc= new Nopcommercepageclass(driver);
		nc.clickOnButton();
//	    driver.findElement(By.xpath("//button[text()='Vote']")).click();
	}

	@Then("The poll result should be displayed")
	public void the_poll_result_should_be_displayed() 
	{
	   System.out.println("poll result displayed");
	}




}
