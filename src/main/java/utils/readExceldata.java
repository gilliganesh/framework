package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExceldata {

	public static void main(String[] args)throws IOException {
		String filelocation = ".\test-data\\login-data.xlsx";
		XSSFWorkbook wkbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wkbook.getSheetAt(0);
		for (int i = 0; i < args.length; i++) {
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
			short cell = sheet.getRow(0).getLastCellNum();
			System.out.println(cell);
		}
		
	}

}






