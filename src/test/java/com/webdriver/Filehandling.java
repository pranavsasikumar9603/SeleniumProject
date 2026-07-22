package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filehandling {
	
	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Strawhats.xlsx");
		
		FileInputStream Fin = new FileInputStream(f);
		
		Workbook workbook = new XSSFWorkbook(Fin);
		
		Sheet sheet = workbook.getSheetAt(0);
		
//		Row newrow = sheet.createRow(4);     // write
//		
//		newrow.createCell(0).setCellValue("Jinbei");
//		newrow.createCell(1).setCellValue("Helsman");
//		newrow.createCell(2).setCellValue("1700000");
		
		sheet.getRow(4).getCell(0).setCellValue("Nami");
		sheet.getRow(4).getCell(1).setCellValue("Navigator");
		sheet.getRow(4).getCell(2).setCellValue("600000");

		
		FileOutputStream Fout = new FileOutputStream(f);
		
		workbook.write(Fout);
		
		System.out.println("New member updated");
		
		

		
//		int rowsize = sheet.getLastRowNum();   //read
//		
//		System.out.println("Rowsize:"+rowsize);
//		
//		for(int i=0;i<=rowsize;i++) {
//			
//			Row row = sheet.getRow(i);
//			
//			int colsize = row.getLastCellNum();
//			
//			for(int j=0;j<colsize;j++) {
//				
//				if(row.getCell(j).getCellType()==CellType.NUMERIC) {
//					
//					System.out.println((long)row.getCell(j).getNumericCellValue()+"");
//				}
//				else {
//				
//					System.out.print(row.getCell(j).toString()+"|");
//				}
//				
//			}
//			
//			System.out.println();
//		}
		
		workbook.close();
		
		Fin.close();
		
	}

}
