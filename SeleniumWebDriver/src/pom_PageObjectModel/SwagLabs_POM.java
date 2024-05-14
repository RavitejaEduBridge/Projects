package pom_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabs_POM // Object Repository
	
{	
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void deleteCoockies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}
	
	public void url (WebDriver driver) {
	driver.get("https://www.saucedemo.com/");	
	}
	
	public void username (WebDriver driver, String un) {
		driver.findElement(By.id("user-name")).sendKeys(un);
	}
	
	public void password (WebDriver driver, String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	public void loginButton(WebDriver driver) {
		driver.findElement(By.id("login-button")).click();
		
	}
	
	public void threeLines(WebDriver driver) {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
	}
	
	public void logout(WebDriver driver) {
		driver.findElement(By.id("logout_sidebar_link")).click();	
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
}
