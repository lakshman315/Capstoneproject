package testng_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_dev {
    
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Selenium website
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void title() {
        String expectedtitle = "Selenium dev";   // expected
        String actualtitle = driver.getTitle();  // actual

        // Assert check
        Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");

        // Print results
        System.out.println("Expected Title: " + expectedtitle);
        System.out.println("Actual Title: " + actualtitle);
    }

    @Test
    public void url() {
        String expectedurl = "https://www.selenium.dev/";   // expected
        String actualurl = driver.getCurrentUrl();          // actual

        // Assert check
        Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");

        // Print results
        System.out.println("Expected URL: " + expectedurl);
        System.out.println("Actual URL: " + actualurl);
    }

    @AfterTest
    public void teardown() {
        // Close browser
        driver.quit();
    }
}

