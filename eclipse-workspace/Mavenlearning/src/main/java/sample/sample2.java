package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.extractor.MainExtractorFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample2 {
	
	 public void excel() throws IOException{
		 File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenlearning\\excel new\\excel.java.xlsx");
		 FileInputStream fileInputStream=new FileInputStream(file); 
				 Workbook workbook=new XSSFWorkbook(fileInputStream);
				 Sheet sheet = workbook.getSheet("login");
				 
//				 Iterator<Row> iterator = sheet.iterator();
//				for (int  i=0; iterator.hasNext(); i++) {
//						Row row = iterator.next();
//						Iterator<Cell> cell = row.iterator();
//						for (int j = 0;  cell.hasNext(); j++) {
//							Cell cellvalue = cell.next();
//							System.out.println(cellvalue);
//						} }
				
	 
	 Iterator<Row> row2 = sheet.iterator();
	 while (row2.hasNext()) {
		 Row rowvalue = row2.next();
		 
		 Iterator<Cell> cell2 = rowvalue.iterator();
		 while (cell2.hasNext()) {
			Cell cellvalue = cell2.next();
			System.out.println(cellvalue);
		}
		
	}
	 
	 
	 
	 
	 
	 
	 }
					public static void main(String[] args) throws IOException {
						sample2 san=new sample2();
						san.excel();
						
					}
					
				
		 
	 
				 }

