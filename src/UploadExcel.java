import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class UploadExcel {
	private static final String FILE_NAME = "C:/Users/I066841/Desktop/myTest.xlsx";

	public static void main(String[] args) {
		UploadExcel.parseExcel(new File(FILE_NAME));
	}
	
	public static void parseExcel(File inputStream) {
		try {
			FileInputStream excelFile = new FileInputStream(inputStream);
			
//			int data = inputstream.read();
//			int i = excelFile.read();
			
//			System.out.println(i);
			
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();

			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();

				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
//					currentCell.get
					if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
						System.out.print(currentCell.getStringCellValue() + "||");
					} 
					else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						int i = (int) currentCell.getNumericCellValue();
						System.out.print(i + "||");
					}

				}
				
				
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
