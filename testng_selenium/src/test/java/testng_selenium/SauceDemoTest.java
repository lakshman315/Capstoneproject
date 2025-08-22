package testng_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SauceDemoTest {
	WebDriver driver;
  @BeforeClass
  public void setUp() 
  {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
  }
  @Test(priority = 1)
  public void loginTest() throws InterruptedException {
     
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);      
  }
  @Test(priority = 2)
  public void addToCartTest() throws InterruptedException 
  {
      driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
      Thread.sleep(4000);
  }
  @Test(priority = 3)
  public void checkoutTest() throws InterruptedException 
  {

      driver.findElement(By.className("shopping_cart_link")).click();

      driver.findElement(By.id("checkout")).click();

      driver.findElement(By.id("first-name")).sendKeys("lakshman");
      driver.findElement(By.id("last-name")).sendKeys("vangapandu");
      driver.findElement(By.id("postal-code")).sendKeys("533333");
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("finish")).click();
      Thread.sleep(4000);

  }

  @Test(priority = 4)
  public void logoutTest() throws InterruptedException 
  {

	  driver.findElement(By.className("bm-burger-button")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("logout_sidebar_link")).click();
      System.out.println("Logged out Successfully!");

  }


  @AfterClass
  public void afterClass() {
  
  	driver.quit();
  }
}
