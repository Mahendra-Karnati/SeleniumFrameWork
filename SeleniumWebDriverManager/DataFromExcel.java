package excelPackage;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataFromExcel {
	XSSFWorkbook workbook;
	XSSFSheet sheet ;
	public DataFromExcel(String excelPath,String sheetName ){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

	public  void getRowCount() {
		int n =sheet.getPhysicalNumberOfRows();	
		System.out.println(n);
	}

	public  void getCellData(int rowNum,int colNum) {
		String sheetData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(sheetData);
	}
	public void getNumericNumber(int rowNum,int colNum) {
		double num=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(num);
	}
}



