package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for GoogleChrome Browser.\nEnter 2 for MicrosoftEdge Browser.");
		int input = s.nextInt();
		switch(input)
		{
		case 1:
			System.out.println("***Welcome to Google Chrome***");
			System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case 2:
			System.out.println("***Welcome to Microsoft Edge***");
			System.setProperty("webdriver.edge.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		
			default: System.out.println("Invalid Selection");
		}
		
		//URL
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//Search-Box
		driver.findElement(By.id("APjFqb")).sendKeys("What is selenium??");
		Thread.sleep(3000);
		//Search-Button
		//driver.findElement(By.id("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[7]/center/input[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println("Done");
		driver.close();

	}

}
