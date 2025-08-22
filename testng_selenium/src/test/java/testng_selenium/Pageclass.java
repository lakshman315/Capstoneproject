package testng_selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageclass {

	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	
	public  Pageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void email_in()
	{
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("Lakshmanvangapandu@gmail.com");
		
	}
	public void password_in()
	{
		driver.findElement(pass).click();
		driver.findElement(email).clear();
		driver.findElement(pass).sendKeys("@Lakshman.5577");
		
	}
	public void cont_in()
	{
		driver.findElement(cont).click();
	}
	public void search_in()
	{
		driver.findElement(search).click();
		  ArrayList<String> products = new ArrayList<>();
	        products.add("Watch");
	        products.add("Phone");
	        products.add("Laptop");
	        for (String product : products) {
	            WebElement searchBox = driver.findElement(By.id("gh-ac"));
	            searchBox.clear();
	            searchBox.sendKeys(product, Keys.ENTER);
	            System.out.println("Searched for: " + product);
	            driver.navigate().back();
	        }
	}
	public void submit_in()
	{
		driver.findElement(submit).click();
	}
	
	
	

}
