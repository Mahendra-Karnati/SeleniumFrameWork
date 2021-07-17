package DataDrivenFrameWork;
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

	public int getRowCount()throws Exception {
		int rowCount=sheet.getPhysicalNumberOfRows();	
		return rowCount;
	}
	public  int getColCount()throws Exception{
		int colCount =sheet.getRow(0).getPhysicalNumberOfCells();	
		return colCount;
	}
	public  String getCellData(int rowNum,int colNum){
		String sheetData=null;
		try {
			sheetData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sheetData;
		
	}
	/*public int getNumericNumber(int rowNum,int colNum) {
	int num=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return num;
	}
	*/
}



