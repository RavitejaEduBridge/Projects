package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingCSSSelector_Scanner {

	//Note: 
	//6. CSS Selector: Cascade Style Sheet
	//Syntax: TagName[Property='Value']
	//Example: driver.findElement(By.cssSelector("button[type='submit']"))
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String un = sc.next();
		
		System.out.println("Enter Password");
		String pwd = sc.next();
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(un);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();     
		
		
		System.out.println("clicked logout");
		Thread.sleep(2000);
		//Close Browser
		driver.close();

	}

}
