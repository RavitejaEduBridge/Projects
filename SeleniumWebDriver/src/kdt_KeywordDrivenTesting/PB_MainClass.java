package kdt_KeywordDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB_MainClass {
	
	public static void main(String[] args) throws Exception {
				
				//Launch Browser
				System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//Create object of Read Excel Class
				PB_ReadExcelClass pbrec = new PB_ReadExcelClass();
				
				//Calling method
				pbrec.readExcel(driver);
				System.out.println("Completed Execution");
				
				
	}

}
