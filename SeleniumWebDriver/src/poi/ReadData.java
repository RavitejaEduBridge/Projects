package poi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main(String[] args) throws Exception {
	
		//Step 1: Create object of FileInputStream >> To Store file path 
		FileInputStream file = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		
		//Step 2: Create object XSSFaWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		//Step 3: Create XSSFSheet 
		//sn = wb.getSheet("ReadMultipleData");
		
		//OR
		//XSSFSheet sn = wb.getSheetAt(1); //Note: Sheet need to import -> import org.apache.poi.ss.usermodel.sheet; 
		XSSFSheet sn = wb.getSheet("ReadData");
		
		int rowSize = sn.getLastRowNum();
		System.out.println("No of rows: "+rowSize);
		
		//Step 4: Create variables >> To store data from excel sheet
		String a= sn.getRow(0).getCell(0).getStringCellValue();
		String b=sn.getRow(0).getCell(1).getStringCellValue();
		int c=  (int) sn.getRow(0).getCell(2).getNumericCellValue();
		
		//Step 5: Display Data
		System.out.println(a+"\t"+b+"\t"+c);
		//System.out.println(a+"\t"+b);
}
}
