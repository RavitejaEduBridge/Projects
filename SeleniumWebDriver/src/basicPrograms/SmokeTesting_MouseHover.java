package basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SmokeTesting_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//***Mouse Hover***
		//Step 1: Create object of Action class 
		Actions a = new Actions(driver);
		
		//step 2: Create list with WebElement
		List<WebElement> ls = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
		
		//Step 3: Sorting list size 
		int size = ls.size();
		System.out.println("No of Elements: "+size);
		
		//Step 4: For Loop
		for (int i=1; i<=size; i++) {
			
			//wait
			Thread.sleep(2000);
			
			//Display Element Name
			System.out.println(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li["+i+"]")).getText());
			
			//Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li["+i+"]"))).click().perform();				
			
			System.out.println("Program Executed");
			driver.close();
		}
	}
}