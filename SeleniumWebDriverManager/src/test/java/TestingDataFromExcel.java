import excelPackage.DataFromExcel;
public class TestingDataFromExcel {

	public static void main(String[] args) {
		DataFromExcel data=new DataFromExcel("C:\\Users\\RAJA MAHENDRA\\eclipse-workspace\\SeleniumWebDriverManager\\Excel\\excelData.xlsx", "Sheet1");
           data.getRowCount();
            data.getNumericNumber(1,1);
            data.getCellData(0,1);
	}

}
