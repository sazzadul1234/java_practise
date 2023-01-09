package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) throws IOException {
		
		File xl = new File("H:\\user.xlsx");
		
		FileInputStream fis = new FileInputStream(xl); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 =  wb.getSheetAt(0);
		
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("The 1st user name is " + data);
		
		// https://www.youtube.com/watch?v=sbBdj4zIMqY
	}

}
