package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingBasicLocators {

	public static void main(String[] args) throws InterruptedException {
		
		//Note: Locators
		// 1. ID: 
		// 2. Name: 
		// 3. ClassName: 
		// 4. Link Text:
		//5. Partial Link Text: driver.findElement(By.partialLinkText(""))
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//URL
		driver.get("https://www.saucedemo.com/");
		
		//UserName
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Login Button
		driver.findElement(By.id("login-button")).click();
		
		//Three Lines
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("logout_sidebar_link")).click();     	Using ID
		//driver.findElement(By.linkText("Logout")).click();				Using Link Text
		driver.findElement(By.partialLinkText("Log")).click();
		System.out.println("clicked logout");
		//Close Browser
		//driver.close();
		

	}

}
