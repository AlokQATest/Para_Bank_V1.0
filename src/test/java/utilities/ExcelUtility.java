package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	FileInputStream file;
	FileOutputStream fileOut;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String path;
	
	public ExcelUtility(String path) {
		this.path = path;
	}
	
	public int getRowCount(String sheetName) throws IOException {
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		file.close();
		return rowCount;
	}
	
	public int getCellCount(String sheetName, int rowNum) throws IOException {
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		workbook.close();
		file.close();
		return cellCount;
	
	}
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException{
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		DataFormatter df = new DataFormatter();
		String data;
		try {
		data = df.formatCellValue(cell);
		
		}catch(Exception e){
			return "";
		}
		workbook.close();
		file.close();
		
		return data;
		
	}
}
