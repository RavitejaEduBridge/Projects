package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_BlazeDemo {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Select s; //Global Declaration
				
			driver.get("https://www.blazedemo.com");
			Thread.sleep(2000);
			
			//Dropdown 1: TagName must be <Selected>
			//step 1: Create object for select class
			Select s1 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
			
			//step 2: Select option
			//s1.selectByIndex(4);
			s1.selectByValue("San Diego");
			//s1.selectByVisibleText("San Diego");
			Thread.sleep(2000);
			
			//Dropdown 2: TagName must be <Selected>
			//Step 1: Create object for select class
			Select s2 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
			//step 2: Select option
			//s2.selectByIndex(4);
			//s2.selectByValue("New York");
			s2.selectByVisibleText("New York");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			driver.close();
			System.out.println("Chrome Browser Closed");
		}
}
