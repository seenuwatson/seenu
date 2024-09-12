package seleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class classday4 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenlearning\\excel new\\excel.java.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		
		Sheet sheet = workbook.getSheet("login");
		//Iterate the all row 
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			//Iterate the all cell
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				// get the cell type text --->STRING num,decimal ---> NUMERIC 
				CellType Type = cell.getCellType();
				
		
	}

}
}}