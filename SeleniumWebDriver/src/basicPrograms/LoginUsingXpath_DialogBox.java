package basicPrograms;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingXpath_DialogBox {
	//Note: 
	//X-path: XML (Extensible Mark up Language) path
	//It is used to navigate nodes in any XML / HTML documents 
	//Types of X-Path:
		//i) Absolute X-path: Starts with '/' and shows Root Path.
		//ii) Relative X-path : Starts with '//' and shows CURRENT Path. Syntax: //TagName[@Propert='Value']
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter Username");
		 * String un = sc.next();
		 * 
		 * System.out.println("Enter Password"); String pwd = sc.next();
		 */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		String un=JOptionPane.showInputDialog("Enter Username: ");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		Thread.sleep(2000);
		String pwd=JOptionPane.showInputDialog("Enter Password: ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();     
		
		System.out.println("clicked logout");
		Thread.sleep(2000);
		//Close Browser
		driver.close();
	}
}
