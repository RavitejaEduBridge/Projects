package pom_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Create object of POM Class
		SwagLabs_POM sp = new SwagLabs_POM();
		
		//Calling methods
		sp.maximizeBrowser(driver);
		sp.deleteCoockies(driver);
		sp.url(driver);
		sp.username(driver, "standard_user");
		sp.password(driver, "secret_sauce");
		sp.loginButton(driver);
		sp.threeLines(driver);
		Thread.sleep(2000);
		sp.logout(driver);
		sp.closeBrowser(driver);
		
		System.out.println("Chrome Browser Closed");
		
	}
	
}
