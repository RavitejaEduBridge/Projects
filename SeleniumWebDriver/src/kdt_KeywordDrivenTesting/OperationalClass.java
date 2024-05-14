package kdt_KeywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationalClass {
	
	
	public void maximizeBrowser(WebDriver driver)
    {
        driver.manage().window().maximize();
    }
	
    public void deleteCookies(WebDriver driver)
    {
        driver.manage().deleteAllCookies();
    }
    
    public void url(WebDriver driver)
    {
        driver.get("https://www.saucedemo.com/");
    }
    
    public void username(WebDriver driver,String usn)
    {
        driver.findElement(By.id("user-name")).sendKeys(usn);
    }
    
    public void password(WebDriver driver,String pwd)
    {
        driver.findElement(By.id("password")).sendKeys(pwd);
    }
    
    public void loginButton(WebDriver driver)
    {
        driver.findElement(By.id("login-button")).click();
    }
    
    public void addItem1(WebDriver driver)
    {
        driver.findElement(By.xpath("//div[@class='inventory_item']//button[@id='add-to-cart-sauce-labs-backpack']")).click();;
    }
    
    public void addItem2(WebDriver driver)
    {
        driver.findElement(By.xpath("//div[@class='inventory_item']//button[@id='add-to-cart-sauce-labs-bike-light']")).click();;
    }
    
    public void removItem2(WebDriver driver)
    {
        driver.findElement(By.xpath("//div[@class='inventory_item']//button[@id='remove-sauce-labs-bike-light']")).click();
    }
    
    public void addToCart(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }
    
    public void checkout(WebDriver driver)
    {
        driver.findElement(By.id("checkout")).click();
    }
  
    public void threeLines(WebDriver driver)
    {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }
    
    public void logout(WebDriver driver)
    {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
    
    public void closeBrowser(WebDriver driver)
    {
        driver.close();
    }
	
}
