package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {

	public static void main(String[] args) throws IllegalStateException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		//XSSFSheet sn = wb.getSheet("ReadMultipleData");
		//OR
		XSSFSheet sn = wb.getSheetAt(2); //Note: Sheet need to import -> import org.apache.poi.ss.usermodel.sheet; 
		
		int rowSize = sn.getLastRowNum();
		System.out.println("No of rows: "+rowSize);
		
		for(int i=1; i<=rowSize; i++) {
			String name=sn.getRow(i).getCell(0).getStringCellValue();
			String location=sn.getRow(i).getCell(1).getStringCellValue();
			double percentage = sn.getRow(i).getCell(2).getNumericCellValue();
								
			System.out.println(name+"\t\t"+location+"\t\t"+percentage);
		}
		
		
	}
}

















