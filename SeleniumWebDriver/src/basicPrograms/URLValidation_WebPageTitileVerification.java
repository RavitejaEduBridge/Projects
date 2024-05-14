package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLValidation_WebPageTitileVerification {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.edubridgeindia.com/login");
		
		//URL Validation
		String expectedURL="https://www.edubridgeindia.com/login";
		String actualURL=driver.getCurrentUrl();
		
		
		if(expectedURL.equals(actualURL)) 
		{
			System.out.println("URL Validation Passed.");
		}
		
		else 
		{
			System.out.println("URL Validation Failed.");	
		}
		
		//WebPage Title Validation
		String expectedTitle="EduBridge Learning";
		String actualTitle=driver.getTitle();
		
		System.out.println("Expected Title is: "+expectedTitle);
		System.out.println("Actual Title is: "+actualTitle);
		
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Title Validation Passed.");
		}
		
		else 
		{
			System.out.println("Title Validation Failed.");	
		}
		
		driver.close();
	}

}
