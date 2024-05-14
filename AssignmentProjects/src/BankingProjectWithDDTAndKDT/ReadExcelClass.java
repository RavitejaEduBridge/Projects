package BankingProjectWithDDTAndKDT;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadExcelClass {
	
	public void readExcel(WebDriver driver) throws Exception {
			// Create object of FileInputStream >> To store Excel Path
			FileInputStream file = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\ProjectDetails.xlsx");
			// Create object of XSSFWorkbook
			XSSFWorkbook w = new XSSFWorkbook(file);
			// Create object of XSSFSheet
			XSSFSheet sheet01 = w.getSheet("DDT");
				
			// Store number of rows >> end rang for loop
			int rowSize=sheet01.getLastRowNum();
			System.out.println("No of credentials: "+rowSize);
			
			String username = sheet01.getRow(1).getCell(0).getStringCellValue();
			String password = sheet01.getRow(1).getCell(1).getStringCellValue();
		
			Operational o = new Operational();
			o.maximizeBrowser(driver);
			o.deleteCookies(driver);
			o.url(driver);
			o.clickBankProject(driver);
			/*
			 * System.out.println("step1"); Thread.sleep(2000); WebElement iframe =
			 * driver.findElement(By.xpath("//iframe[@name='ad_iframe']"));
			 * System.out.println("step2"); Thread.sleep(2000);
			 * driver.switchTo().frame(iframe); System.out.println("step3");
			 * Thread.sleep(2000);
			 */
			//driver.findElement(By.xpath("//form[@name='frmLogin']"));
			
			/*
			 * driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
			 * driver.switchTo().defaultContent();
			 */
			
			o.username(driver, username);
			o.password(driver, password);
			o.loginButton(driver);
			o.clickOnNewCustomer(driver);
			
			// Create object of XSSFSheet
			XSSFSheet sheet02 = w.getSheet("CustomerDetails");
			String customerName = sheet02.getRow(1).getCell(1).getStringCellValue();
			driver.findElement(By.name("name")).sendKeys(customerName);
			driver.findElement(By.xpath("//input[@name='rad1'][1]")).click();
			String dob = sheet02.getRow(3).getCell(1).getStringCellValue();
			driver.findElement(By.id("dob")).sendKeys(dob);
			String address = sheet02.getRow(4).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(address);
			String city = sheet02.getRow(5).getCell(1).getStringCellValue();
			driver.findElement(By.name("city")).sendKeys(city);
			String state = sheet02.getRow(6).getCell(1).getStringCellValue();
			driver.findElement(By.name("state")).sendKeys(state);
			String pin = sheet02.getRow(7).getCell(1).getStringCellValue();
			driver.findElement(By.name("pinno")).sendKeys(pin);
			String telnumber = sheet02.getRow(8).getCell(1).getStringCellValue();
			driver.findElement(By.name("telephoneno")).sendKeys(telnumber);
			String email = sheet02.getRow(9).getCell(1).getStringCellValue();
			driver.findElement(By.name("emailid")).sendKeys(email);
			driver.findElement(By.name("sub")).click();
			
			
			WebElement response = driver.findElement(By.xpath("//body"));
			String responseText = response.getText();
			System.out.println(responseText);
			
			o.closeBrowser(driver);
	}
	
}
