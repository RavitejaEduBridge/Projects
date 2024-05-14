package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh = wb.createSheet("WriteData");
		//XSSFSheet sh = wb.getSheet("WriteData");
		
		//Create Row
		XSSFRow r1 = sh.createRow(0);
		r1.createCell(0).setCellValue("Learner Name");
		r1.createCell(1).setCellValue("ID");
		r1.createCell(2).setCellValue("Email");
		
		XSSFRow r2 = sh.createRow(2);
		r2.createCell(0).setCellValue("Ana");
		r2.createCell(1).setCellValue("101");
		r2.createCell(2).setCellValue("ana@gmail.com");
		
		XSSFRow r3 = sh.createRow(4);
		r3.createCell(0).setCellValue("John");
		r3.createCell(1).setCellValue("102");
		r3.createCell(2).setCellValue("John@gmail.com");
		
		XSSFRow r4 = sh.createRow(6);
		r4.createCell(0).setCellValue("Leela");
		r4.createCell(1).setCellValue("103");
		r4.createCell(2).setCellValue("leela@gmail.com");
		
		FileOutputStream out = new FileOutputStream("D:\\Raviteja\\Training & Education\\EduBridge\\Automation Testing\\POIData.xlsx");
		wb.write(out);
		
		System.out.println("Execute the program");
	}
}
