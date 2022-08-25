package framework;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createSheet {
	public static void main(String[] args) throws IOException {
		//to create a new sheet on desired location 
		File f = new File("C:\\Users\\HP\\OneDrive\\Pictures\\excell sheet\\Gilli.xlsx");
		//to define which kind of excell it is
		Workbook book = new XSSFWorkbook();
		//to create a new sheet 
		Sheet createSheet = book.createSheet("gilli");
		//to create a new row
		createSheet.createRow(0).createCell(0).setCellValue("ganesh");
		createSheet.createRow(1).createCell(0).setCellValue("raina");
		createSheet.createRow(0).createCell(1).setCellValue("password");
		// get this data into excell sheet
		FileOutputStream out = new FileOutputStream(f);
		book.write(out);

	}

}
