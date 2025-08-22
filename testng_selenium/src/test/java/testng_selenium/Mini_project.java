package testng_selenium;


import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class  Mini_project {

    WebDriver driver;
	  
    WebDriverWait wait;
    @BeforeTest
    public void BeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.ebay.com/");
        
    }


    @Test(priority = 1)
    public void Login() throws InterruptedException
    {
    	driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
         driver.findElement(By.id("userid")).sendKeys("lakshmanvangapandu@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.id("signin-continue-btn")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("pass")).sendKeys("@lakshman.5577");
         driver.findElement(By.id("sgnBt")).click();
        
    }

    @Test(priority = 2)
    public void MultipleSearches()throws InterruptedException
    {
        ArrayList<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Phone");
        products.add("Laptop");
        products.add("Perfumes"); 
        for (String product : products) 
        {
            driver.findElement(By.id("gh-ac")).clear();
            driver.findElement(By.id("gh-ac")).sendKeys(product);
            Thread.sleep(2000);
            driver.findElement(By.id("gh-search-btn")).click();
        }
    }
        

    @Test(priority = 3)
    public void adddeletetocart() throws InterruptedException {
        Actions act = new Actions(driver);

        driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch...");
        Thread.sleep(2000);
        
       driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
       Thread.sleep(2000);

        WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
        act.click(clk).perform();

        Thread.sleep(2000);

        driver.get("https://cart.ebay.com/");
        Thread.sleep(2000);

  	  WebElement remove=driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
  	  act.click(remove).perform();
  	  Thread.sleep(2000);
    }

	@Test(priority = 4)
	 public void shopallcategory() throws InterruptedException {
		  WebElement spall = driver.findElement(By.className("gh-search-categories"));
		  spall.click();
		  Thread.sleep(2000);
		  WebElement art = driver.findElement(By.cssSelector("select>option[value=\"550\"]"));
		  art.click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("gh-search-button__label")).click();
	  }
	     

    @Test(priority = 5)
    public void testShopByCategories() throws InterruptedException {
        driver.findElement(By.className("gh-search-categories")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#gh-cat > option:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("gh-search-btn")).click();
        System.out.println("Navigated to Art category");
    }

    @Test(priority = 6)
    public void rightclicks() throws InterruptedException {
  	  WebElement search = driver.findElement(By.id("gh-ac"));
  	  search.click();
  	  search.sendKeys("perfume for men");
  	  search.sendKeys(Keys.ENTER);
  	  
  	  
  	  Thread.sleep(4000); 
  	  Actions act = new Actions(driver);
  	  WebElement right_click = driver.findElement(By.partialLinkText("Men's Perfume"));
  	  act.contextClick(right_click).perform();
  	  
  	  
    }

    @Test(priority = 7)
    public void languageChange() throws InterruptedException 
    {

		WebElement con = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		con.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Japan")).click();	
	}
   

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
