package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testing {
	public static void main(String[] args) throws IOException {
		//to locate the excel file
		File f = new File("C:\\Users\\HP\\OneDrive\\Documents\\sample table.xlsx");

		//to get the file from given location
		FileInputStream stream = new FileInputStream(f);

		//to get the file to our desired format
		Workbook book = new XSSFWorkbook(stream);

		//to get the sheet from the workbook
		Sheet sheet = book.getSheet("ganesh");

		//		//to get row from the sheet
		//		Row row = sheet.getRow(3);
		//
		//		//to get the cell from the row
		//		Cell cell = row.getCell(1);
		//
		//		//to get values from the cell
		//		String stringCellValue = cell.getStringCellValue();
		//		System.out.println(stringCellValue);

		//to get whole value from the table
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue);
					break;

				default:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy");
						String format = dateFormat.format(dateCellValue);
						System.out.print(format);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						//to change double to long using type casting
						long b = (long)numericCellValue;
						System.out.print(b);
						break;
					}
					System.out.print("   ");
				}
				System.out.println();

			}

		}

	}
}
