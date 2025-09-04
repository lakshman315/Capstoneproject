package stepdeffinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nopcommercepageclass 
{
	WebDriver driver;
	public Nopcommercepageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register_link()
	{
		driver.findElement(By.linkText("Register")).click();
	}
	
	public void register_details() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("FirstName")).sendKeys("Lakshman");
		  Thread.sleep(2000);
	      driver.findElement(By.id("LastName")).sendKeys("Vangapandu");
	      Thread.sleep(2000);
	      driver.findElement(By.id("Email")).sendKeys("Lakshman54@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.id("Password")).sendKeys("Lakshman.5134");
	      Thread.sleep(2000);
	      driver.findElement(By.id("ConfirmPassword")).sendKeys("Lakshman.5134");
	}

	public void register_submit() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("register-button")).click();
		
	}

	public void login_click() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Log in")).click();
	}

	public void enterDetails() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Lakshman54@gmail.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Lakshman.5g134");
        Thread.sleep(2000);
		
	}

	public void login_submit() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		
	}

	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("MacBook");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}

	public void search_adobe() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

	public void addProductToCart() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); 
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
	}

	public void search_adobe_photoshop() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	public void userAddToCart() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
		
	}

	public void goToCart() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Shopping cart")).click();
		
	}

	public void removeFromCart() {
		// TODO Auto-generated method stub
		WebElement ele=driver.findElement(By.xpath("//button[@class='remove-btn']"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",ele );
		
	}

	public void search_for_adobe_photo() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adobe Photoshop");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}

	public void addToWishlist() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to wishlist']")).click();
		
	}

	public void enterEmail() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("newsletter-email")).sendKeys("Lakshman@test.com");
	}

	public void clickSubscribe() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

	public void navigateToCategory() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Computers")).click();
		
	}

	public void clickO() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Build your own computer")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
	}

	public void selectCommunityPoll() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		WebElement ele=driver.findElement(By.xpath("//strong[text()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		
	}

	public void clickOnButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[text()='Vote']")).click();
		
	}
	
	
	
}
