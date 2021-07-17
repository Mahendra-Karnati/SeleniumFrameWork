package TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageObjectModel;

public class testOfPageObjectModel {
	static WebDriver driver=null;
	public static void main(String[] args) {
	goggleSearchTest();

	}
public static void goggleSearchTest(){
	WebDriverManager.chromedriver().setup();//we can use WebDriverManager.chromedriver().version("2.46").setup() for the choosing of version you want.
	 driver=new ChromeDriver();
	PageObjectModel pbm=new PageObjectModel(driver);
	pbm.textBoxSearch("mail");
	pbm.searchButton();
	driver.close();
}

}
