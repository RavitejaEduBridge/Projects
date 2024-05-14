package ddt_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PageObjectModel.SwagLabs_POM;

public class SwagLabs_DDT01 {
	
	public static void main(String[] args) throws Exception {
	// Create object of FileInputStream >> To store Excel Path
		FileInputStream file = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		// Create object of XSSFWorkbook
		XSSFWorkbook w = new XSSFWorkbook(file);
		// Create object of XSSFSheet
		XSSFSheet sheet = w.getSheet("DDT");
		
		// Store number of rows >> end rang for loop
		int rowSize=sheet.getLastRowNum();
		System.out.println("No of credentials: "+rowSize);
		
		// Launch the browser 
		System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Create object of POM class >> Login Script
		SwagLabs_POM sw = new SwagLabs_POM();
		
		// For Loop >> Iterate multiple TestData(Credential)
		for(int i=1; i<=rowSize; i++) //DDT
		{
			//Read credential from Excel sheet & store in variables
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"\t\t"+password); //Display on console
			
			try // Exception
			{
				// Login Script
				sw.maximizeBrowser(driver);
				sw.deleteCoockies(driver);
				sw.url(driver);
				Thread.sleep(2000);
				sw.username(driver, username);
				sw.password(driver, password);
				sw.loginButton(driver);
				
				//Add 2 Products in cart
				Thread.sleep(2000);
				sw.threeLines(driver);
				Thread.sleep(2000);
				sw.logout(driver);
				System.out.println("Valid Credential."); //Test Result >> Console
				System.out.println("");
				sheet.getRow(i).createCell(2).setCellValue("Valid Credential."); // Test Result >> Excel
			} 
			catch (Exception e) 
			{
				System.out.println("Invalid Credential.");
				System.out.println("");
				sheet.getRow(i).createCell(2).setCellValue("Invalid Credential.");
			}
		}
		//To Update Test Result
		FileOutputStream out = new FileOutputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		w.write(out);
		
		//Close the browser
		sw.closeBrowser(driver);
		
		System.out.println("Program Executed");
	}
}