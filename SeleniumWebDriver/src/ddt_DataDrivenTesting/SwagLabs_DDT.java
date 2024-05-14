package ddt_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PageObjectModel.SwagLabs_POM;

public class SwagLabs_DDT {

		public static void main(String[] args) throws IOException, TimeoutException {
			
			//Create object of FileInputStream >> To store excel sheet's path
			FileInputStream file = new FileInputStream ("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\TestData.xlsx");
		
			//create object XSSF Workbook
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			//create object of XSSFSheet
			XSSFSheet sh = workbook.getSheet("DDT"); 
			
			//To store row size
			int rowSize=sh.getLastRowNum();
			System.out.println("No of Rows are: "+rowSize);
			
			//Launch Browser
			System.setProperty("webdriver.chrome.driver", "D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Create object of POM Class
			SwagLabs_POM slpom = new SwagLabs_POM();
			
			//loop
			for(int i=1; i<=rowSize; i++) {
				//Create variables>> To test data from excel sheet
				String username01 = sh.getRow(i).getCell(0).getStringCellValue();
				String password01 = sh.getRow(i).getCell(1).getStringCellValue();
				//Display Test Data on console
				System.out.println(username01+"\t\t"+password01);
				//To Handle exception >> Positive+Negative Testing
				try {
					//Login
					slpom.maximizeBrowser(driver);
					slpom.deleteCoockies(driver);
					slpom.url(driver);
					//Updating Test-Result on console
					Thread.sleep(500);
					slpom.username(driver, username01);
					Thread.sleep(500);
					slpom.password(driver, password01);
					Thread.sleep(500);
					slpom.loginButton(driver);
					Thread.sleep(500);
					slpom.threeLines(driver);
					Thread.sleep(500);
					slpom.logout(driver);
					
					//Updating Test-Result on Console
					System.out.println("Valid Credential");
					System.out.println("");
					//Updating Test-Result in ExcelSheet
					sh.getRow(i).createCell(2).setCellValue("Valid Credential");
				}		
					catch (Exception e) {
						//System.out.println(e);
						System.out.println("Invalid Credential");	
						System.out.println("");
						sh.getRow(i).createCell(2).setCellValue("Invalid Credential");
				}
		}	
			FileOutputStream out = new FileOutputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\TestData.xlsx");
			workbook.write(out);
			
			workbook.close();
			slpom.closeBrowser(driver);	
			System.out.println("Chrome Browser Closed");
	}	
}
