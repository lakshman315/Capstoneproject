package Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import stepdeffinitions.Nopcommercepageclass;

public class NopTest {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void setUp()
	{
		//driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void reg() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		Thread.sleep(2000);
		nc.register_link();
		nc.register_details();
		nc.register_submit();
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.login_click();
		nc.enterDetails();
		nc.login_submit();
	}
	
	@Test(priority=3)
	public void searchh() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.search();
		
		
	}
	
	@Test(priority=4)
	public void prod_cat() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.navigateToCategory();
		nc.clickO();
		
		
	}
	
	@Test(priority=9)
	public void comm_poll() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.selectCommunityPoll();
		nc.clickOnButton();
		
	}
	
	@Test(priority=5)
	public void newsletter()
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.enterEmail();
		nc.clickSubscribe();
		
	}
	
	@Test(priority=6)
	public void wish() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.search_for_adobe_photo();
		nc.addToWishlist();
		
	}
	
	@Test(priority=7)
	public void add_to_cart() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.search_adobe();
		nc.addProductToCart();
		
	}
	
	@Test(priority=8)
	public void rem_cart() throws InterruptedException
	{
		Nopcommercepageclass nc=new Nopcommercepageclass(driver);
		nc.search_adobe_photoshop();
		nc.userAddToCart();
		nc.goToCart();
		nc.removeFromCart();
		
		
	}
	
	
	
	
}
