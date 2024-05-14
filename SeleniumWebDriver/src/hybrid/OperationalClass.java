package hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationalClass {

	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}
	
	public void enterURL(WebDriver driver) {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	public void enterUsername(WebDriver driver, String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	}
	
	public void enterPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
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
