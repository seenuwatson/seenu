package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {
	public static void main(String[] args) throws IOException {

		
		File file=new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Mavenlearning\\\\excel new\\\\excel.java.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("login");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			 Row row = sheet.getRow(i);
			 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				 Cell cell = row.getCell(j);
				 System.out.println(cell);
				 
				
			}
			
		}
	
	
//		Iterator<Row> row = sheet.iterator();
//		for (int i = 0;  row.hasNext(); i++) {
//			Row rowvalue = row.next();
//			
//			Iterator<Cell> cell = rowvalue.iterator();
//			for (int j = 0;  cell.hasNext(); j++) {
//				Cell cellvalue = cell.next();
//				System.out.println(cellvalue);
//			}
//			
//		}
		
		
//		
//		Iterator<Row> row = sheet.iterator();
//		while (row.hasNext()) {
//			Row next = row.next();
//			
//			Iterator<Cell> cell = next.iterator();
//			while (cell.hasNext()) {
//				Cell next3 = cell.next();
//				System.out.println(next3);
//			}
		
		}
		
		
		}


