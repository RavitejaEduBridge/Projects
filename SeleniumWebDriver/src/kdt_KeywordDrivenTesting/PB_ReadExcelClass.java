package kdt_KeywordDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PB_ReadExcelClass {

	public void readExcel(WebDriver driver) throws Exception {
		
	FileInputStream fis = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("KDT");
	
	int rowSize=sh.getLastRowNum();
	System.out.println("No of Keywords: "+rowSize);
	
	PB_OperationalClass pbo = new PB_OperationalClass();
	
	for(int i=1; i<=rowSize; i++) {
		String key = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(key);
	
	if(key.equals("MaximizeBrowser")) {
		pbo.maximizeBrowser(driver);
	}
	else if(key.equals("DeleteAllCookies")) {
		pbo.deleteCookies(driver);
	}
	else if(key.equals("URL")) {
		pbo.url(driver);
	}
	else if(key.equals("EnterUsername")) {
		pbo.username(driver, "RavitejaBJ");
	}
	else if(key.equals("EnterPassword")) {
		pbo.password(driver, "Raviteja@2016");
	}
	else if(key.equals("ClickOnLoginButton")) {
		pbo.loginButton(driver);
	}
	else if(key.equals("ClickOnRequestLoan")) {
		driver.findElement(By.linkText("Request Loan")).click();
	}
	else if(key.equals("EnterLoanAmount")) {
		driver.findElement(By.id("amount")).sendKeys("100");
	}
	else if(key.equals("EnterDownPayment")) {
		driver.findElement(By.id("downPayment")).sendKeys("10");
	}
	else if(key.equals("SelectFromAccount")) {
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("fromAccountId")));
		s.selectByIndex(0);
	}
	else if(key.equals("ClickOnApplyNow")) {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	else if(key.equals("ClickLogoutButton")) {
		pbo.logout(driver);
	}
	else if(key.equals("CloseBrowser")){
		Thread.sleep(2000);
		pbo.closeBrowser(driver);
	}
	
   }
	
  }
	
}
