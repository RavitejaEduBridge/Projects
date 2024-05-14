package kdt_KeywordDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class ReadExcelClass {
	
	public void readExcel(WebDriver driver) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\\\Raviteja\\\\Training & Education\\\\EduBridge\\\\Automation Testing\\\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("KDT");
		
		int rowSize=sh.getLastRowNum();
		System.out.println("No of Keywords: "+rowSize);
		
		OperationalClass o = new OperationalClass();
		
		for(int i=1; i<=rowSize; i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);
		
		if(key.equals("MaximizeBrowser")) {
			o.maximizeBrowser(driver);
		}
		else if(key.equals("DeleteAllCookies")) {
			o.deleteCookies(driver);
		}
		else if(key.equals("URL")) {
			o.url(driver);
		}
		else if(key.equals("EnterUsername")) {
			o.username(driver, "standard_user");
		}
		else if(key.equals("EnterPassword")) {
			o.password(driver, "secret_sauce");
		}
		else if(key.equals("ClickOnLoginButton")) {
			o.loginButton(driver);
		}
		else if(key.equals("AddProduct1")) {
			o.addItem1(driver);
		}
		else if(key.equals("AddProduct2")) {
			o.addItem2(driver);
		}
		else if(key.equals("AddProduct2")) {
			o.removItem2(driver);
		}
		else if(key.equals("ThreeLines")) {
			o.threeLines(driver);
		}
		else if(key.equals("Logout")) {
			o.logout(driver);
		}
		else if(key.equals("closeBrowser")){
			o.closeBrowser(driver);
		}
		}
	}
	
}
