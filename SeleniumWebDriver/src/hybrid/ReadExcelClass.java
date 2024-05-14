package hybrid;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadExcelClass {

	public void readExcel(WebDriver driver) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Hybrid");
		
		int keyWordRowCount = sh.getLastRowNum();
		System.out.println("No of Keywords: "+keyWordRowCount);
		
		int usernameRowCount = sh.getLastRowNum();
		System.out.println("No of Usernames: "+usernameRowCount);
		
		int passwordRowCount = sh.getLastRowNum();
		System.out.println("No of Passwords: "+passwordRowCount);
		
		OperationalClass oc = new OperationalClass();
		
		for (int i=1; i<=usernameRowCount; i++) //DDT
		{
			String username = sh.getRow(i).getCell(1).getStringCellValue();
			String password = sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Username: "+username+"\t"+"Password: "+password);
			
			try //Processing >> Login
				{
				for(int j=1; j<=keyWordRowCount; j++) //KDT
				{
				String keyword = sh.getRow(j).getCell(0).getStringCellValue();
				//System.out.println("Keyword: "+keyword);
				
				if(keyword.equals("MaximizeBrowser")) {
					oc.maximizeBrowser(driver);
					System.out.println(keyword);
				}
				else if(keyword.equals("DeleteAllCookies")){
					oc.deleteAllCookies(driver);
					System.out.println(keyword);
				}
				else if(keyword.equals("EnterURL")){
					oc.enterURL(driver);
					System.out.println(keyword);
				}
				else if(keyword.equals("EnterUsername")){
					oc.enterUsername(driver, username);
					System.out.println(keyword);
				}
				else if(keyword.equals("EnterPassword")){
					oc.enterPassword(driver, password);
					System.out.println(keyword);
				}
				else if(keyword.equals("ClickOnLoginButton")){
					oc.clickOnLoginButton(driver);
					System.out.println(keyword);
				}
				else if(keyword.equals("ClickOnRequestLoan")) {
					driver.findElement(By.linkText("Request Loan")).click();
					System.out.println(keyword);
				}
				else if(keyword.equals("EnterLoanAmount")) {
					driver.findElement(By.id("amount")).sendKeys("100");
					System.out.println(keyword);
				}
				else if(keyword.equals("EnterDownPayment")) {
					driver.findElement(By.id("downPayment")).sendKeys("10");
					System.out.println(keyword);
				}
				else if(keyword.equals("SelectFromAccount")) {
					Thread.sleep(2000);
					Select s = new Select(driver.findElement(By.id("fromAccountId")));
					s.selectByIndex(0);
				}
				else if(keyword.equals("ClickOnApplyNow")) {
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					System.out.println(keyword);
				}
				else if(keyword.equals("ClickLogoutButton")) {
					oc.logout(driver);
					System.out.println(keyword);
				}
				else if(keyword.equals("CloseBrowser")){
					Thread.sleep(2000);
					oc.closeBrowser(driver);
					System.out.println(keyword);
					System.out.println("Valid Credentials. ");
					System.out.println("");
					sh.getRow(i).createCell(3).setCellValue("Valid Credentials");
				}
				}
				}
			catch(Exception e) {
				System.out.println("InValid Credentials");
				System.out.println("");
				sh.getRow(i).createCell(3).setCellValue("InValid Credentials");
			}
		}
		FileOutputStream fos = new FileOutputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		wb.write(fos);
		fos.close();
	}
	
	
}
