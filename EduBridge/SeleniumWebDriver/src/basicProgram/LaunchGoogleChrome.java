package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleChrome {
		//Note:
		//CTRL+Shift+O > To Import multiple packages at the same time.
	public static void main(String[] args) {
		
		//Launch Browser
		//Key: Browser Name > webdriver.chrome.driver / webdriver.gekco.driver / webdriver.firefox.driver
		//Value: BrowserExtension'Path
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		
		//Create object of WebDriver
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().deleteAllCookies();
		
		//URL
		w.get("https://www.facebook.com");
		
		
		
	}

}
