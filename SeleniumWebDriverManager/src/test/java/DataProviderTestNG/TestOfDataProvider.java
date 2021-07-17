package DataProviderTestNG;
import DataDrivenFrameWork.DataFromExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOfDataProvider {
	WebDriver driver=null;
	@BeforeTest
	public void setBrowser() {
		WebDriverManager.chromedriver().setup();//we can use WebDriverManager.chromedriver().version("2.46").setup() for the choosing of version you want.
		 driver=new ChromeDriver();
		 
	}
	
	@Test(dataProvider="test1Data1")
	public void test1(String userName,String passWord) throws InterruptedException {
		System.out.println( userName+"  "+ passWord);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(userName);
		Thread.sleep(2000);
		driver.close();
		
	}
	@DataProvider(name="test1Data1")
	public Object[][] getData() throws Exception
	{
		String excelPath="C:\\Users\\RAJA MAHENDRA\\eclipse-workspace\\SeleniumWebDriverManager\\Excel\\excelData.xlsx";
		Object data2[][]=testData(excelPath,"Sheet1");
		return data2;
	}
	
	public Object[][] testData(String excelPath,String sheetName) throws Exception{
	DataFromExcel data=new DataFromExcel(excelPath, sheetName);
	int rowCont=data.getRowCount();
	int colCont=data.getColCount();
	Object data1[][]=new Object[rowCont][colCont];
	for (int i=0;i<rowCont;i++)
	{
		for(int j=0;j<colCont;j++) {
			String value=data.getCellData(i, j);
			data1[i][j]=value;
			//System.out.print(value+"  ");	
			
		}
		System.out.println();
	}
	return data1;
}
}

