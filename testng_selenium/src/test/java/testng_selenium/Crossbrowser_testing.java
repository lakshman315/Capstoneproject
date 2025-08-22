package testng_selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Crossbrowser_testing 
{
	WebDriver driver;

	@BeforeClass
	
	  public void beforeClass() throws InterruptedException{

//		driver = new ChromeDriver();

		Thread.sleep(3000);

//        driver.manage().window().maximize();

         }
  @Test
  public void Chrome() throws InterruptedException

  {

	  driver = new ChromeDriver();

	  driver.get("https://www.flipkart.com/"); 

	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(3000);
	 
  }
  @Test
  public void Firefox() throws InterruptedException

  {

	  driver = new FirefoxDriver();

	  driver.get("https://www.flipkart.com/"); 

	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(3000);
	 
  }
  @Test
  public void Edge() throws InterruptedException

  {
	  System.setProperty("webdriver.edge.driver", "\"C:\\Users\\HP\\Downloads\\webdev\\edgedriver_win64\\msedgedriver.exe\"");
	  driver = new EdgeDriver();

	  driver.get("https://www.flipkart.com/"); 

	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(3000);
	 
  }
  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
