package testng_selenium;

import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayDependentTests 
{
    
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.linkText("Sign in")).click();
        
        driver.findElement(By.id("userid")).sendKeys("lakshmanvangapandu@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("@lakshman.5577");
        driver.findElement(By.id("sgnBt")).click();

        System.out.println("Login successful");
    }

    @Test(dependsOnMethods = {"login"})
    public void Search() {
        ArrayList<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Perfume");
        products.add("shoe");
        for (String product : products) {
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.clear();
            searchBox.sendKeys(product, Keys.ENTER);
            System.out.println("Searched for: " + product);
            driver.navigate().back();
        }
    }


    @Test(dependsOnMethods = {"Search"})
    public void logout() throws InterruptedException 
    {

        WebElement accountMenu = driver.findElement(By.id("gh-ug"));
        accountMenu.click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign out")).click();
    }

    @AfterTest
    public void afterclass() {
        driver.quit();
    }
}
