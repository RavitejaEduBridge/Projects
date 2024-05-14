package testNGFunctionalities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultiTestClass_DDTUsingDataProvider {
  
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	  }
	  
	@Test(dataProvider = "dp") // Main method
  public void f(String username, String passsword) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("username");;
		driver.findElement(By.id("password")).sendKeys("passsword");;
		driver.findElement(By.id("login-button")).click();;
		driver.findElement(By.id("react-burger-menu-btn")).click();;
		driver.findElement(By.id("logout_sidebar_link")).click();;
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
	  new Object[] { "locked_out_user", "secret_sauce" }, 
	  new Object[] {"problem_user", "secret_sauce" }, 
	  new Object[] { "performance_glitch_user","secret_sauce" }, 
	  new Object[] { "error_user", "secret_sauce" }, 
	  new Object[] { "error_user", "secret_sauce" },
			 
    };
  }

  @AfterTest
  public void afterTest() {
	 //driver.close();
  }

}
