package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleChrome {

	//Note: 
	//CTRL+Shift+0 >> To Import multiple packages at the same time.
	
	public static void main(String[] args) {
		//Launch Browser 
		//Key: Browser Name> webdriver.chrome.driver/webdriver.gecko.driver/webdriver.edge.driver
		//Value: BrowserExtension'Path
		System.setProperty("webdriver.chrome.driver", "D:\\\\Raviteja\\\\Training & Education\\\\EduBridge\\\\Automation Testing\\\\Browser Extension\\\\chromedriver.exe");
		
		//Create object for Webdriver 
		WebDriver driver = new ChromeDriver();
		
		//URL
		driver.get("https://www.facebook.com");

	}

}
