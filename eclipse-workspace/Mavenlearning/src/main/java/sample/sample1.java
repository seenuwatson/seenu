package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import freemarker.template.utility.DateUtil;
public class sample1 {
	


	public static void main(String[] args) throws  IOException {
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenlearning\\excel new\\excel.java.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("login");
		
		Row row = sheet.getRow(3);
		
		
		Cell cell = row.getCell(3);
		//CellType cellType = cell.getCellType();
		
//		if (DateUtil.isCellDateFormatted(cell)) {
//		 Date dateCellValue = cell.getDateCellValue();
//		 
//		 SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MM-YY");
//		 String format = dateFormat.format(dateCellValue);
//		 
//		 System.out.println(format);
//			
//		} else {

		
	   double numericCellValue = cell.getNumericCellValue();
	   BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
	   String string = valueOf.toString();
		System.out.println(string);
	//	}
		
		 {
			
		}
				
		
}}