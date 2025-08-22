package testng_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_dev1 {
    
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    
//    @Test
//    public void title() {
//        String expectedtitle = "Selenium";  
//        String actualtitle = driver.getTitle();  
//        Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");
//        System.out.println("Expected Title: " + expectedtitle);
//        System.out.println("Actual Title: " + actualtitle);
//    }
//
//    @Test(enabled =false)
//    public void url() 
//    {
//        String expectedurl = "https://www.selenium.dev/";   
//        String actualurl = driver.getCurrentUrl();       
//        Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
//        System.out.println("Expected URL: " + expectedurl);
//        System.out.println("Actual URL: " + actualurl);
//    }
    
    @Test(invocationCount = 3)
    public void title()
    {
        String expectedtitle = "Selenium";   
        String actualtitle = driver.getTitle();  
        Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");

        System.out.println("Expected Title: " + expectedtitle);
        System.out.println("Actual Title: " + actualtitle);
    }

    @AfterTest
    public void teardown() 
    {
        driver.quit();
    }
}
