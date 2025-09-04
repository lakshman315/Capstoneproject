package stepdeffinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_guest 
{
	WebDriver driver;
	WebDriverWait mywait;
	@Given("user opened nopCommerce site")
	public void user_opened_nop_commerce_site() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/"); 
	}

	@When("user do search for {string}")
	public void user_do_search_for(String product) throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(product);
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
	    
	}

	@And("user add product to cart")
	public void user_add_product_to_cart() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
	}

	@And("user proceed to checkout as guest")
	public void user_proceed_to_checkout_as_guest() throws InterruptedException
	{
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(1000);
        driver.findElement(By.id("termsofservice")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]")).click();
	   
	}

	@And("user enter billing details")
	public void user_enter_billing_details() throws InterruptedException
	{
		 driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Lakshman");
	        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Vangapandu");
	        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Lakshman@gmail.com");
	        
	        WebElement sort1=driver.findElement(By.id("BillingNewAddress_CountryId"));
	        Select sle1=new Select(sort1);
	        sle1.selectByVisibleText("India");
	        
	        sort1.sendKeys(Keys.TAB);
	        Thread.sleep(2000);
	        WebElement sort=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
	        Select sle=new Select(sort);
	        sle.selectByIndex(2);
	        
	        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kakinada");
	        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("velampeta");
	        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("533343");
	        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("8688061416");
	        driver.findElement(By.cssSelector("button[name='save']")).click();
	        Thread.sleep(2000);
	    
	}

	@And("user select shipping and payment method")
	public void user_select_shipping_and_payment_method() throws InterruptedException 
	{
		
		WebElement ele=driver.findElement(By.xpath("//label[text()='Next Day Air ($0.00)']"));
		mywait.until(ExpectedConditions.elementToBeClickable(ele));
        driver.findElement(By.xpath("//button[text()='Continue' and @name='save' and @class='button-1 new-address-next-step-button']")).click();
		driver.findElement(By.id("paymentmethod_0")).click(); 
        driver.findElement(By.xpath("//button[text()='Continue' and @name='save' and @class='button-1 payment-method-next-step-button']")).click();
        driver.findElement(By.xpath("//button[text()='Continue' and @onclick='if (!window.__cfRLUnblockHandlers) return false; PaymentInfo.save()']")).click();
	    driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	}

	@Then("user should see order confirmation")
	public void user_should_see_order_confirmation() 
	{
		System.out.println("user can see the order confirmation");
	}




}
