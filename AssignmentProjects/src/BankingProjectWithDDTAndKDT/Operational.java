package BankingProjectWithDDTAndKDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operational {
	
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
        driver.get("https://demo.guru99.com/");
    }
    
	//Create object of Read Excel Class
	ReadExcelClass rec = new ReadExcelClass();
    
	public void clickBankProject(WebDriver driver) {
		driver.findElement(By.linkText("Bank Project")).click();
	}
	
    public void username(WebDriver driver,String username)
    {
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
    }
    
    public void password(WebDriver driver,String password)
    {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
    
    public void loginButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    } 
   
    public void clickOnNewCustomer(WebDriver driver) {
    	driver.findElement(By.linkText("New Customer")).click();
    }

	/*
	 * public void addNewCustomer() {
	 * 
	 * }
	 */
    
    
    public void logout(WebDriver driver)
    {
        driver.findElement(By.partialLinkText("Log Out")).click();
    }
    
    public void closeBrowser(WebDriver driver)
    {
        driver.close();
    }

}
