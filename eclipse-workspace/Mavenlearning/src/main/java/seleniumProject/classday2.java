package seleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class classday2 {
	public static void main(String[] args) throws IOException {
		// 1.mention the path of excel
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenlearning\\excel new\\excel.java.xlsx");
		
		//2. read the Objects / bytes from File ---> Fileinputstream class
		FileInputStream fileInputStream= new FileInputStream(file);
		
		//3.mention the workbook-->Collection of sheet
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		
		//4.get the sheet the name
		Sheet sheet = workbook.getSheet("login");
		
		//5.get the row details
		 Row row = sheet.getRow(3);
		
		//6.get the cell
		Cell cell = row.getCell(2);
		System.out.println(cell);
		
	}

}
