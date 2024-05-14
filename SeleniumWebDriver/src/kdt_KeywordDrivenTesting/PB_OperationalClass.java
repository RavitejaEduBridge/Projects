package kdt_KeywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PB_OperationalClass {

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
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    
    public void username(WebDriver driver,String usn)
    {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
    }
    
    public void password(WebDriver driver,String pwd)
    {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
    }
    
    public void loginButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    } 
   
    public void logout(WebDriver driver)
    {
        driver.findElement(By.partialLinkText("Log Out")).click();
    }
    
    public void closeBrowser(WebDriver driver)
    {
        driver.close();
    }
}
